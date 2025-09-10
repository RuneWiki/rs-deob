package deob;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

@ObfuscatedName("nk")
public class class340 {

	@ObfuscatedName("nk.af")
	public static final List field3894 = new ArrayList();

	@ObfuscatedName("nk.aw")
	public static ArrayList field3889 = null;

	@ObfuscatedName("nk.at")
	public static LinkedList field3896 = new LinkedList();

	@ObfuscatedName("nk.ac")
	public static ArrayList field3891 = new ArrayList(3);

	@ObfuscatedName("nk.as")
	public static ArrayList field3890 = new ArrayList(3);

	@ObfuscatedName("nk.al")
	public static ArrayList field3893 = new ArrayList();

	@ObfuscatedName("nk.au")
	public static int field3895 = 0;

	@ObfuscatedName("nk.ai")
	public static int field3897 = 0;

	@ObfuscatedName("nk.aa")
	public static int field3899 = 0;

	@ObfuscatedName("nk.am")
	public static int field3898 = 0;

	public class340() throws Throwable {
		throw new Error();
	}

	@ObfuscatedName("hs.af(Lpx;Lpx;Lpx;Ljava/util/ArrayList;I)Z")
	public static boolean method3942(class413 arg0, class413 arg1, class413 arg2, ArrayList arg3) {
		Statics.field3892 = arg0;
		Statics.field1766 = arg1;
		Statics.field5551 = arg2;
		field3889 = arg3;
		return true;
	}

	@ObfuscatedName("ha.aw(Lnn;I)V")
	public static void method3908(class346 arg0) {
		if (!field3894.contains(arg0)) {
			field3894.add(arg0);
		}
	}

	@ObfuscatedName("ke.at(Ljava/util/ArrayList;IIIIZI)V")
	public static void method5668(ArrayList arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
		if (arg0.isEmpty()) {
			return;
		}
		field3896.clear();
		field3893.clear();
		method6249(arg5);
		method6315(arg0, arg5);
		if (field3896.isEmpty()) {
			return;
		}
		method786(arg1, arg2, arg3, arg4);
		field3893.add(new class471(null));
		field3893.add(new class480(null, Statics.field3892, Statics.field1766, Statics.field5551));
		ArrayList var6 = new ArrayList();
		var6.add(new class475(new class477(null, 0, true, field3898)));
		if (field3891.isEmpty()) {
			field3893.add(new class474(null, field3899));
			field3893.add(new class479(null, var6));
			return;
		}
		ArrayList var7 = new ArrayList();
		var7.add(new class474(new class479(null, var6), field3899));
		ArrayList var8 = new ArrayList();
		Iterator var9 = field3891.iterator();
		while (var9.hasNext()) {
			class352 var10 = (class352) var9.next();
			var8.add(var10);
		}
		var7.add(new class474(new class476(new class473(null, var8), 0, false, field3897), field3895));
		field3893.add(new class479(null, var7));
	}

	@ObfuscatedName("lu.ac(IB)V")
	public static void method6334(int arg0) {
		if (field3891.isEmpty()) {
			return;
		}
		Iterator var1 = field3891.iterator();
		while (var1.hasNext()) {
			class352 var2 = (class352) var1.next();
			if (var2 != null) {
				var2.field4006 = arg0;
			}
		}
		class352 var3 = (class352) field3891.get(0);
		if (var3 != null && var3.field4013 != null && var3.field4013.method6579() && !var3.field4011) {
			var3.field4013.method6632(arg0);
			var3.field4003 = arg0;
		}
	}

	@ObfuscatedName("jg.ap(IIB)V")
	public static void method5500(int arg0, int arg1) {
		method786(arg0, arg1, 0, 0);
		field3890.clear();
		field3893.clear();
		if (field3891.isEmpty() || arg0 == 0 && arg1 == 0) {
			method5043();
			return;
		}
		field3893.add(new class474(null, field3895));
		field3893.add(new class476(null, 0, false, field3897));
		ArrayList var2 = new ArrayList();
		Iterator var3 = field3891.iterator();
		while (var3.hasNext()) {
			class352 var4 = (class352) var3.next();
			var2.add(var4);
		}
		field3893.add(new class473(null, var2));
	}

	@ObfuscatedName("ii.aq(I)Z")
	public static boolean method4623() {
		if (field3893.isEmpty()) {
			return field3891.isEmpty() || field3891.get(0) == null || ((class352) field3891.get(0)).field4013 == null ? false : ((class352) field3891.get(0)).field4013.method6579();
		} else {
			return true;
		}
	}

