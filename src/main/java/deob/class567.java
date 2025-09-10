package deob;

import java.io.EOFException;
import java.io.File;
import java.io.IOException;

@ObfuscatedName("vv")
public class class567 {

	@ObfuscatedName("vv.aw")
	public class566 field5794;

	@ObfuscatedName("vv.at")
	public byte[] field5798;

	@ObfuscatedName("vv.ac")
	public long field5796 = -1L;

	@ObfuscatedName("vv.ap")
	public int field5797;

	@ObfuscatedName("vv.aq")
	public byte[] field5799;

	@ObfuscatedName("vv.ao")
	public long field5793 = -1L;

	@ObfuscatedName("vv.as")
	public int field5800 = 0;

	@ObfuscatedName("vv.al")
	public long field5804;

	@ObfuscatedName("vv.au")
	public long field5802;

	@ObfuscatedName("vv.ai")
	public long field5805;

	@ObfuscatedName("vv.aa")
	public long field5795;

	public class567(class566 arg0, int arg1, int arg2) throws IOException {
		this.field5794 = arg0;
		this.field5805 = this.field5802 = arg0.method10081();
		this.field5798 = new byte[arg1];
		this.field5799 = new byte[arg2];
		this.field5804 = 0L;
	}

	@ObfuscatedName("vv.af(I)V")
	public void method10091() throws IOException {
		this.method10090();
		this.field5794.method10067();
	}

	@ObfuscatedName("vv.aw(J)V")
	public void method10092(long arg0) throws IOException {
		if (arg0 < 0L) {
			throw new IOException("");
		}
		this.field5804 = arg0;
	}

	@ObfuscatedName("vv.at(B)J")
	public long method10093() {
		return this.field5805;
	}

	@ObfuscatedName("vv.ac(I)Ljava/io/File;")
	public final File method10094() {
		return this.field5794.method10064();
	}

	@ObfuscatedName("vv.ap([BI)V")
	public void method10095(byte[] arg0) throws IOException {
		this.method10096(arg0, 0, arg0.length);
	}

	@ObfuscatedName("vv.aq([BIII)V")
	public void method10096(byte[] arg0, int arg1, int arg2) throws IOException {
		try {
			if (arg1 + arg2 > arg0.length) {
				throw new ArrayIndexOutOfBoundsException(arg1 + arg2 - arg0.length);
			}
			if (this.field5793 != -1L && this.field5804 >= this.field5793 && this.field5804 + (long) arg2 <= this.field5793 + (long) this.field5800) {
				System.arraycopy(this.field5799, (int) (this.field5804 - this.field5793), arg0, arg1, arg2);
				this.field5804 += arg2;
				return;
			}
			long var4 = this.field5804;
			int var6 = arg1;
			int var7 = arg2;
			if (this.field5804 >= this.field5796 && this.field5804 < this.field5796 + (long) this.field5797) {
				int var8 = (int) ((long) this.field5797 - (this.field5804 - this.field5796));
				if (var8 > arg2) {
					var8 = arg2;
				}
				System.arraycopy(this.field5798, (int) (this.field5804 - this.field5796), arg0, arg1, var8);
				this.field5804 += var8;
				arg1 += var8;
				arg2 -= var8;
			}
			if (arg2 > this.field5798.length) {
				this.field5794.method10065(this.field5804);
				this.field5795 = this.field5804;
				while (arg2 > 0) {
					int var9 = this.field5794.method10070(arg0, arg1, arg2);
					if (var9 == -1) {
						break;
					}
					this.field5795 += var9;
					this.field5804 += var9;
					arg1 += var9;
					arg2 -= var9;
				}
			} else if (arg2 > 0) {
				this.method10097();
				int var10 = arg2;
				if (arg2 > this.field5797) {
					var10 = this.field5797;
				}
				System.arraycopy(this.field5798, 0, arg0, arg1, var10);
				arg1 += var10;
				arg2 -= var10;
				this.field5804 += var10;
			}
			if (this.field5793 != -1L) {
				if (this.field5793 > this.field5804 && arg2 > 0) {
					int var11 = (int) (this.field5793 - this.field5804) + arg1;
					if (var11 > arg1 + arg2) {
						var11 = arg1 + arg2;
					}
					while (arg1 < var11) {
						arg0[arg1++] = 0;
						arg2--;
						this.field5804++;
					}
				}
				long var12 = -1L;
				long var14 = -1L;
				if (this.field5793 >= var4 && this.field5793 < (long) var7 + var4) {
					var12 = this.field5793;
				} else if (var4 >= this.field5793 && var4 < this.field5793 + (long) this.field5800) {
					var12 = var4;
				}
				if (this.field5793 + (long) this.field5800 > var4 && this.field5793 + (long) this.field5800 <= (long) var7 + var4) {
					var14 = this.field5793 + (long) this.field5800;
				} else if ((long) var7 + var4 > this.field5793 && (long) var7 + var4 <= this.field5793 + (long) this.field5800) {
					var14 = (long) var7 + var4;
				}
				if (var12 > -1L && var14 > var12) {
					int var16 = (int) (var14 - var12);
					System.arraycopy(this.field5799, (int) (var12 - this.field5793), arg0, (int) (var12 - var4) + var6, var16);
					if (var14 > this.field5804) {
						arg2 = (int) ((long) arg2 - (var14 - this.field5804));
						this.field5804 = var14;
					}
				}
			}
		} catch (IOException var18) {
			this.field5795 = -1L;
			throw var18;
		}
		if (arg2 > 0) {
			throw new EOFException();
		}
	}

