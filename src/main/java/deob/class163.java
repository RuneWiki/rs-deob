package deob;

@ObfuscatedName("gs")
public class class163 {

	@ObfuscatedName("gs.ao")
	public long field1846;

	@ObfuscatedName("gs.as")
	public int field1871 = 0;

	@ObfuscatedName("gs.al")
	public String field1861 = null;

	@ObfuscatedName("gs.au")
	public int field1849 = 0;

	@ObfuscatedName("gs.ai")
	public boolean field1848;

	@ObfuscatedName("gs.aa")
	public byte field1851;

	@ObfuscatedName("gs.am")
	public byte field1847;

	@ObfuscatedName("gs.an")
	public byte field1853;

	@ObfuscatedName("gs.ar")
	public byte field1854;

	@ObfuscatedName("gs.ae")
	public int field1855;

	@ObfuscatedName("gs.ay")
	public long[] field1856;

	@ObfuscatedName("gs.ad")
	public byte[] field1857;

	@ObfuscatedName("gs.ag")
	public int[] field1858;

	@ObfuscatedName("gs.av")
	public int[] field1859;

	@ObfuscatedName("gs.ah")
	public boolean[] field1860;

	@ObfuscatedName("gs.ab")
	public int field1866 = -1;

	@ObfuscatedName("gs.ax")
	public int field1862 = -1;

	@ObfuscatedName("gs.ak")
	public int field1863;

	@ObfuscatedName("gs.aj")
	public long[] field1864;

	@ObfuscatedName("gs.az")
	public String[] field1865;

	@ObfuscatedName("gs.bt")
	public String[] field1867;

	@ObfuscatedName("gs.bs")
	public class427 field1850;

	@ObfuscatedName("gs.bu")
	public boolean field1852;

	@ObfuscatedName("gs.bi")
	public boolean field1869;

	@ObfuscatedName("gs.bd")
	public int[] field1841;

	public class163(class591 arg0) {
		this.method3757(arg0);
	}

	@ObfuscatedName("gs.af(IB)V")
	public void method3690(int arg0) {
		if (this.field1852) {
			if (this.field1856 == null) {
				this.field1856 = new long[arg0];
			} else {
				System.arraycopy(this.field1856, 0, this.field1856 = new long[arg0], 0, this.field1855);
			}
		}
		if (this.field1869) {
			if (this.field1865 == null) {
				this.field1865 = new String[arg0];
			} else {
				System.arraycopy(this.field1865, 0, this.field1865 = new String[arg0], 0, this.field1855);
			}
		}
		if (this.field1857 == null) {
			this.field1857 = new byte[arg0];
		} else {
			System.arraycopy(this.field1857, 0, this.field1857 = new byte[arg0], 0, this.field1855);
		}
		if (this.field1858 == null) {
			this.field1858 = new int[arg0];
		} else {
			System.arraycopy(this.field1858, 0, this.field1858 = new int[arg0], 0, this.field1855);
		}
		if (this.field1859 == null) {
			this.field1859 = new int[arg0];
		} else {
			System.arraycopy(this.field1859, 0, this.field1859 = new int[arg0], 0, this.field1855);
		}
		if (this.field1860 == null) {
			this.field1860 = new boolean[arg0];
		} else {
			System.arraycopy(this.field1860, 0, this.field1860 = new boolean[arg0], 0, this.field1855);
		}
	}

	@ObfuscatedName("gs.aw(IS)V")
	public void method3715(int arg0) {
		if (this.field1852) {
			if (this.field1864 == null) {
				this.field1864 = new long[arg0];
			} else {
				System.arraycopy(this.field1864, 0, this.field1864 = new long[arg0], 0, this.field1863);
			}
		}
		if (!this.field1869) {
			return;
		}
		if (this.field1867 == null) {
			this.field1867 = new String[arg0];
		} else {
			System.arraycopy(this.field1867, 0, this.field1867 = new String[arg0], 0, this.field1863);
		}
	}

