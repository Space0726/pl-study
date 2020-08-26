        .globl  main

        .text
main:
        dec     %rdi
        jz      nothingToAverage
        mov     %rdi, count
accumulate:
        push    %rdi
        push    %rsi
        mov     (%rsi, %rdi, 8), %rdi
        call    atoi
        pop     %rsi
        pop     %rdi
        add     %rax, sum
        dec     %rdi
        jnz     accumulate
average:
        cvtsi2sd sum, %xmm0
        cvtsi2sd count, %xmm1
        divsd   %xmm1, %xmm0
        mov     $format, %rdi
        mov     $1, %rax

        sub     $8, %rsp
        call    printf
        add     $8, %rsp

        ret

nothingToAverage:
        mov     $error, %rdi
        xor     %rax, %rax
        call    printf
        ret

        .data
count:  .quad   0
sum:    .quad   0
format: .asciz  "%g\n"
error:  .asciz  "There are no command line arguments to average\n"

