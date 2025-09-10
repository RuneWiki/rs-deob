package deob;

import java.util.zip.CRC32;

@ObfuscatedName("pw")
public class class410 extends class413 {

	@ObfuscatedName("pw.as")
	public static CRC32 field4915 = new CRC32();

	@ObfuscatedName("pw.al")
	public boolean field4916 = false;

	@ObfuscatedName("pw.au")
	public boolean field4917 = false;

	@ObfuscatedName("pw.ai")
	public class516 field4918;

	@ObfuscatedName("pw.aa")
	public class516 field4919;

	@ObfuscatedName("pw.am")
	public int field4920;

	@ObfuscatedName("pw.an")
	public volatile int field4921 = 0;

	@ObfuscatedName("pw.ar")
	public boolean field4922 = false;

	@ObfuscatedName("pw.ae")
	public volatile boolean[] field4923;

	@ObfuscatedName("pw.ay")
	public int field4924;

	@ObfuscatedName("pw.ad")
	public int field4925;

	@ObfuscatedName("pw.ag")
	public int field4911 = -1;

	@ObfuscatedName("pw.av")
	public class414 field4927;

	public class410(class516 arg0, class516 arg1, class414 arg2, int arg3, boolean arg4, boolean arg5, boolean arg6, boolean arg7, boolean arg8) {
		super(arg4, arg5);
		this.field4918 = arg0;
		this.field4919 = arg1;
		this.field4920 = arg3;
		this.field4922 = arg6;
		this.field4917 = arg7;
		this.field4916 = arg8;
		this.field4927 = arg2;
		this.field4927.method7788(this, this.field4920);
	}

	@ObfuscatedName("pw.af(I)Z")
	public boolean method7645() {
		return this.field4921 == 1;
	}

	@ObfuscatedName("pw.aw(I)I")
	public int method7646() {
		if (this.field4921 == 1 || this.field4917 && this.field4921 == 2) {
			return 100;
		} else if (this.field4978 == null) {
			int var1 = this.field4927.method7792(class411.field4948.field4955, this.field4920);
			if (var1 >= 100) {
				var1 = 99;
			}
			return var1;
		} else {
			return 99;
		}
	}

	@ObfuscatedName("pw.at(II)V")
	public void method7678(int arg0) {
		this.field4927.method7790(this.field4920, arg0);
	}

	@ObfuscatedName("pw.ac(II)V")
	public void method7649(int arg0) {
		if (this.field4918 == null || this.field4923 == null || !this.field4923[arg0]) {
			this.field4927.method7787(this, this.field4920, arg0, this.field4964[arg0], (byte) 4, true);
		} else {
			class409.method3822(arg0, this.field4918, this);
		}
	}

	@ObfuscatedName("pw.ap(B)V")
	public void method7648() {
		this.field4921 = 2;
		this.field4968 = new int[0];
		this.field4964 = new int[0];
		this.field4982 = new int[0];
		this.field4963 = new int[0];
		this.field4977 = new int[0][];
		this.field4978 = new Object[0];
		this.field4981 = new Object[0][];
	}

	@ObfuscatedName("pw.aq(IIB)V")
	public void method7652(int arg0, int arg1) {
		this.field4924 = arg0;
		this.field4925 = arg1;
		if (this.field4919 == null) {
			this.field4927.method7787(this, class411.field4948.field4955, this.field4920, this.field4924, (byte) 0, true);
		} else {
			class409.method3822(this.field4920, this.field4919, this);
		}
	}

	@ObfuscatedName("pw.ao(I[BZZB)V")
	public void method7651(int arg0, byte[] arg1, boolean arg2, boolean arg3) {
		if (arg2) {
			if (this.field4921 == 1) {
				throw new RuntimeException();
			}
			if (this.field4919 != null) {
				int var5 = this.field4920;
				class516 var6 = this.field4919;
				class408 var7 = new class408();
				var7.field4899 = 0;
				var7.field5601 = var5;
				var7.field4897 = arg1;
				var7.field4898 = var6;
				class437 var8 = class409.field4905;
				synchronized (class409.field4905) {
					class409.field4905.method8033(var7);
				}
				Object var10 = class409.field4904;
				synchronized (class409.field4904) {
					if (class409.field4902 == 0) {
						Statics.field4907 = new Thread(new class409());
						Statics.field4907.setDaemon(true);
						Statics.field4907.start();
						Statics.field4907.setPriority(5);
					}
					class409.field4902 = 600;
				}
			}
			this.method7691(arg1);
			this.method7667();
			return;
		}
		arg1[arg1.length - 4] = (byte) (this.field4982[arg0] >> 24);
		arg1[arg1.length - 3] = (byte) (this.field4982[arg0] >> 16);
		arg1[arg1.length - 2] = (byte) (this.field4982[arg0] >> 8);
		arg1[arg1.length - 1] = (byte) this.field4982[arg0];
		if (this.field4918 != null) {
			class516 var12 = this.field4918;
			class408 var13 = new class408();
			var13.field4899 = 0;
			var13.field5601 = arg0;
			var13.field4897 = arg1;
			var13.field4898 = var12;
			class437 var14 = class409.field4905;
			synchronized (class409.field4905) {
				class409.field4905.method8033(var13);
			}
			Object var16 = class409.field4904;
			synchronized (class409.field4904) {
				if (class409.field4902 == 0) {
					Statics.field4907 = new Thread(new class409());
					Statics.field4907.setDaemon(true);
					Statics.field4907.start();
					Statics.field4907.setPriority(5);
				}
				class409.field4902 = 600;
			}
			this.field4923[arg0] = true;
		}
		if (arg3) {
			this.field4978[arg0] = class372.method7554(arg1, false);
		}
	}