	@ObfuscatedName("gs.at(Ljava/lang/String;B)I")
	public int method3696(String arg0) {
		if (arg0 == null || arg0.isEmpty()) {
			return -1;
		}
		for (int var2 = 0; var2 < this.field1855; var2++) {
			if (this.field1865[var2].equals(arg0)) {
				return var2;
			}
		}
		return -1;
	}

	@ObfuscatedName("gs.ac(IIII)I")
	public int method3718(int arg0, int arg1, int arg2) {
		int var4 = arg2 == 31 ? -1 : (0x1 << arg2 + 1) - 1;
		return (this.field1858[arg0] & var4) >>> arg1;
	}

	@ObfuscatedName("gs.ap(II)Ljava/lang/Integer;")
	public Integer method3743(int arg0) {
		if (this.field1850 == null) {
			return null;
		} else {
			class545 var2 = this.field1850.method7946((long) arg0);
			return var2 != null && var2 instanceof class544 ? Integer.valueOf(((class544) var2).field5598) : null;
		}
	}

	@ObfuscatedName("gs.aq(I)[I")
	public int[] method3695() {
		if (this.field1841 == null) {
			String[] var1 = new String[this.field1855];
			this.field1841 = new int[this.field1855];
			int var2 = 0;
			while (var2 < this.field1855) {
				var1[var2] = this.field1865[var2];
				if (var1[var2] != null) {
					var1[var2] = var1[var2].toLowerCase();
				}
				this.field1841[var2] = var2++;
			}
			Statics.method5411(var1, this.field1841);
		}
		return this.field1841;
	}

	@ObfuscatedName("gs.ao(JLjava/lang/String;IB)V")
	public void method3737(long arg0, String arg1, int arg2) {
		if (arg1 != null && arg1.isEmpty()) {
			arg1 = null;
		}
		if (this.field1852 != arg0 > 0L) {
			throw new RuntimeException("");
		} else if (this.field1869 == (arg1 != null)) {
			if (arg0 > 0L && (this.field1856 == null || this.field1855 >= this.field1856.length) || arg1 != null && (this.field1865 == null || this.field1855 >= this.field1865.length)) {
				this.method3690(this.field1855 + 5);
			}
			if (this.field1856 != null) {
				this.field1856[this.field1855] = arg0;
			}
			if (this.field1865 != null) {
				this.field1865[this.field1855] = arg1;
			}
			if (this.field1866 == -1) {
				this.field1866 = this.field1855;
				this.field1857[this.field1855] = 126;
			} else {
				this.field1857[this.field1855] = 0;
			}
			this.field1858[this.field1855] = 0;
			this.field1859[this.field1855] = arg2;
			this.field1860[this.field1855] = false;
			this.field1855++;
			this.field1841 = null;
		} else {
			throw new RuntimeException("");
		}
	}

	@ObfuscatedName("gs.as(II)V")
	public void method3697(int arg0) {
		if (arg0 < 0 || arg0 >= this.field1855) {
			throw new RuntimeException("");
		}
		this.field1855--;
		this.field1841 = null;
		if (this.field1855 == 0) {
			this.field1856 = null;
			this.field1865 = null;
			this.field1857 = null;
			this.field1858 = null;
			this.field1859 = null;
			this.field1860 = null;
			this.field1866 = -1;
			this.field1862 = -1;
			return;
		}
		System.arraycopy(this.field1857, arg0 + 1, this.field1857, arg0, this.field1855 - arg0);
		System.arraycopy(this.field1858, arg0 + 1, this.field1858, arg0, this.field1855 - arg0);
		System.arraycopy(this.field1859, arg0 + 1, this.field1859, arg0, this.field1855 - arg0);
		System.arraycopy(this.field1860, arg0 + 1, this.field1860, arg0, this.field1855 - arg0);
		if (this.field1856 != null) {
			System.arraycopy(this.field1856, arg0 + 1, this.field1856, arg0, this.field1855 - arg0);
		}
		if (this.field1865 != null) {
			System.arraycopy(this.field1865, arg0 + 1, this.field1865, arg0, this.field1855 - arg0);
		}
		this.method3698();
	}

