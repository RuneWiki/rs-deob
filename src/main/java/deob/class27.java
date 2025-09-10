package deob;

import java.applet.Applet;
import netscape.javascript.JSObject;

@ObfuscatedName("bt")
public class class27 {

	public class27() throws Throwable {
		throw new Error();
	}

	@ObfuscatedName("bt.af(Ljava/applet/Applet;Ljava/lang/String;I)V")
	public static void method396(Applet arg0, String arg1) throws Throwable {
		JSObject.getWindow(arg0).eval(arg1);
	}

	@ObfuscatedName("bt.aw(Ljava/applet/Applet;Ljava/lang/String;[Ljava/lang/Object;B)Ljava/lang/Object;")
	public static Object method401(Applet arg0, String arg1, Object[] arg2) throws Throwable {
		return JSObject.getWindow(arg0).call(arg1, arg2);
	}
}