	@ObfuscatedName("pw.as(Lto;I[BZI)V")
	public void method7644(class516 arg0, int arg1, byte[] arg2, boolean arg3) {
		if (this.field4919 == arg0) {
			if (this.field4921 == 1) {
				throw new RuntimeException();
			}
			if (arg2 == null) {
				this.field4927.method7787(this, class411.field4948.field4955, this.field4920, this.field4924, (byte) 0, true);
				return;
			}
			field4915.reset();
			field4915.update(arg2, 0, arg2.length);
			int var5 = (int) field4915.getValue();
			if (this.field4924 != var5) {
				this.field4927.method7787(this, class411.field4948.field4955, this.field4920, this.field4924, (byte) 0, true);
				return;
			}
			class591 var6 = new class591(class413.method9799(arg2));
			int var7 = var6.method10339();
			if (var7 < 5 || var7 > 7) {
				throw new RuntimeException(var7 + "," + this.field4920 + "," + arg1);
			}
			int var8 = 0;
			if (var7 >= 6) {
				var8 = var6.method10345();
			}
			if (this.field4925 != var8) {
				this.field4927.method7787(this, class411.field4948.field4955, this.field4920, this.field4924, (byte) 0, true);
				return;
			}
			this.method7691(arg2);
			this.method7667();
			return;
		}
		if (!arg3 && this.field4911 == arg1) {
			this.field4921 = 1;
		}
		if (arg2 == null || arg2.length <= 2) {
			this.field4923[arg1] = false;
			if (this.field4922 || arg3) {
				this.field4927.method7787(this, this.field4920, arg1, this.field4964[arg1], (byte) 4, arg3);
			}
			return;
		}
		field4915.reset();
		field4915.update(arg2, 0, arg2.length - 4);
		int var9 = (int) field4915.getValue();
		int var10 = (arg2[arg2.length - 1] & 0xFF) + ((arg2[arg2.length - 2] & 0xFF) << 8) + ((arg2[arg2.length - 4] & 0xFF) << 24) + ((arg2[arg2.length - 3] & 0xFF) << 16);
		if (this.field4964[arg1] != var9 || this.field4982[arg1] != var10) {
			field4915.reset();
			field4915.update(arg2, 0, arg2.length - 2);
			var9 = (int) field4915.getValue();
			var10 = ((arg2[arg2.length - 2] & 0xFF) << 8) + (arg2[arg2.length - 1] & 0xFF);
		}
		if (this.field4964[arg1] != var9 || this.field4982[arg1] != var10) {
			this.field4923[arg1] = false;
			if (this.field4922 || arg3) {
				this.field4927.method7787(this, this.field4920, arg1, this.field4964[arg1], (byte) 4, arg3);
			}
			return;
		}
		this.field4923[arg1] = true;
		if (arg3) {
			this.field4978[arg1] = class372.method7554(arg2, false);
		}
	}

	@ObfuscatedName("pw.al(B)V")
	public void method7667() {
		this.field4923 = new boolean[this.field4978.length];
		for (int var1 = 0; var1 < this.field4923.length; var1++) {
			this.field4923[var1] = false;
		}
		if (this.field4918 == null) {
			this.field4921 = 1;
			return;
		}
		this.field4911 = -1;
		for (int var2 = 0; var2 < this.field4923.length; var2++) {
			if (this.field4963[var2] > 0) {
				class516 var3 = this.field4918;
				class408 var5 = new class408();
				var5.field4899 = 1;
				var5.field5601 = var2;
				var5.field4898 = var3;
				var5.field4900 = this;
				class437 var6 = class409.field4905;
				synchronized (class409.field4905) {
					class409.field4905.method8033(var5);
				}
				Object var8 = class409.field4904;
				synchronized (class409.field4904) {
					if (class409.field4902 == 0) {
						Statics.field4907 = new Thread(new class409());
						Statics.field4907.setDaemon(true);
						Statics.field4907.start();
						Statics.field4907.setPriority(5);
					}
					class409.field4902 = 600;
				}
				this.field4911 = var2;
			}
		}
		if (this.field4911 == -1) {
			this.field4921 = 1;
		}
	}

	@ObfuscatedName("pw.au(II)I")
	public int method7671(int arg0) {
		if (this.field4978[arg0] == null) {
			return this.field4923[arg0] ? 100 : this.field4927.method7792(this.field4920, arg0);
		} else {
			return 100;
		}
	}

	@ObfuscatedName("pw.ai(IB)Z")
	public boolean method7655(int arg0) {
		return this.field4923[arg0];
	}

	@ObfuscatedName("pw.aa(IB)Z")
	public boolean method7656(int arg0) {
		return this.method7708(arg0) != null;
	}

	@ObfuscatedName("pw.am(I)I")
	public int method7657() {
		int var1 = 0;
		int var2 = 0;
		for (int var3 = 0; var3 < this.field4978.length; var3++) {
			if (this.field4963[var3] > 0) {
				var1 += 100;
				var2 += this.method7671(var3);
			}
		}
		if (var1 == 0) {
			return 100;
		} else {
			return var2 * 100 / var1;
		}
	}
}
