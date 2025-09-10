package deob;

@ObfuscatedName("lr")
public class class302 {

	@ObfuscatedName("lr.aw")
	public final int[] field3451;

	public class302() {
		this.field3451 = new int[4096];
	}

	public class302(int[] arg0) {
		this.field3451 = arg0;
	}

	@ObfuscatedName("gu.af([BB)Llr;")
	public static class302 method3818(byte[] arg0) {
		return arg0 == null ? new class302() : new class302(class31.method3863(arg0).field6019);
	}

	@ObfuscatedName("lr.aw(III)I")
	public final int method6318(int arg0, int arg1) {
		return this.field3451[arg1 * 64 + arg0];
	}
}
