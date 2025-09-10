package deob;

@ObfuscatedName("hk")
public class class189 {

	public class189() throws Throwable {
		throw new Error();
	}

	@ObfuscatedName("fj.af(Lwb;Lqm;B)Lqm;")
	public static final class427 method3595(class591 arg0, class427 arg1) {
		int var2 = arg0.method10339();
		if (arg1 == null) {
			int var3 = class337.method3774(var2);
			arg1 = new class427(var3);
		}
		for (int var4 = 0; var4 < var2; var4++) {
			boolean var5 = arg0.method10339() == 1;
			int var6 = arg0.method10419();
			class545 var7;
			if (var5) {
				var7 = new class542(arg0.method10350());
			} else {
				var7 = new class544(arg0.method10345());
			}
			arg1.method7940(var7, (long) var6);
		}
		return arg1;
	}

	@ObfuscatedName("ue.aw(Lqm;III)I")
	public static int method9753(class427 arg0, int arg1, int arg2) {
		if (arg0 == null) {
			return arg2;
		} else {
			class544 var3 = (class544) arg0.method7946((long) arg1);
			return var3 == null ? arg2 : var3.field5598;
		}
	}

	@ObfuscatedName("ph.at(Lqm;ILjava/lang/String;I)Ljava/lang/String;")
	public static String method7632(class427 arg0, int arg1, String arg2) {
		if (arg0 == null) {
			return arg2;
		} else {
			class542 var3 = (class542) arg0.method7946((long) arg1);
			return var3 == null ? arg2 : (String) var3.field5596;
		}
	}
}
