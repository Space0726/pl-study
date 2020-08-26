        .global main

        .text
main:
        push    %rbx

        mov     $90, %ecx
        xor     %rax, %rax
        xor     %rbx, %rbx
        inc     %rbx
print:
        push    %rax
        push    %rcx

        mov     $format, %rdi
        mov     %rax, %rsi
        xor     %rax, %rax

        call    printf

        pop     %rcx
        pop     %rax

        mov     %rax, %rdx
        mov     %rbx, %rax
        add     %rdx, %rbx
        dec     %ecx
        jnz     print

        pop     %rbx
        ret
format:
        .asciz  "%20ld\n"
