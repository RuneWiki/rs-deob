package deob;

@ObfuscatedName("fe")
public class class157 {

    public class157() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("au.y(CII)C")
    public static char method599(char arg0, int arg1) {
        if (arg0 >= 192 && arg0 <= 255) {
            if (arg0 >= 192 && arg0 <= 198) {
                return 'A';
            }
            if (arg0 == 199) {
                return 'C';
            }
            if (arg0 >= 200 && arg0 <= 203) {
                return 'E';
            }
            if (arg0 >= 204 && arg0 <= 207) {
                return 'I';
            }
            if (arg0 >= 210 && arg0 <= 214) {
                return 'O';
            }
            if (arg0 >= 217 && arg0 <= 220) {
                return 'U';
            }
            if (arg0 == 221) {
                return 'Y';
            }
            if (arg0 == 223) {
                return 's';
            }
            if (arg0 >= 224 && arg0 <= 230) {
                return 'a';
            }
            if (arg0 == 231) {
                return 'c';
            }
            if (arg0 >= 232 && arg0 <= 235) {
                return 'e';
            }
            if (arg0 >= 236 && arg0 <= 239) {
                return 'i';
            }
            if (arg0 >= 242 && arg0 <= 246) {
                return 'o';
            }
            if (arg0 >= 249 && arg0 <= 252) {
                return 'u';
            }
            if (arg0 == 253 || arg0 == 255) {
                return 'y';
            }
        }
        if (arg0 == 338) {
            return 'O';
        } else if (arg0 == 339) {
            return 'o';
        } else if (arg0 == 376) {
            return 'Y';
        } else {
            return arg0;
        }
    }

    @ObfuscatedName("df.k(CII)I")
    public static int method2564(char arg0, int arg1) {
        int var2 = arg0 << 4;
        if (Character.isUpperCase(arg0) || Character.isTitleCase(arg0)) {
            char var3 = Character.toLowerCase(arg0);
            var2 = (var3 << 4) + 1;
        }
        return var2;
    }
}
