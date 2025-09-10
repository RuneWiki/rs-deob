package deob;

@ObfuscatedName("qt")
public class class422 {

	@ObfuscatedName("qt.af")
	public byte field5044;

	@ObfuscatedName("qt.aw")
	public int field5040;

	@ObfuscatedName("qt.at")
	public int field5041;

	@ObfuscatedName("qt.ac")
	public int field5042;

	@ObfuscatedName("qt.ap")
	public int field5043;

	@ObfuscatedName("qt.aq")
	public int field5039;

	public class422() {
	}

	public class422(class591 arg0, boolean arg1) {
		this.field5044 = arg0.method10340();
		this.field5040 = arg0.method10341();
		this.field5041 = arg0.method10345();
		this.field5042 = arg0.method10345();
		this.field5043 = arg0.method10345();
		this.field5039 = arg0.method10345();
		if (arg1) {
			this.method7877(method7542(arg0));
		}
	}

	@ObfuscatedName("ok.af(Lwb;I)Ljava/lang/Integer;")
	public static Integer method7542(class591 arg0) {
		int var1 = 0;
		boolean var2 = false;
		while (true) {
			int var3 = arg0.method10339();
			if (var3 == 255) {
				return var2 ? var1 : null;
			}
			if (var3 != 0) {
				throw new IllegalStateException("");
			}
			while (true) {
				int var4 = arg0.method10339();
				if (var4 == 255) {
					break;
				}
				arg0.field5920--;
				if (arg0.method10341() != 0) {
					throw new IllegalStateException("");
				}
				if (var2) {
					throw new IllegalStateException("");
				}
				var1 = arg0.method10345();
				var2 = true;
			}
		}
	}

	@ObfuscatedName("qt.aw(Ljava/lang/Integer;I)V")
	public void method7877(Integer arg0) {
	}

	@ObfuscatedName("qt.at(I)I")
	public int method7864() {
		return this.field5044 & 0x7;
	}

	@ObfuscatedName("qt.ac(II)V")
	public void method7863(int arg0) {
		this.field5044 &= 0xFFFFFFF8;
		this.field5044 = (byte) (this.field5044 | arg0 & 0x7);
	}

	@ObfuscatedName("qt.ap(B)I")
	public int method7866() {
		return (this.field5044 & 0x8) == 8 ? 1 : 0;
	}

	@ObfuscatedName("qt.aq(II)V")
	public void method7875(int arg0) {
		this.field5044 &= 0xFFFFFFF7;
		if (arg0 == 1) {
			this.field5044 = (byte) (this.field5044 | 0x8);
		}
	}
}
