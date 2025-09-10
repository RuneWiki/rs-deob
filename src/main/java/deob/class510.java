package deob;

import java.util.Iterator;

@ObfuscatedName("ta")
public class class510 {

	public class510() throws Throwable {
		throw new Error();
	}

	@ObfuscatedName("qp.af(ILco;I)Ldr;")
	public static class80 method7843(int arg0, class74 arg1) {
		Iterator var2 = arg1.iterator();
		class80 var3;
		class70 var4;
		do {
			if (!var2.hasNext()) {
				return arg1.method2304();
			}
			var3 = (class80) var2.next();
			var4 = (class70) var3.field1170.method7917((long) arg0);
		} while (var4 == null || var3.field1173 == -1);
		return var3;
	}
}
