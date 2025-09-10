package deob;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

@ObfuscatedName("nf")
public class class341 extends class105 {

	@ObfuscatedName("nf.ac")
	public static AtomicBoolean field3902 = null;

	@ObfuscatedName("nf.ap")
	public static ThreadPoolExecutor field3903 = null;

	@ObfuscatedName("nf.aq")
	public PriorityQueue field3928 = new PriorityQueue(5, new class351());

	@ObfuscatedName("nf.ao")
	public int field3905 = 0;

	@ObfuscatedName("nf.as")
	public int[] field3906 = new int[16];

	@ObfuscatedName("nf.al")
	public int[] field3929 = new int[16];

	@ObfuscatedName("nf.au")
	public int[] field3908 = new int[16];

	@ObfuscatedName("nf.ai")
	public class429 field3909;

	@ObfuscatedName("nf.aa")
	public int field3910 = 256;

	@ObfuscatedName("nf.am")
	public int field3911 = 1000000;

	@ObfuscatedName("nf.an")
	public int[] field3912 = new int[16];

	@ObfuscatedName("nf.ar")
	public int[] field3913 = new int[16];

	@ObfuscatedName("nf.ae")
	public int[] field3914 = new int[16];

	@ObfuscatedName("nf.ay")
	public int[] field3916 = new int[16];

	@ObfuscatedName("nf.ad")
	public int[] field3919 = new int[16];

	@ObfuscatedName("nf.ag")
	public int[] field3933 = new int[16];

	@ObfuscatedName("nf.av")
	public int[] field3918 = new int[16];

	@ObfuscatedName("nf.aj")
	public int[] field3917 = new int[16];

	@ObfuscatedName("nf.az")
	public int[] field3920 = new int[16];

	@ObfuscatedName("nf.bt")
	public int[] field3904 = new int[16];

	@ObfuscatedName("nf.bs")
	public int[] field3922 = new int[16];

	@ObfuscatedName("nf.bu")
	public int[] field3900 = new int[16];

	@ObfuscatedName("nf.bi")
	public class350[][] field3924 = new class350[16][128];

	@ObfuscatedName("nf.bd")
	public class350[][] field3925 = new class350[16][128];

	@ObfuscatedName("nf.ba")
	public class342 field3932 = new class342();

	@ObfuscatedName("nf.bb")
	public boolean field3927;

	@ObfuscatedName("nf.bo")
	public int field3915;

	@ObfuscatedName("nf.bl")
	public int field3926;

	@ObfuscatedName("nf.by")
	public long field3930;

	@ObfuscatedName("nf.bg")
	public long field3931;

	@ObfuscatedName("nf.bx")
	public class348 field3907 = new class348(this);

	@ObfuscatedName("nf.bq")
	public class98 field3923 = null;

	public class341(class98 arg0) {
		this.field3923 = arg0;
		this.field3909 = new class429(128);
		this.method6591();
	}

	@ObfuscatedName("nf.af(II)V")
	public void method6632(int arg0) {
		class98 var2 = this.field3923;
		synchronized (this.field3923) {
			this.field3910 = arg0;
		}
	}

	@ObfuscatedName("nf.aw(I)I")
	public int method6572() {
		return this.field3910;
	}

	@ObfuscatedName("nf.at(Lnd;Lpx;Ldi;I)Z")
	public boolean method6598(class349 arg0, class413 arg1, class101 arg2) {
		class98 var4 = this.field3923;
		synchronized (this.field3923) {
			boolean var5 = true;
			PriorityQueue var6 = this.field3928;
			synchronized (this.field3928) {
				this.field3928.clear();
			}
			for (class353 var8 = (class353) arg0.field3975.method7976(); var8 != null; var8 = (class353) arg0.field3975.method7977()) {
				int var9 = (int) var8.field5601;
				class345 var10 = (class345) this.field3909.method7973((long) var9);
				if (var10 == null) {
					byte[] var11 = arg1.method7775(var9);
					class345 var12;
					if (var11 == null) {
						var12 = null;
					} else {
						var12 = new class345(var11);
					}
					var10 = var12;
					if (var12 == null) {
						var5 = false;
						continue;
					}
					this.field3909.method7975(var12, (long) var9);
				}
				if (!var10.method6741(arg2, var8.field4016)) {
					var5 = false;
				} else if (this.field3928 != null) {
					PriorityQueue var13 = this.field3928;
					synchronized (this.field3928) {
						Iterator var14 = var10.field3961.iterator();
						while (var14.hasNext()) {
							class109 var15 = (class109) var14.next();
							this.field3928.add(new class344(var8.field4017, var15));
						}
					}
				}
			}
			return var5;
		}
	}