	@ObfuscatedName("gf.ao(IIIII)V")
	public static void method3815(int arg0, int arg1, int arg2, int arg3) {
		if (field3891.size() <= 1 || field3891.get(0) == null || !((class352) field3891.get(0)).field4013.method6579() || field3891.get(1) == null || !((class352) field3891.get(1)).field4013.method6579()) {
			return;
		}
		method786(arg0, arg1, arg2, arg3);
		field3893.add(new class472(null));
		ArrayList var4 = new ArrayList();
		var4.add(new class474(new class477(null, 1, false, field3898), field3899));
		var4.add(new class474(new class476(null, 0, false, field3897), field3895));
		field3893.add(new class479(null, var4));
		if (field3890.get(0) != null && field3890.get(1) != null) {
			class352 var5 = (class352) field3890.get(0);
			field3890.set(0, field3891.get(1));
			field3890.set(1, var5);
		}
	}

	@ObfuscatedName("hz.as(B)Z")
	public static boolean method4085() {
		return !field3890.isEmpty();
	}

	@ObfuscatedName("gn.al(I)V")
	public static void method3684() {
		field3890.clear();
	}

	@ObfuscatedName("gy.au(Lpx;II)V")
	public static void method3776(class413 arg0, int arg1) {
		if (field3890.isEmpty()) {
			return;
		}
		ArrayList var2 = new ArrayList();
		Iterator var3 = field3890.iterator();
		while (var3.hasNext()) {
			class352 var4 = (class352) var3.next();
			var4.field4010 = false;
			var4.field4009 = false;
			var4.field4011 = false;
			var4.field4012 = false;
			var4.field4015 = arg0;
			var4.field4006 = arg1;
			var4.field4003 = 0.0F;
			var2.add(var4);
		}
		method5668(var2, field3895, field3897, field3899, field3898, false);
	}

	@ObfuscatedName("lv.ai(Ljava/util/ArrayList;ZB)V")
	public static void method6315(ArrayList arg0, boolean arg1) {
		if (!arg1) {
			field3890.clear();
		}
		Iterator var2 = arg0.iterator();
		while (var2.hasNext()) {
			class352 var3 = (class352) var2.next();
			if (var3.field4008 != -1 && var3.field4005 != -1) {
				if (!arg1) {
					field3890.add(var3);
				}
				field3896.add(var3);
			}
		}
	}

	@ObfuscatedName("bk.aa(IIIII)V")
	public static void method786(int arg0, int arg1, int arg2, int arg3) {
		field3895 = arg0;
		field3897 = arg1;
		field3899 = arg2;
		field3898 = arg3;
	}

	@ObfuscatedName("hv.am(Ljava/util/ArrayList;IIIII)V")
	public static void method4196(ArrayList arg0, int arg1, int arg2, int arg3, int arg4) {
		field3890.clear();
		field3890.addAll(arg0);
		method786(arg1, arg2, arg3, arg4);
	}

	@ObfuscatedName("ix.an(I)V")
	public static void method5043() {
		Iterator var0 = field3891.iterator();
		while (true) {
			class352 var1;
			do {
				if (!var0.hasNext()) {
					field3891.clear();
					return;
				}
				var1 = (class352) var0.next();
			} while (var1 == null);
			var1.field4013.method6578();
			var1.field4013.method6576();
			var1.field4013.method6632(0);
			var1.field4013.field3905 = 0;
			int var2 = var1.field4008;
			int var3 = var1.field4005;
			Iterator var4 = field3894.iterator();
			while (var4.hasNext()) {
				class346 var5 = (class346) var4.next();
				var5.method806(var2, var3);
			}
		}
	}

	@ObfuscatedName("lc.ar(ZB)V")
	public static void method6249(boolean arg0) {
		if (arg0) {
			method5043();
			return;
		}
		for (int var1 = 0; var1 < field3891.size(); var1++) {
			class352 var2 = (class352) field3891.get(var1);
			if (var2 == null) {
				field3891.remove(var1);
				var1--;
			} else if (var2.field4012) {
				if (var2.field4013.field3905 > 0) {
					var2.field4013.field3905--;
				}
				var2.field4013.method6578();
				var2.field4013.method6576();
				var2.field4013.method6632(0);
				field3891.remove(var1);
				var1--;
			} else {
				var2.field4012 = true;
			}
		}
	}
}