	@ObfuscatedName("vv.ao(B)V")
	public void method10097() throws IOException {
		this.field5797 = 0;
		if (this.field5804 != this.field5795) {
			this.field5794.method10065(this.field5804);
			this.field5795 = this.field5804;
		}
		this.field5796 = this.field5804;
		while (this.field5797 < this.field5798.length) {
			int var1 = this.field5798.length - this.field5797;
			if (var1 > 200000000) {
				var1 = 200000000;
			}
			int var2 = this.field5794.method10070(this.field5798, this.field5797, var1);
			if (var2 == -1) {
				break;
			}
			this.field5795 += var2;
			this.field5797 += var2;
		}
	}

	@ObfuscatedName("vv.as([BIII)V")
	public void method10113(byte[] arg0, int arg1, int arg2) throws IOException {
		try {
			if (this.field5804 + (long) arg2 > this.field5805) {
				this.field5805 = this.field5804 + (long) arg2;
			}
			if (this.field5793 != -1L && (this.field5804 < this.field5793 || this.field5804 > this.field5793 + (long) this.field5800)) {
				this.method10090();
			}
			if (this.field5793 != -1L && this.field5804 + (long) arg2 > this.field5793 + (long) this.field5799.length) {
				int var4 = (int) ((long) this.field5799.length - (this.field5804 - this.field5793));
				System.arraycopy(arg0, arg1, this.field5799, (int) (this.field5804 - this.field5793), var4);
				this.field5804 += var4;
				arg1 += var4;
				arg2 -= var4;
				this.field5800 = this.field5799.length;
				this.method10090();
			}
			if (arg2 > this.field5799.length) {
				if (this.field5804 != this.field5795) {
					this.field5794.method10065(this.field5804);
					this.field5795 = this.field5804;
				}
				this.field5794.method10085(arg0, arg1, arg2);
				this.field5795 += arg2;
				if (this.field5795 > this.field5802) {
					this.field5802 = this.field5795;
				}
				long var5 = -1L;
				long var7 = -1L;
				if (this.field5804 >= this.field5796 && this.field5804 < this.field5796 + (long) this.field5797) {
					var5 = this.field5804;
				} else if (this.field5796 >= this.field5804 && this.field5796 < this.field5804 + (long) arg2) {
					var5 = this.field5796;
				}
				if (this.field5804 + (long) arg2 > this.field5796 && this.field5804 + (long) arg2 <= this.field5796 + (long) this.field5797) {
					var7 = this.field5804 + (long) arg2;
				} else if (this.field5796 + (long) this.field5797 > this.field5804 && this.field5796 + (long) this.field5797 <= this.field5804 + (long) arg2) {
					var7 = this.field5796 + (long) this.field5797;
				}
				if (var5 > -1L && var7 > var5) {
					int var9 = (int) (var7 - var5);
					System.arraycopy(arg0, (int) ((long) arg1 + var5 - this.field5804), this.field5798, (int) (var5 - this.field5796), var9);
				}
				this.field5804 += arg2;
			} else if (arg2 > 0) {
				if (this.field5793 == -1L) {
					this.field5793 = this.field5804;
				}
				System.arraycopy(arg0, arg1, this.field5799, (int) (this.field5804 - this.field5793), arg2);
				this.field5804 += arg2;
				if (this.field5804 - this.field5793 > (long) this.field5800) {
					this.field5800 = (int) (this.field5804 - this.field5793);
				}
			}
		} catch (IOException var11) {
			this.field5795 = -1L;
			throw var11;
		}
	}

	@ObfuscatedName("vv.al(I)V")
	public void method10090() throws IOException {
		if (this.field5793 == -1L) {
			return;
		}
		if (this.field5795 != this.field5793) {
			this.field5794.method10065(this.field5793);
			this.field5795 = this.field5793;
		}
		this.field5794.method10085(this.field5799, 0, this.field5800);
		this.field5795 += (long) (this.field5800 * 843775655) * 677300503L;
		if (this.field5795 > this.field5802) {
			this.field5802 = this.field5795;
		}
		long var1 = -1L;
		long var3 = -1L;
		if (this.field5793 >= this.field5796 && this.field5793 < this.field5796 + (long) this.field5797) {
			var1 = this.field5793;
		} else if (this.field5796 >= this.field5793 && this.field5796 < this.field5793 + (long) this.field5800) {
			var1 = this.field5796;
		}
		if (this.field5793 + (long) this.field5800 > this.field5796 && this.field5793 + (long) this.field5800 <= this.field5796 + (long) this.field5797) {
			var3 = this.field5793 + (long) this.field5800;
		} else if (this.field5796 + (long) this.field5797 > this.field5793 && this.field5796 + (long) this.field5797 <= this.field5793 + (long) this.field5800) {
			var3 = this.field5796 + (long) this.field5797;
		}
		if (var1 > -1L && var3 > var1) {
			int var5 = (int) (var3 - var1);
			System.arraycopy(this.field5799, (int) (var1 - this.field5793), this.field5798, (int) (var1 - this.field5796), var5);
		}
		this.field5793 = -1L;
		this.field5800 = 0;
	}
}