	@ObfuscatedName("gs.al(I)V")
	public void method3698() {
		if (this.field1855 == 0) {
			this.field1866 = -1;
			this.field1862 = -1;
			return;
		}
		this.field1866 = -1;
		this.field1862 = -1;
		int var1 = 0;
		byte var2 = this.field1857[0];
		for (int var3 = 1; var3 < this.field1855; var3++) {
			if (this.field1857[var3] > var2) {
				if (var2 == 125) {
					this.field1862 = var1;
				}
				var1 = var3;
				var2 = this.field1857[var3];
			} else if (this.field1862 == -1 && this.field1857[var3] == 125) {
				this.field1862 = var3;
			}
		}
		this.field1866 = var1;
		if (this.field1866 != -1) {
			this.field1857[this.field1866] = 126;
		}
	}

	@ObfuscatedName("gs.au(JLjava/lang/String;S)V")
	public void method3762(long arg0, String arg1) {
		if (arg1 != null && arg1.isEmpty()) {
			arg1 = null;
		}
		if (this.field1852 != arg0 > 0L) {
			throw new RuntimeException("");
		} else if ((arg1 != null) == this.field1869) {
			if (arg0 > 0L && (this.field1864 == null || this.field1863 >= this.field1864.length) || arg1 != null && (this.field1867 == null || this.field1863 >= this.field1867.length)) {
				this.method3715(this.field1863 + 5);
			}
			if (this.field1864 != null) {
				this.field1864[this.field1863] = arg0;
			}
			if (this.field1867 != null) {
				this.field1867[this.field1863] = arg1;
			}
			this.field1863++;
		} else {
			throw new RuntimeException("");
		}
	}

	@ObfuscatedName("gs.ai(II)V")
	public void method3700(int arg0) {
		this.field1863--;
		if (this.field1863 == 0) {
			this.field1864 = null;
			this.field1867 = null;
			return;
		}
		if (this.field1864 != null) {
			System.arraycopy(this.field1864, arg0 + 1, this.field1864, arg0, this.field1863 - arg0);
		}
		if (this.field1867 != null) {
			System.arraycopy(this.field1867, arg0 + 1, this.field1867, arg0, this.field1863 - arg0);
		}
	}

	@ObfuscatedName("gs.aa(IBB)I")
	public int method3701(int arg0, byte arg1) {
		if (arg1 == 126 || arg1 == 127) {
			return -1;
		} else if (this.field1866 == arg0 && (this.field1862 == -1 || this.field1857[this.field1862] < 125)) {
			return -1;
		} else if (this.field1857[arg0] == arg1) {
			return -1;
		} else {
			this.field1857[arg0] = arg1;
			this.method3698();
			return arg0;
		}
	}

	@ObfuscatedName("gs.am(II)Z")
	public boolean method3702(int arg0) {
		if (this.field1866 == arg0 || this.field1857[arg0] == 126) {
			return false;
		}
		this.field1857[this.field1866] = 125;
		this.field1862 = this.field1866;
		this.field1857[arg0] = 126;
		this.field1866 = arg0;
		return true;
	}

	@ObfuscatedName("gs.an(IZI)I")
	public int method3703(int arg0, boolean arg1) {
		if (this.field1860[arg0] == arg1) {
			return -1;
		} else {
			this.field1860[arg0] = arg1;
			return arg0;
		}
	}

