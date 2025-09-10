package deob;

@ObfuscatedName("pl")
public class class409 implements Runnable {

	@ObfuscatedName("pl.af")
	public static final class437 field4905 = new class437();

	@ObfuscatedName("pl.aw")
	public static final Object field4904 = new Object();

	@ObfuscatedName("pl.ap")
	public static class437 field4909 = new class437();

	@ObfuscatedName("pl.aq")
	public static int field4902 = 0;

	@ObfuscatedName("gd.af(ILto;Lpw;I)V")
	public static void method3822(int arg0, class516 arg1, class410 arg2) {
		byte[] var3 = null;
		class437 var4 = field4905;
		synchronized (field4905) {
			for (class408 var5 = (class408) field4905.method8034(); var5 != null; var5 = (class408) field4905.method8036()) {
				if ((long) arg0 == var5.field5601 && var5.field4898 == arg1 && var5.field4899 == 0) {
					var3 = var5.field4897;
					break;
				}
			}
		}
		if (var3 == null) {
			byte[] var7 = arg1.method9492(arg0);
			arg2.method7644(arg1, arg0, var7, true);
		} else {
			arg2.method7644(arg1, arg0, var3, true);
		}
	}

	@ObfuscatedName("fy.aw(I)V")
	public static void method3526() {
		Object var0 = field4904;
		synchronized (field4904) {
			if (field4902 != 0) {
				field4902 = 1;
				try {
					field4904.wait();
				} catch (InterruptedException var6) {
				}
			}
		}
		class437 var3 = field4905;
		synchronized (field4905) {
			field4905.method8029();
			field4909.method8029();
		}
	}

	public void run() {
		try {
			while (true) {
				class437 var1 = field4905;
				class408 var2;
				synchronized (field4905) {
					var2 = (class408) field4905.method8034();
				}
				if (var2 == null) {
					class336.method3770(100L);
					Object var10 = field4904;
					synchronized (field4904) {
						if (field4902 <= 1) {
							field4902 = 0;
							field4904.notifyAll();
							return;
						}
						field4902--;
					}
				} else {
					if (var2.field4899 == 0) {
						var2.field4898.method9493((int) var2.field5601, var2.field4897, var2.field4897.length);
						class437 var4 = field4905;
						synchronized (field4905) {
							var2.method2234();
						}
					} else if (var2.field4899 == 1) {
						var2.field4897 = var2.field4898.method9492((int) var2.field5601);
						class437 var6 = field4905;
						synchronized (field4905) {
							field4909.method8033(var2);
						}
					}
					Object var8 = field4904;
					synchronized (field4904) {
						if (field4902 <= 1) {
							field4902 = 0;
							field4904.notifyAll();
							return;
						}
						field4902 = 600;
					}
				}
			}
		} catch (Exception var18) {
			class617.method9413(null, var18);
		}
	}
}
