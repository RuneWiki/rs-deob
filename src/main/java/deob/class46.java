package deob;

import java.applet.Applet;
import java.awt.Desktop;
import java.awt.Desktop.Action;
import java.net.URI;
import java.net.URL;
import netscape.javascript.JSObject;

@ObfuscatedName("ak")
public class class46 {

    @ObfuscatedName("ak.y")
    public static Applet field416 = null;

    @ObfuscatedName("ak.c")
    public static String field415 = "";

    public class46() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("cv.y(Ljava/applet/Applet;Ljava/lang/String;B)V")
    public static void method1706(Applet arg0, String arg1) {
        field416 = arg0;
        if (arg1 != null) {
            field415 = arg1;
        }
    }

    @ObfuscatedName("iy.c(Ljava/lang/String;ZZI)V")
    public static void method4230(String arg0, boolean arg1, boolean arg2) {
        if (!arg1) {
            method2949(arg0, 3);
            return;
        }
        if (!arg2 && Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Action.BROWSE)) {
            try {
                Desktop.getDesktop().browse(new URI(arg0));
                return;
            } catch (Exception var4) {
            }
        }
        if (field415.startsWith("win") && !arg2) {
            method5053(arg0, 0, "openjs");
        } else if (field415.startsWith("mac")) {
            method5053(arg0, 1, "openjs");
        } else {
            method2949(arg0, 2);
        }
    }

    @ObfuscatedName("ep.n(Ljava/lang/String;II)Z")
    public static boolean method2949(String arg0, int arg1) {
        return method5053(arg0, arg1, "openjs");
    }

    @ObfuscatedName("ky.u(Ljava/lang/String;ILjava/lang/String;I)Z")
    public static boolean method5053(String arg0, int arg1, String arg2) {
        if (arg1 == 0) {
            try {
                if (!field415.startsWith("win")) {
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
            } catch (Throwable var12) {
                return false;
            }
        } else if (arg1 == 1) {
            try {
                Object var6 = class42.method650(field416, arg2, new Object[] { (new URL(field416.getCodeBase(), arg0)).toString() });
                return var6 != null;
            } catch (Throwable var13) {
                return false;
            }
        } else if (arg1 == 2) {
            try {
                field416.getAppletContext().showDocument(new URL(field416.getCodeBase(), arg0), "_blank");
                return true;
            } catch (Exception var14) {
                return false;
            }
        } else if (arg1 == 3) {
            try {
                Applet var9 = field416;
                JSObject.getWindow(var9).call("loggedout", (Object[]) null);
            } catch (Throwable var16) {
            }
            try {
                field416.getAppletContext().showDocument(new URL(field416.getCodeBase(), arg0), "_top");
                return true;
            } catch (Exception var15) {
                return false;
            }
        } else {
            throw new IllegalArgumentException();
        }
    }
}
