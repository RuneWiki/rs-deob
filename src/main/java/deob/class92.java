package deob;

import java.util.HashMap;
import java.util.Map;

@ObfuscatedName("dm")
public class class92 {

	@ObfuscatedName("dm.af")
	public static final Map field1287 = new HashMap();

	@ObfuscatedName("dm.aw")
	public static final class427 field1288 = new class427(1024);

	@ObfuscatedName("dm.at")
	public static final class442 field1284 = new class442();

	@ObfuscatedName("dm.ac")
	public static int field1285 = 0;

	public class92() throws Throwable {
		throw new Error();
	}

	@ObfuscatedName("dy.af(ILjava/lang/String;Ljava/lang/String;I)V")
	public static void method2825(int arg0, String arg1, String arg2) {
		method3264(arg0, arg1, arg2, null);
	}

	@ObfuscatedName("ew.aw(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V")
	public static void method3264(int arg0, String arg1, String arg2, String arg3) {
		class58 var4 = (class58) field1287.get(arg0);
		if (var4 == null) {
			var4 = new class58();
			field1287.put(arg0, var4);
		}
		class40 var5 = var4.method1979(arg0, arg1, arg2, arg3);
		field1288.method7940(var5, (long) var5.field268);
		field1284.method8191(var5);
		client.field526 = client.field405;
	}

	@ObfuscatedName("bj.at(III)Lbz;")
	public static class40 method1844(int arg0, int arg1) {
		class58 var2 = (class58) field1287.get(arg0);
		return var2.method1980(arg1);
	}

	@ObfuscatedName("ib.ac(IB)Lbz;")
	public static class40 method4349(int arg0) {
		return (class40) field1288.method7946((long) arg0);
	}

	@ObfuscatedName("lt.ap(IB)I")
	public static int method6413(int arg0) {
		class58 var1 = (class58) field1287.get(arg0);
		return var1 == null ? 0 : var1.method1986();
	}

	@ObfuscatedName("ir.aq(IB)I")
	public static int method4609(int arg0) {
		class40 var1 = (class40) field1288.method7946((long) arg0);
		if (var1 == null) {
			return -1;
		} else if (field1284.field5136 == var1.field5594) {
			return -1;
		} else {
			return ((class40) var1.field5594).field268;
		}
	}

	@ObfuscatedName("fz.ao(IS)I")
	public static int method3657(int arg0) {
		class40 var1 = (class40) field1288.method7946((long) arg0);
		if (var1 == null) {
			return -1;
		} else if (field1284.field5136 == var1.field5593) {
			return -1;
		} else {
			return ((class40) var1.field5593).field268;
		}
	}
}