	@ObfuscatedName("gs.ar(IIIII)I")
	public int method3704(int arg0, int arg1, int arg2, int arg3) {
		int var5 = (0x1 << arg2) - 1;
		int var6 = arg3 == 31 ? -1 : (0x1 << arg3 + 1) - 1;
		int var7 = var6 ^ var5;
		int var8 = arg1 << arg2;
		int var9 = var8 & var7;
		int var10 = this.field1858[arg0];
		if ((var10 & var7) == var9) {
			return -1;
		} else {
			int var11 = var10 & ~var7;
			this.field1858[arg0] = var11 | var9;
			return arg0;
		}
	}

	@ObfuscatedName("gs.ae(IIB)Z")
	public boolean method3756(int arg0, int arg1) {
		if (this.field1850 == null) {
			this.field1850 = new class427(4);
		} else {
			class545 var3 = this.field1850.method7946((long) arg0);
			if (var3 != null) {
				if (var3 instanceof class544) {
					class544 var4 = (class544) var3;
					if (var4.field5598 == arg1) {
						return false;
					}
					var4.field5598 = arg1;
					return true;
				}
				var3.method2234();
			}
		}
		this.field1850.method7940(new class544(arg1), (long) arg0);
		return true;
	}

	@ObfuscatedName("gs.ay(IIIIB)Z")
	public boolean method3706(int arg0, int arg1, int arg2, int arg3) {
		int var5 = (0x1 << arg2) - 1;
		int var6 = arg3 == 31 ? -1 : (0x1 << arg3 + 1) - 1;
		int var7 = var6 ^ var5;
		int var8 = arg1 << arg2;
		int var9 = var8 & var7;
		if (this.field1850 == null) {
			this.field1850 = new class427(4);
		} else {
			class545 var10 = this.field1850.method7946((long) arg0);
			if (var10 != null) {
				if (var10 instanceof class544) {
					class544 var11 = (class544) var10;
					if ((var11.field5598 & var7) == var9) {
						return false;
					}
					var11.field5598 &= ~var7;
					var11.field5598 |= var9;
					return true;
				}
				var10.method2234();
			}
		}
		this.field1850.method7940(new class544(var9), (long) arg0);
		return true;
	}

	@ObfuscatedName("gs.ad(IJ)Z")
	public boolean method3749(int arg0, long arg1) {
		if (this.field1850 == null) {
			this.field1850 = new class427(4);
		} else {
			class545 var4 = this.field1850.method7946((long) arg0);
			if (var4 != null) {
				if (var4 instanceof class543) {
					class543 var5 = (class543) var4;
					if (var5.field5597 == arg1) {
						return false;
					}
					var5.field5597 = arg1;
					return true;
				}
				var4.method2234();
			}
		}
		this.field1850.method7940(new class543(arg1), (long) arg0);
		return true;
	}

	@ObfuscatedName("gs.ag(ILjava/lang/String;B)Z")
	public boolean method3708(int arg0, String arg1) {
		if (arg1 == null) {
			arg1 = "";
		} else if (arg1.length() > 80) {
			arg1 = arg1.substring(0, 80);
		}
		if (this.field1850 == null) {
			this.field1850 = new class427(4);
		} else {
			class545 var3 = this.field1850.method7946((long) arg0);
			if (var3 != null) {
				if (var3 instanceof class542) {
					class542 var4 = (class542) var3;
					if (var4.field5596 instanceof String) {
						if (arg1.equals(var4.field5596)) {
							return false;
						}
						var4.method2234();
						this.field1850.method7940(new class542(arg1), var4.field5601);
						return true;
					}
				}
				var3.method2234();
			}
		}
		this.field1850.method7940(new class542(arg1), (long) arg0);
		return true;
	}

