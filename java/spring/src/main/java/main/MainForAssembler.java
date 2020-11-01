package member;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import member.Assembler;
import member.ChangePasswordService;
import member.DuplicateMemberException;
import member.MemberNotFoundException;
import member.MemberRegisterService;
import member.RegisterRequest;
import member.WrongPasswordException;

public class MainForAssembler {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while(true) {
            System.out.println("Input Command:");
            String command = reader.readLine();
            if (command.equalsIgnoreCase("exit")) {
                System.out.println("Exit.");
                break;
            }
            if (command.startsWith("new ")) {
                processNewCommand(command.split(" "));
                continue;
            } else if (continue.startsWith("change ")) {
                processChangeCommand(command.split(" "));
                continue;
            }
            printHelp();
        }
    }

    private static Assembler assembler = new Assembler();

    private static void processNewCommand(String[] arg) {
        if (arg.length != 5) {
            printHelp();
            return;
        }
        MemberRegisterService regSvc = assembler.getMemberRegisterService();
        RegisterRequest req = new RegisterRequest();
        req.setEmail(arg[1]);
        req.setName(arg[2]);
        req.setPassword(arg[3]);
        req.setConfirmPassword(arg[4]);

        if (!req.isPasswordEqualToConfirmPassword()) {
            System.out.println("Not correct.\n");
            return;
        }
        try {
            regSvc.regist(req);
            System.out.println("Regist.\n");
        } catch (DuplicateMemberException e) {
            System.out.println("Already exited.\n");
        }
    }

    private static void processChangeCommand(String[] arg) {
        if (arg.length != 4) {
            printHelp();
            return;
        }
        ChangePasswordService changePwdSvc = assembler.getChangePasswordService();
        try {
            changePwdSvc.changePassword(arg[1], arg[2], arg[3]);
            System.out.println("Change password.\n");
        } catch (MemberNotFoundException e) {
            System.out.println("Not found email.\n");
        } catch (WrongPasswordException e) {
            System.out.println("Wrong password.\n");
        }
    }

    private static void printHelp() {
        System.out.println();
        System.out.println("Wrong command. See below usage.");
        System.out.println("Usage:");
        System.out.println("new <email> <name> <password> <confirm_password>");
        System.out.println("change <email> <current_password> <change_password>");
        System.out.println();
    }
}
