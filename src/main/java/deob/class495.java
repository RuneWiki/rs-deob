package deob;

@ObfuscatedName("tq")
public class class495 extends class502 {

	@ObfuscatedName("tq.at")
	public final class563 field5373;

	@ObfuscatedName("tq.ac")
	public class440 field5375 = new class440();

	@ObfuscatedName("tq.ap")
	public int field5376 = 1;

	public class495(class563 arg0) {
		super(400);
		this.field5373 = arg0;
	}

	@ObfuscatedName("tq.af(I)Ltl;")
	public class500 method9174() {
		return new class497();
	}

	@ObfuscatedName("tq.aw(IB)[Ltl;")
	public class500[] method9170(int arg0) {
		return new class497[arg0];
	}

	@ObfuscatedName("tq.at(Lxa;ZI)Z")
	public boolean method9181(class614 arg0, boolean arg1) {
		class497 var3 = (class497) this.method9298(arg0);
		if (var3 == null) {
			return false;
		} else {
			return !arg1 || var3.field5412 != 0;
		}
	}

	@ObfuscatedName("tq.al(Lwb;II)V")
	public void method9182(class591 arg0, int arg1) {
		while (true) {
			if (arg0.field5920 < arg1) {
				boolean var3 = arg0.method10339() == 1;
				class614 var4 = new class614(arg0.method10350(), this.field5373);
				class614 var5 = new class614(arg0.method10350(), this.field5373);
				int var6 = arg0.method10341();
				int var7 = arg0.method10339();
				int var8 = arg0.method10339();
				boolean var9 = (var8 & 0x2) != 0;
				boolean var10 = (var8 & 0x1) != 0;
				if (var6 > 0) {
					arg0.method10350();
					arg0.method10339();
					arg0.method10345();
				}
				arg0.method10350();
				if (var4 != null && var4.method11024()) {
					class497 var11 = (class497) this.method9267(var4);
					if (var3) {
						class497 var12 = (class497) this.method9267(var5);
						if (var12 != null && var11 != var12) {
							if (var11 == null) {
								var11 = var12;
							} else {
								this.method9299(var12);
							}
						}
					}
					if (var11 == null) {
						if (this.method9263() >= 400) {
							continue;
						}
						var11 = (class497) this.method9270(var4, var5);
					} else {
						this.method9278(var11, var4, var5);
						if (var11.field5412 != var6) {
							boolean var13 = true;
							for (class498 var14 = (class498) this.field5375.method8174(); var14 != null; var14 = (class498) this.field5375.method8167()) {
								if (var14.field5392.equals(var4)) {
									if (var6 != 0 && var14.field5389 == 0) {
										var14.method9755();
										var13 = false;
									} else if (var6 == 0 && var14.field5389 != 0) {
										var14.method9755();
										var13 = false;
									}
								}
							}
							if (var13) {
								this.field5375.method8166(new class498(var4, var6));
							}
						}
					}
					if (var11.field5412 != var6) {
						var11.field5411 = ++this.field5376 - 1;
						if (var11.field5412 == -1 && var6 == 0) {
							var11.field5411 = -(var11.field5411 * 778534179) * 500734603;
						}
						var11.field5412 = var6 * 21363 * 584845755;
					}
					var11.field5413 = var7;
					var11.field5386 = var9;
					var11.field5387 = var10;
					continue;
				}
				throw new IllegalStateException();
			}
			this.method9295();
			return;
		}
	}
}
