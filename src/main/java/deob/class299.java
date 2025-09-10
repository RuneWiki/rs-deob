package deob;

import java.util.LinkedList;

@ObfuscatedName("lv")
public abstract class class299 {

	@ObfuscatedName("lv.ap")
	public short[][][] field3431;

	@ObfuscatedName("lv.aq")
	public int field3434;

	@ObfuscatedName("lv.ao")
	public int field3427;

	@ObfuscatedName("lv.as")
	public int field3432;

	@ObfuscatedName("lv.al")
	public int field3430;

	@ObfuscatedName("lv.au")
	public int field3426;

	@ObfuscatedName("lv.ai")
	public int field3429;

	@ObfuscatedName("lv.aa")
	public int field3433 = -1;

	@ObfuscatedName("lv.am")
	public int field3428 = -1;

	@ObfuscatedName("lv.an")
	public short[][][] field3435;

	@ObfuscatedName("lv.ar")
	public byte[][][] field3436;

	@ObfuscatedName("lv.ae")
	public byte[][][] field3437;

	@ObfuscatedName("lv.ay")
	public class301[][][][] field3438;

	@ObfuscatedName("lv.ad")
	public boolean field3439 = false;

	@ObfuscatedName("lv.ag")
	public boolean field3440 = false;

	public class299() {
		new LinkedList();
	}

	@ObfuscatedName("lv.ah(I)Z")
	public boolean method6283() {
		return this.field3439 && this.field3440;
	}

	@ObfuscatedName("lv.ab(Lpx;I)V")
	public void method6312(class413 arg0) {
		if (this.method6283()) {
			return;
		}
		byte[] var2 = arg0.method7692(this.field3433, this.field3428);
		if (var2 != null) {
			this.method5908(new class591(var2));
			this.field3439 = true;
			this.field3440 = true;
		}
	}

	@ObfuscatedName("lv.ax(I)V")
	public void method6291() {
		this.field3431 = null;
		this.field3435 = null;
		this.field3436 = null;
		this.field3437 = null;
		this.field3438 = null;
		this.field3439 = false;
		this.field3440 = false;
	}

	@ObfuscatedName("lv.ak(IILwb;I)V")
	public void method6285(int arg0, int arg1, class591 arg2) {
		int var4 = arg2.method10339();
		if (var4 == 0) {
			return;
		}
		if ((var4 & 0x1) == 0) {
			this.method6288(arg0, arg1, arg2, var4);
		} else {
			this.method6307(arg0, arg1, arg2, var4);
		}
	}

	@ObfuscatedName("lv.aj(IILwb;II)V")
	public void method6307(int arg0, int arg1, class591 arg2, int arg3) {
		boolean var5 = (arg3 & 0x2) != 0;
		if (var5) {
			this.field3435[0][arg0][arg1] = (short) arg2.method10341();
		}
		this.field3431[0][arg0][arg1] = (short) arg2.method10341();
	}

	@ObfuscatedName("lv.az(IILwb;II)V")
	public void method6288(int arg0, int arg1, class591 arg2, int arg3) {
		int var5 = (arg3 >> 3 & 0x3) + 1;
		boolean var6 = (arg3 & 0x2) != 0;
		boolean var7 = (arg3 & 0x4) != 0;
		this.field3431[0][arg0][arg1] = (short) arg2.method10341();
		if (var6) {
			int var8 = arg2.method10339();
			for (int var9 = 0; var9 < var8; var9++) {
				int var10 = arg2.method10341();
				if (var10 != 0) {
					this.field3435[var9][arg0][arg1] = (short) var10;
					int var11 = arg2.method10339();
					this.field3436[var9][arg0][arg1] = (byte) (var11 >> 2);
					this.field3437[var9][arg0][arg1] = (byte) (var11 & 0x3);
				}
			}
		}
		if (!var7) {
			return;
		}
		for (int var12 = 0; var12 < var5; var12++) {
			int var13 = arg2.method10339();
			if (var13 != 0) {
				class301[] var14 = this.field3438[var12][arg0][arg1] = new class301[var13];
				for (int var15 = 0; var15 < var13; var15++) {
					int var16 = arg2.method10365();
					int var17 = arg2.method10339();
					var14[var15] = new class301(var16, var17 >> 2, var17 & 0x3);
				}
			}
		}
	}

	@ObfuscatedName("lv.bt(B)I")
	public int method6289() {
		return this.field3432;
	}

	@ObfuscatedName("lv.bs(I)I")
	public int method6290() {
		return this.field3430;
	}

	@ObfuscatedName("lv.aw(Lwb;I)V")
	public abstract void method5908(class591 arg0);
}
