package deob;

import java.applet.Applet;
import java.awt.Desktop;
import java.awt.Desktop.Action;
import java.net.URI;
import java.net.URL;

@ObfuscatedName("aq")
public class class45 {

    @ObfuscatedName("aq.v")
    public static Applet field323 = null;

    @ObfuscatedName("aq.n")
    public static String field319 = "";

    public class45() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("di.v(Ljava/lang/String;ZZI)V")
    public static void method2094(String arg0, boolean arg1, boolean arg2) {
        if (!arg1) {
            method4366(arg0, 3);
            return;
        }
        if (!arg2 && Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Action.BROWSE)) {
            try {
                Desktop.getDesktop().browse(new URI(arg0));
                return;
            } catch (Exception var4) {
            }
        }
        if (field319.startsWith("win") && !arg2) {
            method4366(arg0, 0);
        } else if (field319.startsWith("mac")) {
            method1809(arg0, 1, "openjs");
        } else {
            method4366(arg0, 2);
        }
    }

    @ObfuscatedName("il.n(Ljava/lang/String;IB)Z")
    public static boolean method4366(String arg0, int arg1) {
        return method1809(arg0, arg1, "openjs");
    }

    @ObfuscatedName("cf.f(Ljava/lang/String;ILjava/lang/String;I)Z")
    public static boolean method1809(String arg0, int arg1, String arg2) {
        if (arg1 == 0) {
            try {
                if (!field319.startsWith("win")) {
                    throw new Exception();
                } else if (arg0.startsWith("http://") || arg0.startsWith("https://")) {
                    String var3 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
                    for (int var4 = 0; var4 < arg0.length(); var4++) {
                        if (var3.indexOf(arg0.charAt(var4)) == -1) {
                            throw new Exception();
                        }
                    }
                    Runtime.getRuntime().exec("cmd /c start \"j\" \"" + arg0 + "\"");
                    return true;
                } else {
                    throw new Exception();
                }
            } catch (Throwable var11) {
                return false;
            }
        } else if (arg1 == 1) {
            try {
                Object var6 = class43.method323(field323, arg2, new Object[] { (new URL(field323.getCodeBase(), arg0)).toString() });
                return var6 != null;
            } catch (Throwable var12) {
                return false;
            }
        } else if (arg1 == 2) {
            try {
                field323.getAppletContext().showDocument(new URL(field323.getCodeBase(), arg0), "_blank");
                return true;
            } catch (Exception var13) {
                return false;
            }
        } else if (arg1 == 3) {
            try {
                class43.method322(field323, "loggedout");
            } catch (Throwable var15) {
            }
            try {
                field323.getAppletContext().showDocument(new URL(field323.getCodeBase(), arg0), "_top");
                return true;
            } catch (Exception var14) {
                return false;
            }
        } else {
            throw new IllegalArgumentException();
        }
    }
}