	@ObfuscatedName("gs.av(Lwb;I)V")
	public void method3757(class591 arg0) {
		int var2 = arg0.method10339();
		if (var2 < 1 || var2 > 6) {
			throw new RuntimeException("" + var2);
		}
		int var3 = arg0.method10339();
		if ((var3 & 0x1) != 0) {
			this.field1852 = true;
		}
		if ((var3 & 0x2) != 0) {
			this.field1869 = true;
		}
		if (!this.field1852) {
			this.field1856 = null;
			this.field1864 = null;
		}
		if (!this.field1869) {
			this.field1865 = null;
			this.field1867 = null;
		}
		this.field1871 = arg0.method10345();
		this.field1849 = arg0.method10345();
		if (var2 <= 3 && this.field1849 != 0) {
			this.field1849 += 16912800;
		}
		this.field1855 = arg0.method10341();
		this.field1863 = arg0.method10339();
		this.field1861 = arg0.method10350();
		if (var2 >= 4) {
			arg0.method10345();
		}
		this.field1848 = arg0.method10339() == 1;
		this.field1851 = arg0.method10340();
		this.field1847 = arg0.method10340();
		this.field1853 = arg0.method10340();
		this.field1854 = arg0.method10340();
		if (this.field1855 > 0) {
			if (this.field1852 && (this.field1856 == null || this.field1856.length < this.field1855)) {
				this.field1856 = new long[this.field1855];
			}
			if (this.field1869 && (this.field1865 == null || this.field1865.length < this.field1855)) {
				this.field1865 = new String[this.field1855];
			}
			if (this.field1857 == null || this.field1857.length < this.field1855) {
				this.field1857 = new byte[this.field1855];
			}
			if (this.field1858 == null || this.field1858.length < this.field1855) {
				this.field1858 = new int[this.field1855];
			}
			if (this.field1859 == null || this.field1859.length < this.field1855) {
				this.field1859 = new int[this.field1855];
			}
			if (this.field1860 == null || this.field1860.length < this.field1855) {
				this.field1860 = new boolean[this.field1855];
			}
			for (int var4 = 0; var4 < this.field1855; var4++) {
				if (this.field1852) {
					this.field1856[var4] = arg0.method10346();
				}
				if (this.field1869) {
					this.field1865[var4] = arg0.method10349();
				}
				this.field1857[var4] = arg0.method10340();
				if (var2 >= 2) {
					this.field1858[var4] = arg0.method10345();
				}
				if (var2 >= 5) {
					this.field1859[var4] = arg0.method10341();
				} else {
					this.field1859[var4] = 0;
				}
				if (var2 >= 6) {
					this.field1860[var4] = arg0.method10339() == 1;
				} else {
					this.field1860[var4] = false;
				}
			}
			this.method3698();
		}
		if (this.field1863 > 0) {
			if (this.field1852 && (this.field1864 == null || this.field1864.length < this.field1863)) {
				this.field1864 = new long[this.field1863];
			}
			if (this.field1869 && (this.field1867 == null || this.field1867.length < this.field1863)) {
				this.field1867 = new String[this.field1863];
			}
			for (int var5 = 0; var5 < this.field1863; var5++) {
				if (this.field1852) {
					this.field1864[var5] = arg0.method10346();
				}
				if (this.field1869) {
					this.field1867[var5] = arg0.method10349();
				}
			}
		}
		if (var2 < 3) {
			return;
		}
		int var6 = arg0.method10341();
		if (var6 <= 0) {
			return;
		}
		this.field1850 = new class427(var6 < 16 ? class337.method3774(var6) : 16);
		while (var6-- > 0) {
			int var7 = arg0.method10345();
			int var8 = var7 & 0x3FFFFFFF;
			int var9 = var7 >>> 30;
			if (var9 == 0) {
				int var10 = arg0.method10345();
				this.field1850.method7940(new class544(var10), (long) var8);
			} else if (var9 == 1) {
				long var11 = arg0.method10346();
				this.field1850.method7940(new class543(var11), (long) var8);
			} else if (var9 == 2) {
				String var13 = arg0.method10350();
				this.field1850.method7940(new class542(var13), (long) var8);
			}
		}
	}
}