	@ObfuscatedName("nf.ac(I)V")
	public void method6574() {
		if (this.field3928 == null) {
			return;
		}
		if (field3902 != null) {
			field3902.set(true);
		}
		field3902 = new AtomicBoolean(false);
		AtomicBoolean var1 = field3902;
		if (field3903 == null) {
			int var2 = Runtime.getRuntime().availableProcessors();
			field3903 = new ThreadPoolExecutor(0, var2, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), new class343(this));
		}
		field3903.submit(new class347(this, var1));
	}

	@ObfuscatedName("nf.ap(B)V")
	public void method6575() {
		class98 var1 = this.field3923;
		synchronized (this.field3923) {
			for (class345 var2 = (class345) this.field3909.method7976(); var2 != null; var2 = (class345) this.field3909.method7977()) {
				var2.method6748();
			}
		}
	}

	@ObfuscatedName("nf.au(I)V")
	public void method6576() {
		class98 var1 = this.field3923;
		synchronized (this.field3923) {
			for (class345 var2 = (class345) this.field3909.method7976(); var2 != null; var2 = (class345) this.field3909.method7977()) {
				var2.method2234();
			}
		}
	}

	@ObfuscatedName("nf.aa(Lnd;ZI)V")
	public void method6660(class349 arg0, boolean arg1) {
		class98 var3 = this.field3923;
		synchronized (this.field3923) {
			this.method6578();
			this.field3932.method6706(arg0.field3974);
			this.field3927 = arg1;
			this.field3930 = 0L;
			int var4 = this.field3932.method6688();
			for (int var5 = 0; var5 < var4; var5++) {
				this.field3932.method6682(var5);
				this.field3932.method6689(var5);
				this.field3932.method6714(var5);
			}
			this.field3915 = this.field3932.method6683();
			this.field3926 = this.field3932.field3947[this.field3915];
			this.field3931 = this.field3932.method6693(this.field3926);
		}
	}

	@ObfuscatedName("nf.am(I)V")
	public void method6578() {
		class98 var1 = this.field3923;
		synchronized (this.field3923) {
			this.field3932.method6684();
			this.method6591();
		}
	}

	@ObfuscatedName("nf.an(B)Z")
	public boolean method6579() {
		class98 var1 = this.field3923;
		synchronized (this.field3923) {
			return this.field3932.method6703();
		}
	}

	@ObfuscatedName("nf.ar(I)Z")
	public boolean method6669() {
		class98 var1 = this.field3923;
		synchronized (this.field3923) {
			return this.field3909.method7974() > 0;
		}
	}

	@ObfuscatedName("nf.ae(III)V")
	public void method6584(int arg0, int arg1) {
		class98 var3 = this.field3923;
		synchronized (this.field3923) {
			this.method6581(arg0, arg1);
		}
	}

	@ObfuscatedName("nf.ay(IIB)V")
	public void method6581(int arg0, int arg1) {
		this.field3916[arg0] = arg1;
		this.field3933[arg0] = arg1 & 0xFFFFFF80;
		this.method6626(arg0, arg1);
	}

	@ObfuscatedName("nf.ad(IIB)V")
	public void method6626(int arg0, int arg1) {
		if (this.field3919[arg0] != arg1) {
			this.field3919[arg0] = arg1;
			for (int var3 = 0; var3 < 128; var3++) {
				this.field3925[arg0][var3] = null;
			}
		}
	}

	@ObfuscatedName("nf.ag(IIII)V")
	public void method6583(int arg0, int arg1, int arg2) {
		this.method6585(arg0, arg1, 64);
		if ((this.field3906[arg0] & 0x2) != 0) {
			for (class350 var4 = (class350) this.field3907.field3972.method8035(); var4 != null; var4 = (class350) this.field3907.field3972.method8037()) {
				if (var4.field3977 == arg0 && var4.field3989 < 0) {
					this.field3924[arg0][var4.field3982] = null;
					this.field3924[arg0][arg1] = var4;
					int var5 = (var4.field3987 * var4.field3986 >> 12) + var4.field3985;
					var4.field3985 += arg1 - var4.field3982 << 8;
					var4.field3986 = var5 - var4.field3985;
					var4.field3987 = 4096;
					var4.field3982 = arg1;
					return;
				}
			}
		}
		class345 var6 = (class345) this.field3909.method7973((long) this.field3919[arg0]);
		if (var6 == null || var6.field3963[arg1] == null) {
			return;
		}
		class96 var7 = var6.field3963[arg1].method3237();
		if (var7 == null) {
			return;
		}
		class350 var8 = new class350();
		var8.field3977 = arg0;
		var8.field3992 = var6;
		var8.field3979 = var7;
		var8.field3991 = var6.field3964[arg1];
		var8.field3981 = var6.field3955[arg1];
		var8.field3982 = arg1;
		var8.field3983 = var6.field3959 * arg2 * arg2 * var6.field3957[arg1] + 1024 >> 11;
		var8.field3984 = var6.field3958[arg1] & 0xFF;
		var8.field3985 = (arg1 << 8) - (var6.field3960[arg1] & 0x7FFF);
		var8.field3988 = 0;
		var8.field3994 = 0;
		var8.field3976 = 0;
		var8.field3989 = -1;
		var8.field3998 = 0;
		if (this.field3929[arg0] == 0) {
			var8.field3995 = class104.method3068(var7, this.method6595(var8), this.method6603(var8), this.method6596(var8));
		} else {
			var8.field3995 = class104.method3068(var7, this.method6595(var8), 0, this.method6596(var8));
			this.method6594(var8, var6.field3960[arg1] < 0);
		}
		if (var6.field3960[arg1] < 0) {
			var8.field3995.method3087(-1);
		}
		if (var8.field3981 >= 0) {
			class350 var9 = this.field3925[arg0][var8.field3981];
			if (var9 != null && var9.field3989 < 0) {
				this.field3924[arg0][var9.field3982] = null;
				var9.field3989 = 0;
			}
			this.field3925[arg0][var8.field3981] = var8;
		}
		this.field3907.field3972.method8033(var8);
		this.field3924[arg0][arg1] = var8;
	}

	@ObfuscatedName("nf.av(Lno;ZB)V")
	public void method6594(class350 arg0, boolean arg1) {
		int var3 = arg0.field3979.field1323.length;
		int var5;
		if (arg1 && arg0.field3979.field1322) {
			int var4 = var3 + var3 - arg0.field3979.field1324;
			var5 = (int) ((long) this.field3929[arg0.field3977] * (long) var4 >> 6);
			int var6 = var3 << 8;
			if (var5 >= var6) {
				var5 = var6 + var6 - 1 - var5;
				arg0.field3995.method3095(true);
			}
		} else {
			var5 = (int) ((long) this.field3929[arg0.field3977] * (long) var3 >> 6);
		}
		arg0.field3995.method3072(var5);
	}

	@ObfuscatedName("nf.by(IIIS)V")
	public void method6585(int arg0, int arg1, int arg2) {
		class350 var4 = this.field3924[arg0][arg1];
		if (var4 == null) {
			return;
		}
		this.field3924[arg0][arg1] = null;
		if ((this.field3906[arg0] & 0x2) == 0) {
			var4.field3989 = 0;
			return;
		}
		for (class350 var5 = (class350) this.field3907.field3972.method8034(); var5 != null; var5 = (class350) this.field3907.field3972.method8036()) {
			if (var4.field3977 == var5.field3977 && var5.field3989 < 0 && var4 != var5) {
				var4.field3989 = 0;
				break;
			}
		}
	}

	@ObfuscatedName("nf.bg(IIII)V")
	public void method6586(int arg0, int arg1, int arg2) {
	}

	@ObfuscatedName("nf.bx(IIB)V")
	public void method6590(int arg0, int arg1) {
	}

	@ObfuscatedName("nf.bq(III)V")
	public void method6588(int arg0, int arg1) {
		this.field3918[arg0] = arg1;
	}

	@ObfuscatedName("nf.bz(II)V")
	public void method6630(int arg0) {
		for (class350 var2 = (class350) this.field3907.field3972.method8034(); var2 != null; var2 = (class350) this.field3907.field3972.method8036()) {
			if (arg0 < 0 || var2.field3977 == arg0) {
				if (var2.field3995 != null) {
					var2.field3995.method3099(class98.field1357 / 100);
					if (var2.field3995.method3103()) {
						this.field3907.field3970.method2890(var2.field3995);
					}
					var2.method6764();
				}
				if (var2.field3989 < 0) {
					this.field3924[var2.field3977][var2.field3982] = null;
				}
				var2.method2234();
			}
		}
	}

	@ObfuscatedName("nf.be(II)V")
	public void method6650(int arg0) {
		if (arg0 < 0) {
			for (int var2 = 0; var2 < 16; var2++) {
				this.method6650(var2);
			}
			return;
		}
		this.field3912[arg0] = 12800;
		this.field3913[arg0] = 8192;
		this.field3914[arg0] = 16383;
		this.field3918[arg0] = 8192;
		this.field3917[arg0] = 0;
		this.field3920[arg0] = 8192;
		this.method6592(arg0);
		this.method6593(arg0);
		this.field3906[arg0] = 0;
		this.field3904[arg0] = 32767;
		this.field3922[arg0] = 256;
		this.field3929[arg0] = 0;
		this.method6652(arg0, 8192);
	}

	@ObfuscatedName("nf.bh(IB)V")
	public void method6571(int arg0) {
		for (class350 var2 = (class350) this.field3907.field3972.method8034(); var2 != null; var2 = (class350) this.field3907.field3972.method8036()) {
			if ((arg0 < 0 || var2.field3977 == arg0) && var2.field3989 < 0) {
				this.field3924[var2.field3977][var2.field3982] = null;
				var2.field3989 = 0;
			}
		}
	}

	@ObfuscatedName("nf.bk(B)V")
	public void method6591() {
		this.method6630(-1);
		this.method6650(-1);
		for (int var1 = 0; var1 < 16; var1++) {
			this.field3919[var1] = this.field3916[var1];
		}
		for (int var2 = 0; var2 < 16; var2++) {
			this.field3933[var2] = this.field3916[var2] & 0xFFFFFF80;
		}
	}

	@ObfuscatedName("nf.bp(II)V")
	public void method6592(int arg0) {
		if ((this.field3906[arg0] & 0x2) == 0) {
			return;
		}
		for (class350 var2 = (class350) this.field3907.field3972.method8034(); var2 != null; var2 = (class350) this.field3907.field3972.method8036()) {
			if (var2.field3977 == arg0 && this.field3924[arg0][var2.field3982] == null && var2.field3989 < 0) {
				var2.field3989 = 0;
			}
		}
	}

	@ObfuscatedName("nf.br(II)V")
	public void method6593(int arg0) {
		if ((this.field3906[arg0] & 0x4) == 0) {
			return;
		}
		for (class350 var2 = (class350) this.field3907.field3972.method8034(); var2 != null; var2 = (class350) this.field3907.field3972.method8036()) {
			if (var2.field3977 == arg0) {
				var2.field3997 = 0;
			}
		}
	}

	@ObfuscatedName("nf.bv(IB)V")
	public void method6679(int arg0) {
		int var2 = arg0 & 0xF0;
		if (var2 == 128) {
			int var3 = arg0 & 0xF;
			int var4 = arg0 >> 8 & 0x7F;
			int var5 = arg0 >> 16 & 0x7F;
			this.method6585(var3, var4, var5);
		} else if (var2 == 144) {
			int var6 = arg0 & 0xF;
			int var7 = arg0 >> 8 & 0x7F;
			int var8 = arg0 >> 16 & 0x7F;
			if (var8 > 0) {
				this.method6583(var6, var7, var8);
			} else {
				this.method6585(var6, var7, 64);
			}
		} else if (var2 == 160) {
			int var9 = arg0 & 0xF;
			int var10 = arg0 >> 8 & 0x7F;
			int var11 = arg0 >> 16 & 0x7F;
			this.method6586(var9, var10, var11);
		} else if (var2 == 176) {
			int var12 = arg0 & 0xF;
			int var13 = arg0 >> 8 & 0x7F;
			int var14 = arg0 >> 16 & 0x7F;
			if (var13 == 0) {
				this.field3933[var12] = (var14 << 14) + (this.field3933[var12] & 0xFFE03FFF);
			}
			if (var13 == 32) {
				this.field3933[var12] = (var14 << 7) + (this.field3933[var12] & 0xFFFFC07F);
			}
			if (var13 == 1) {
				this.field3917[var12] = (var14 << 7) + (this.field3917[var12] & 0xFFFFC07F);
			}
			if (var13 == 33) {
				this.field3917[var12] = (this.field3917[var12] & 0xFFFFFF80) + var14;
			}
			if (var13 == 5) {
				this.field3920[var12] = (var14 << 7) + (this.field3920[var12] & 0xFFFFC07F);
			}
			if (var13 == 37) {
				this.field3920[var12] = (this.field3920[var12] & 0xFFFFFF80) + var14;
			}
			if (var13 == 7) {
				this.field3912[var12] = (var14 << 7) + (this.field3912[var12] & 0xFFFFC07F);
			}
			if (var13 == 39) {
				this.field3912[var12] = (this.field3912[var12] & 0xFFFFFF80) + var14;
			}
			if (var13 == 10) {
				this.field3913[var12] = (var14 << 7) + (this.field3913[var12] & 0xFFFFC07F);
			}
			if (var13 == 42) {
				this.field3913[var12] = (this.field3913[var12] & 0xFFFFFF80) + var14;
			}
			if (var13 == 11) {
				this.field3914[var12] = (var14 << 7) + (this.field3914[var12] & 0xFFFFC07F);
			}
			if (var13 == 43) {
				this.field3914[var12] = (this.field3914[var12] & 0xFFFFFF80) + var14;
			}
			if (var13 == 64) {
				if (var14 >= 64) {
					this.field3906[var12] |= 0x1;
				} else {
					this.field3906[var12] &= 0xFFFFFFFE;
				}
			}
			if (var13 == 65) {
				if (var14 >= 64) {
					this.field3906[var12] |= 0x2;
				} else {
					this.method6592(var12);
					this.field3906[var12] &= 0xFFFFFFFD;
				}
			}
			if (var13 == 99) {
				this.field3904[var12] = (var14 << 7) + (this.field3904[var12] & 0x7F);
			}
			if (var13 == 98) {
				this.field3904[var12] = (this.field3904[var12] & 0x3F80) + var14;
			}
			if (var13 == 101) {
				this.field3904[var12] = (var14 << 7) + (this.field3904[var12] & 0x7F) + 16384;
			}
			if (var13 == 100) {
				this.field3904[var12] = (this.field3904[var12] & 0x3F80) + 16384 + var14;
			}
			if (var13 == 120) {
				this.method6630(var12);
			}
			if (var13 == 121) {
				this.method6650(var12);
			}
			if (var13 == 123) {
				this.method6571(var12);
			}
			if (var13 == 6) {
				int var15 = this.field3904[var12];
				if (var15 == 16384) {
					this.field3922[var12] = (var14 << 7) + (this.field3922[var12] & 0xFFFFC07F);
				}
			}
			if (var13 == 38) {
				int var16 = this.field3904[var12];
				if (var16 == 16384) {
					this.field3922[var12] = (this.field3922[var12] & 0xFFFFFF80) + var14;
				}
			}
			if (var13 == 16) {
				this.field3929[var12] = (var14 << 7) + (this.field3929[var12] & 0xFFFFC07F);
			}
			if (var13 == 48) {
				this.field3929[var12] = (this.field3929[var12] & 0xFFFFFF80) + var14;
			}
			if (var13 == 81) {
				if (var14 >= 64) {
					this.field3906[var12] |= 0x4;
				} else {
					this.method6593(var12);
					this.field3906[var12] &= 0xFFFFFFFB;
				}
			}
			if (var13 == 17) {
				this.method6652(var12, (var14 << 7) + (this.field3900[var12] & 0xFFFFC07F));
			}
			if (var13 == 49) {
				this.method6652(var12, (this.field3900[var12] & 0xFFFFFF80) + var14);
			}
		} else if (var2 == 192) {
			int var17 = arg0 & 0xF;
			int var18 = arg0 >> 8 & 0x7F;
			this.method6626(var17, this.field3933[var17] + var18);
		} else if (var2 == 208) {
			int var19 = arg0 & 0xF;
			int var20 = arg0 >> 8 & 0x7F;
			this.method6590(var19, var20);
		} else if (var2 == 224) {
			int var21 = arg0 & 0xF;
			int var22 = (arg0 >> 9 & 0x3F80) + (arg0 >> 8 & 0x7F);
			this.method6588(var21, var22);
		} else {
			int var23 = arg0 & 0xFF;
			if (var23 == 255) {
				this.method6591();
			}
		}
	}

	@ObfuscatedName("nf.bj(III)V")
	public void method6652(int arg0, int arg1) {
		this.field3900[arg0] = arg1;
		this.field3908[arg0] = (int) (Math.pow(2.0D, (double) arg1 * 5.4931640625E-4D) * 2097152.0D + 0.5D);
	}

	@ObfuscatedName("nf.bm(Lno;B)I")
	public int method6595(class350 arg0) {
		int var2 = (arg0.field3987 * arg0.field3986 >> 12) + arg0.field3985;
		int var3 = ((this.field3918[arg0.field3977] - 8192) * this.field3922[arg0.field3977] >> 12) + var2;
		class339 var4 = arg0.field3991;
		if (var4.field3887 > 0 && (var4.field3885 > 0 || this.field3917[arg0.field3977] > 0)) {
			int var5 = var4.field3885 << 2;
			int var6 = var4.field3886 << 1;
			if (arg0.field3993 < var6) {
				var5 = arg0.field3993 * var5 / var6;
			}
			int var7 = (this.field3917[arg0.field3977] >> 7) + var5;
			double var8 = Math.sin((double) (arg0.field3990 & 0x1FF) * 0.01227184630308513D);
			var3 += (int) ((double) var7 * var8);
		}
		int var10 = (int) ((double) (arg0.field3979.field1326 * 256) * Math.pow(2.0D, (double) var3 * 3.255208333333333E-4D) / (double) class98.field1357 + 0.5D);
		return var10 < 1 ? 1 : var10;
	}

	@ObfuscatedName("nf.bf(Lno;I)I")
	public int method6603(class350 arg0) {
		class339 var2 = arg0.field3991;
		int var3 = this.field3914[arg0.field3977] * this.field3912[arg0.field3977] + 4096 >> 13;
		int var4 = var3 * var3 + 16384 >> 15;
		int var5 = arg0.field3983 * var4 + 16384 >> 15;
		int var6 = this.field3910 * var5 + 128 >> 8;
		if (var2.field3881 > 0) {
			var6 = (int) ((double) var6 * Math.pow(0.5D, (double) arg0.field3988 * 1.953125E-5D * (double) var2.field3881) + 0.5D);
		}
		if (var2.field3879 != null) {
			int var7 = arg0.field3994;
			int var8 = var2.field3879[arg0.field3976 + 1];
			if (arg0.field3976 < var2.field3879.length - 2) {
				int var9 = (var2.field3879[arg0.field3976] & 0xFF) << 8;
				int var10 = (var2.field3879[arg0.field3976 + 2] & 0xFF) << 8;
				var8 += (var2.field3879[arg0.field3976 + 3] - var8) * (var7 - var9) / (var10 - var9);
			}
			var6 = var6 * var8 + 32 >> 6;
		}
		if (arg0.field3989 > 0 && var2.field3880 != null) {
			int var11 = arg0.field3989;
			int var12 = var2.field3880[arg0.field3998 + 1];
			if (arg0.field3998 < var2.field3880.length - 2) {
				int var13 = (var2.field3880[arg0.field3998] & 0xFF) << 8;
				int var14 = (var2.field3880[arg0.field3998 + 2] & 0xFF) << 8;
				var12 += (var2.field3880[arg0.field3998 + 3] - var12) * (var11 - var13) / (var14 - var13);
			}
			var6 = var6 * var12 + 32 >> 6;
		}
		return var6;
	}

	@ObfuscatedName("nf.bw(Lno;B)I")
	public int method6596(class350 arg0) {
		int var2 = this.field3913[arg0.field3977];
		return var2 < 8192 ? arg0.field3984 * var2 + 32 >> 6 : 16384 - ((128 - arg0.field3984) * (16384 - var2) + 32 >> 6);
	}

	@ObfuscatedName("nf.aq()Lef;")
	public class105 method2895() {
		return this.field3907;
	}

	@ObfuscatedName("nf.ao()Lef;")
	public class105 method2896() {
		return null;
	}

	@ObfuscatedName("nf.as()I")
	public int method2915() {
		return 0;
	}

	@ObfuscatedName("nf.al([III)V")
	public void method2899(int[] arg0, int arg1, int arg2) {
		if (this.field3932.method6703()) {
			int var4 = this.field3911 * this.field3932.field3941 / class98.field1357;
			do {
				long var5 = (long) arg2 * (long) var4 + this.field3930;
				if (this.field3931 - var5 >= 0L) {
					this.field3930 = var5;
					break;
				}
				int var7 = (int) ((this.field3931 - this.field3930 + (long) var4 - 1L) / (long) var4);
				this.field3930 += (long) var4 * (long) var7;
				this.field3907.method2899(arg0, arg1, var7);
				arg1 += var7;
				arg2 -= var7;
				this.method6600();
			} while (this.field3932.method6703());
		}
		this.field3907.method2899(arg0, arg1, arg2);
	}

	@ObfuscatedName("nf.ai(I)V")
	public void method2900(int arg0) {
		if (this.field3932.method6703()) {
			int var2 = this.field3911 * this.field3932.field3941 / class98.field1357;
			do {
				long var3 = (long) arg0 * (long) var2 + this.field3930;
				if (this.field3931 - var3 >= 0L) {
					this.field3930 = var3;
					break;
				}
				int var5 = (int) ((this.field3931 - this.field3930 + (long) var2 - 1L) / (long) var2);
				this.field3930 += (long) var2 * (long) var5;
				this.field3907.method2900(var5);
				arg0 -= var5;
				this.method6600();
			} while (this.field3932.method6703());
		}
		this.field3907.method2900(arg0);
	}

	@ObfuscatedName("nf.bc(I)V")
	public void method6600() {
		int var1 = this.field3915;
		int var2 = this.field3926;
		long var3 = this.field3931;
		while (this.field3926 == var2) {
			while (this.field3932.field3947[var1] == var2) {
				this.field3932.method6682(var1);
				int var5 = this.field3932.method6690(var1);
				if (var5 == 1) {
					this.field3932.method6697();
					this.field3932.method6714(var1);
					if (this.field3932.method6695()) {
						if (!this.field3927 || var2 == 0) {
							this.method6591();
							this.field3932.method6684();
							return;
						}
						this.field3932.method6696(var3);
					}
					break;
				}
				if ((var5 & 0x80) != 0) {
					this.method6679(var5);
				}
				this.field3932.method6689(var1);
				this.field3932.method6714(var1);
			}
			var1 = this.field3932.method6683();
			var2 = this.field3932.field3947[var1];
			var3 = this.field3932.method6693(var2);
		}
		this.field3915 = var1;
		this.field3926 = var2;
		this.field3931 = var3;
	}

	@ObfuscatedName("nf.cw(Lno;I)Z")
	public boolean method6639(class350 arg0) {
		if (arg0.field3995 != null) {
			return false;
		}
		if (arg0.field3989 >= 0) {
			arg0.method2234();
			if (arg0.field3981 > 0 && this.field3925[arg0.field3977][arg0.field3981] == arg0) {
				this.field3925[arg0.field3977][arg0.field3981] = null;
			}
		}
		return true;
	}

	@ObfuscatedName("nf.cz(Lno;[IIIB)Z")
	public boolean method6602(class350 arg0, int[] arg1, int arg2, int arg3) {
		arg0.field3996 = class98.field1357 / 100;
		if (arg0.field3989 >= 0 && (arg0.field3995 == null || arg0.field3995.method3102())) {
			arg0.method6764();
			arg0.method2234();
			if (arg0.field3981 > 0 && this.field3925[arg0.field3977][arg0.field3981] == arg0) {
				this.field3925[arg0.field3977][arg0.field3981] = null;
			}
			return true;
		}
		int var5 = arg0.field3987;
		if (var5 > 0) {
			int var6 = var5 - (int) (Math.pow(2.0D, (double) this.field3920[arg0.field3977] * 4.921259842519685E-4D) * 16.0D + 0.5D);
			if (var6 < 0) {
				var6 = 0;
			}
			arg0.field3987 = var6;
		}
		arg0.field3995.method3101(this.method6595(arg0));
		class339 var7 = arg0.field3991;
		boolean var8 = false;
		arg0.field3993++;
		arg0.field3990 += var7.field3887;
		double var9 = (double) ((arg0.field3982 - 60 << 8) + (arg0.field3987 * arg0.field3986 >> 12)) * 5.086263020833333E-6D;
		if (var7.field3881 > 0) {
			if (var7.field3884 > 0) {
				arg0.field3988 += (int) (Math.pow(2.0D, (double) var7.field3884 * var9) * 128.0D + 0.5D);
			} else {
				arg0.field3988 += 128;
			}
		}
		if (var7.field3879 != null) {
			if (var7.field3882 > 0) {
				arg0.field3994 += (int) (Math.pow(2.0D, (double) var7.field3882 * var9) * 128.0D + 0.5D);
			} else {
				arg0.field3994 += 128;
			}
			while (arg0.field3976 < var7.field3879.length - 2 && arg0.field3994 > (var7.field3879[arg0.field3976 + 2] & 0xFF) << 8) {
				arg0.field3976 += 2;
			}
			if (arg0.field3976 == var7.field3879.length - 2 && var7.field3879[arg0.field3976 + 1] == 0) {
				var8 = true;
			}
		}
		if (arg0.field3989 >= 0 && var7.field3880 != null && (this.field3906[arg0.field3977] & 0x1) == 0 && (arg0.field3981 < 0 || this.field3925[arg0.field3977][arg0.field3981] != arg0)) {
			if (var7.field3883 > 0) {
				arg0.field3989 += (int) (Math.pow(2.0D, (double) var7.field3883 * var9) * 128.0D + 0.5D);
			} else {
				arg0.field3989 += 128;
			}
			while (arg0.field3998 < var7.field3880.length - 2 && arg0.field3989 > (var7.field3880[arg0.field3998 + 2] & 0xFF) << 8) {
				arg0.field3998 += 2;
			}
			if (arg0.field3998 == var7.field3880.length - 2) {
				var8 = true;
			}
		}
		if (!var8) {
			arg0.field3995.method3098(arg0.field3996, this.method6603(arg0), this.method6596(arg0));
			return false;
		}
		arg0.field3995.method3099(arg0.field3996);
		if (arg1 == null) {
			arg0.field3995.method2900(arg3);
		} else {
			arg0.field3995.method2899(arg1, arg2, arg3);
		}
		if (arg0.field3995.method3103()) {
			this.field3907.field3970.method2890(arg0.field3995);
		}
		arg0.method6764();
		if (arg0.field3989 >= 0) {
			arg0.method2234();
			if (arg0.field3981 > 0 && this.field3925[arg0.field3977][arg0.field3981] == arg0) {
				this.field3925[arg0.field3977][arg0.field3981] = null;
			}
		}
		return true;
	}
}
