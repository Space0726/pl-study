        .global main

        .text
main:
        push    %r12
        push    %r13
        push    %r14

        cmp     $3, %rdi
        jne     error1

        mov     %rsi, %r12

        mov     16(%r12), %rdi
        call    atoi
        cmp     $0, %eax
        jl      error2
        mov     %eax, %r13d

        mov     8(%r12), %rdi
        call    atoi
        mov     %eax, %r14d

        mov     $1, %eax
check:
        test    %r13d, %r13d
        jz      gotit
        imul    %r14d, %eax
        dec     %r13d
        jmp     check
gotit:
        mov     $answer, %rdi
        movslq  %eax, %rsi
        xor     %rax, %rax
        call    printf
        jmp     done
error1:
        mov     $badArgumentCount, %edi
        call    puts
        jmp     done
error2:
        mov     $negativeExponent, %edi
        call    puts
done:
        pop     %r14
        pop     %r13
        pop     %r12
        ret

answer:
        .asciz  "%d\n"
badArgumentCount:
        .asciz  "Requires exactly two arguments\n"
negativeExponent:
        .asciz  "The exponent may not be negative\n"
