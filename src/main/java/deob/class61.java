package deob;

import java.applet.Applet;
import java.awt.Desktop;
import java.awt.Desktop.Action;
import java.net.URI;
import java.net.URL;
import netscape.javascript.JSObject;

@ObfuscatedName("bw")
public class class61 {

    @ObfuscatedName("bw.m")
    public static Applet field460 = null;

    @ObfuscatedName("bw.o")
    public static String field451 = "";

    public class61() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("fm.m(Ljava/applet/Applet;Ljava/lang/String;I)V")
    public static void method3273(Applet arg0, String arg1) {
        field460 = arg0;
        if (arg1 != null) {
            field451 = arg1;
        }
    }

    @ObfuscatedName("ae.o(Ljava/lang/String;ZZI)V")
    public static void method279(String arg0, boolean arg1, boolean arg2) {
        method3119(arg0, arg1, "openjs", arg2);
    }

    @ObfuscatedName("eb.q(Ljava/lang/String;ZLjava/lang/String;ZI)V")
    public static void method3119(String arg0, boolean arg1, String arg2, boolean arg3) {
        if (!arg1) {
            method4177(arg0, 3);
            return;
        }
        if (!arg3 && Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Action.BROWSE)) {
            try {
                Desktop.getDesktop().browse(new URI(arg0));
                return;
            } catch (Exception var5) {
            }
        }
        if (field451.startsWith("win") && !arg3) {
            method4177(arg0, 0);
            return;
        }
        if (field451.startsWith("mac")) {
            method136(arg0, 1, arg2);
            return;
        }
        method4177(arg0, 2);
    }

    @ObfuscatedName("iw.j(Ljava/lang/String;IB)Z")
    public static boolean method4177(String arg0, int arg1) {
        return method136(arg0, arg1, "openjs");
    }

    @ObfuscatedName("v.p(Ljava/lang/String;ILjava/lang/String;B)Z")
    public static boolean method136(String arg0, int arg1, String arg2) {
        if (arg1 == 0) {
            try {
                if (!field451.startsWith("win")) {
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
            } catch (Throwable var15) {
                return false;
            }
        } else if (arg1 == 1) {
            try {
                Applet var6 = field460;
                Object[] var7 = new Object[] { (new URL(field460.getCodeBase(), arg0)).toString() };
                Object var8 = JSObject.getWindow(var6).call(arg2, var7);
                return var8 != null;
            } catch (Throwable var16) {
                return false;
            }
        } else if (arg1 == 2) {
            try {
                field460.getAppletContext().showDocument(new URL(field460.getCodeBase(), arg0), "_blank");
                return true;
            } catch (Exception var17) {
                return false;
            }
        } else if (arg1 == 3) {
            try {
                Applet var12 = field460;
                JSObject.getWindow(var12).call("loggedout", (Object[]) null);
            } catch (Throwable var19) {
            }
            try {
                field460.getAppletContext().showDocument(new URL(field460.getCodeBase(), arg0), "_top");
                return true;
            } catch (Exception var18) {
                return false;
            }
        } else {
            throw new IllegalArgumentException();
        }
    }
}
