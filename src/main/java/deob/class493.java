package deob;

@ObfuscatedName("sg")
public class class493 extends class502 {

	@ObfuscatedName("sg.ap")
	public final class563 field5371;

	public class493(class563 arg0) {
		super(400);
		this.field5371 = arg0;
	}

	@ObfuscatedName("sg.af(I)Ltl;")
	public class500 method9174() {
		return new class503();
	}

	@ObfuscatedName("sg.aw(IB)[Ltl;")
	public class500[] method9170(int arg0) {
		return new class503[arg0];
	}

	@ObfuscatedName("sg.at(Lwb;II)V")
	public void method9176(class591 arg0, int arg1) {
		while (arg0.field5920 < arg1) {
			int var3 = arg0.method10339();
			if (var3 == 4) {
				class614 var4 = new class614(arg0.method10350(), this.field5371);
				if (!var4.method11024()) {
					throw new IllegalStateException();
				}
				boolean var5 = false;
				Statics.field280.method1518(var4.method11022(), var5);
			} else {
				boolean var6 = (var3 & 0x1) != 0;
				class614 var7 = new class614(arg0.method10350(), this.field5371);
				class614 var8 = new class614(arg0.method10350(), this.field5371);
				arg0.method10350();
				if (!var7.method11024()) {
					throw new IllegalStateException();
				}
				class503 var9 = (class503) this.method9267(var7);
				if (var6) {
					class503 var10 = (class503) this.method9267(var8);
					if (var10 != null && var9 != var10) {
						if (var9 == null) {
							var9 = var10;
						} else {
							this.method9299(var10);
						}
					}
				}
				if (var9 != null) {
					this.method9278(var9, var7, var8);
				} else if (this.method9263() < 400) {
					int var11 = this.method9263();
					class503 var12 = (class503) this.method9270(var7, var8);
					var12.field5408 = var11;
				}
			}
		}
	}
}
