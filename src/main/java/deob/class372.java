package deob;

@ObfuscatedName("ot")
public abstract class class372 {

	@ObfuscatedName("os.af([BZB)Ljava/lang/Object;")
	public static Object method7554(byte[] arg0, boolean arg1) {
		if (arg0 == null) {
			return null;
		} else if (arg0.length > 136) {
			class374 var2 = new class374();
			var2.method7501(arg0);
			return var2;
		} else if (arg1) {
			int var3 = arg0.length;
			byte[] var4 = new byte[var3];
			System.arraycopy(arg0, 0, var4, 0, var3);
			return var4;
		} else {
			return arg0;
		}
	}

	@ObfuscatedName("hl.aw(Ljava/lang/Object;ZI)[B")
	public static byte[] method4102(Object arg0, boolean arg1) {
		if (arg0 == null) {
			return null;
		} else if (arg0 instanceof byte[]) {
			byte[] var2 = (byte[]) arg0;
			if (arg1) {
				int var3 = var2.length;
				byte[] var4 = new byte[var3];
				System.arraycopy(var2, 0, var4, 0, var3);
				return var4;
			} else {
				return var2;
			}
		} else if (arg0 instanceof class372) {
			class372 var6 = (class372) arg0;
			return var6.method7500();
		} else {
			throw new IllegalArgumentException();
		}
	}

	@ObfuscatedName("ot.at(I)[B")
	public abstract byte[] method7500();

	@ObfuscatedName("ot.ac([BB)V")
	public abstract void method7501(byte[] arg0);
}
