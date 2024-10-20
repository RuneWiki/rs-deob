package deob;

@ObfuscatedName("eb")
public class class151 {

    @ObfuscatedName("eb.w")
    public boolean field1716;

    @ObfuscatedName("eb.v")
    public boolean field1730;

    @ObfuscatedName("eb.s")
    public long field1718;

    @ObfuscatedName("eb.z")
    public int field1719 = 0;

    @ObfuscatedName("eb.j")
    public String field1720 = null;

    @ObfuscatedName("eb.i")
    public int field1721 = 0;

    @ObfuscatedName("eb.n")
    public boolean field1722;

    @ObfuscatedName("eb.l")
    public byte field1723;

    @ObfuscatedName("eb.k")
    public byte field1741;

    @ObfuscatedName("eb.c")
    public byte field1737;

    @ObfuscatedName("eb.r")
    public byte field1726;

    @ObfuscatedName("eb.b")
    public int field1724;

    @ObfuscatedName("eb.m")
    public long[] field1728;

    @ObfuscatedName("eb.t")
    public byte[] field1738;

    @ObfuscatedName("eb.h")
    public int[] field1729;

    @ObfuscatedName("eb.p")
    public int[] field1731;

    @ObfuscatedName("eb.o")
    public int[] field1732;

    @ObfuscatedName("eb.u")
    public boolean[] field1733;

    @ObfuscatedName("eb.x")
    public int field1727 = -1;

    @ObfuscatedName("eb.a")
    public int field1735 = -1;

    @ObfuscatedName("eb.q")
    public int field1734;

    @ObfuscatedName("eb.d")
    public long[] field1717;

    @ObfuscatedName("eb.e")
    public String[] field1715;

    @ObfuscatedName("eb.g")
    public String[] field1739;

    @ObfuscatedName("eb.y")
    public class450 field1740;

    public class151(class474 arg0) {
        this.method3057(arg0);
    }

    @ObfuscatedName("eb.f(II)V")
    public void method3078(int arg0) {
        if (this.field1716) {
            if (this.field1728 == null) {
                this.field1728 = new long[arg0];
            } else {
                System.arraycopy(this.field1728, 0, this.field1728 = new long[arg0], 0, this.field1724);
            }
        }
        if (this.field1730) {
            if (this.field1715 == null) {
                this.field1715 = new String[arg0];
            } else {
                System.arraycopy(this.field1715, 0, this.field1715 = new String[arg0], 0, this.field1724);
            }
        }
        if (this.field1738 == null) {
            this.field1738 = new byte[arg0];
        } else {
            System.arraycopy(this.field1738, 0, this.field1738 = new byte[arg0], 0, this.field1724);
        }
        if (this.field1731 == null) {
            this.field1731 = new int[arg0];
        } else {
            System.arraycopy(this.field1731, 0, this.field1731 = new int[arg0], 0, this.field1724);
        }
        if (this.field1732 == null) {
            this.field1732 = new int[arg0];
        } else {
            System.arraycopy(this.field1732, 0, this.field1732 = new int[arg0], 0, this.field1724);
        }
        if (this.field1733 == null) {
            this.field1733 = new boolean[arg0];
        } else {
            System.arraycopy(this.field1733, 0, this.field1733 = new boolean[arg0], 0, this.field1724);
        }
    }

    @ObfuscatedName("eb.w(II)V")
    public void method3038(int arg0) {
        if (this.field1716) {
            if (this.field1717 == null) {
                this.field1717 = new long[arg0];
            } else {
                System.arraycopy(this.field1717, 0, this.field1717 = new long[arg0], 0, this.field1734);
            }
        }
        if (!this.field1730) {
            return;
        }
        if (this.field1739 == null) {
            this.field1739 = new String[arg0];
        } else {
            System.arraycopy(this.field1739, 0, this.field1739 = new String[arg0], 0, this.field1734);
        }
    }

    @ObfuscatedName("eb.v(Ljava/lang/String;I)I")
    public int method3080(String arg0) {
        if (arg0 == null || arg0.length() == 0) {
            return -1;
        }
        for (int var2 = 0; var2 < this.field1724; var2++) {
            if (this.field1715[var2].equals(arg0)) {
                return var2;
            }
        }
        return -1;
    }

    @ObfuscatedName("eb.s(IIIB)I")
    public int method3026(int arg0, int arg1, int arg2) {
        int var4 = arg2 == 31 ? -1 : (0x1 << arg2 + 1) - 1;
        return (this.field1731[arg0] & var4) >>> arg1;
    }

    @ObfuscatedName("eb.z(II)Ljava/lang/Integer;")
    public Integer method3027(int arg0) {
        if (this.field1740 == null) {
            return null;
        } else {
            class440 var2 = this.field1740.method7691((long) arg0);
            return var2 != null && var2 instanceof class439 ? Integer.valueOf(((class439) var2).field4708) : null;
        }
    }

    @ObfuscatedName("eb.j(B)[I")
    public int[] method3094() {
        if (this.field1729 == null) {
            String[] var1 = new String[this.field1724];
            this.field1729 = new int[this.field1724];
            int var2 = 0;
            while (var2 < this.field1724) {
                var1[var2] = this.field1715[var2];
                if (var1[var2] != null) {
                    var1[var2] = var1[var2].toLowerCase();
                }
                this.field1729[var2] = var2++;
            }
            int[] var3 = this.field1729;
            class471.method4498(var1, var3, 0, var1.length - 1);
        }
        return this.field1729;
    }

    @ObfuscatedName("eb.i(JLjava/lang/String;IB)V")
    public void method3029(long arg0, String arg1, int arg2) {
        if (arg1 != null && arg1.length() == 0) {
            arg1 = null;
        }
        if (this.field1716 != arg0 > 0L) {
            throw new RuntimeException("");
        } else if (this.field1730 == (arg1 != null)) {
            if (arg0 > 0L && (this.field1728 == null || this.field1724 >= this.field1728.length) || arg1 != null && (this.field1715 == null || this.field1724 >= this.field1715.length)) {
                this.method3078(this.field1724 + 5);
            }
            if (this.field1728 != null) {
                this.field1728[this.field1724] = arg0;
            }
            if (this.field1715 != null) {
                this.field1715[this.field1724] = arg1;
            }
            if (this.field1727 == -1) {
                this.field1727 = this.field1724;
                this.field1738[this.field1724] = 126;
            } else {
                this.field1738[this.field1724] = 0;
            }
            this.field1731[this.field1724] = 0;
            this.field1732[this.field1724] = arg2;
            this.field1733[this.field1724] = false;
            this.field1724++;
            this.field1729 = null;
        } else {
            throw new RuntimeException("");
        }
    }

    @ObfuscatedName("eb.n(II)V")
    public void method3030(int arg0) {
        if (arg0 < 0 || arg0 >= this.field1724) {
            throw new RuntimeException("");
        }
        this.field1724--;
        this.field1729 = null;
        if (this.field1724 == 0) {
            this.field1728 = null;
            this.field1715 = null;
            this.field1738 = null;
            this.field1731 = null;
            this.field1732 = null;
            this.field1733 = null;
            this.field1727 = -1;
            this.field1735 = -1;
            return;
        }
        System.arraycopy(this.field1738, arg0 + 1, this.field1738, arg0, this.field1724 - arg0);
        System.arraycopy(this.field1731, arg0 + 1, this.field1731, arg0, this.field1724 - arg0);
        System.arraycopy(this.field1732, arg0 + 1, this.field1732, arg0, this.field1724 - arg0);
        System.arraycopy(this.field1733, arg0 + 1, this.field1733, arg0, this.field1724 - arg0);
        if (this.field1728 != null) {
            System.arraycopy(this.field1728, arg0 + 1, this.field1728, arg0, this.field1724 - arg0);
        }
        if (this.field1715 != null) {
            System.arraycopy(this.field1715, arg0 + 1, this.field1715, arg0, this.field1724 - arg0);
        }
        this.method3024();
    }

    @ObfuscatedName("eb.l(I)V")
    public void method3024() {
        if (this.field1724 == 0) {
            this.field1727 = -1;
            this.field1735 = -1;
            return;
        }
        this.field1727 = -1;
        this.field1735 = -1;
        int var1 = 0;
        byte var2 = this.field1738[0];
        for (int var3 = 1; var3 < this.field1724; var3++) {
            if (this.field1738[var3] > var2) {
                if (var2 == 125) {
                    this.field1735 = var1;
                }
                var1 = var3;
                var2 = this.field1738[var3];
            } else if (this.field1735 == -1 && this.field1738[var3] == 125) {
                this.field1735 = var3;
            }
        }
        this.field1727 = var1;
        if (this.field1727 != -1) {
            this.field1738[this.field1727] = 126;
        }
    }

    @ObfuscatedName("eb.k(JLjava/lang/String;I)V")
    public void method3032(long arg0, String arg1) {
        if (arg1 != null && arg1.length() == 0) {
            arg1 = null;
        }
        if (this.field1716 != arg0 > 0L) {
            throw new RuntimeException("");
        } else if (arg1 != null == this.field1730) {
            if (arg0 > 0L && (this.field1717 == null || this.field1734 >= this.field1717.length) || arg1 != null && (this.field1739 == null || this.field1734 >= this.field1739.length)) {
                this.method3038(this.field1734 + 5);
            }
            if (this.field1717 != null) {
                this.field1717[this.field1734] = arg0;
            }
            if (this.field1739 != null) {
                this.field1739[this.field1734] = arg1;
            }
            this.field1734++;
        } else {
            throw new RuntimeException("");
        }
    }

    @ObfuscatedName("eb.c(II)V")
    public void method3023(int arg0) {
        this.field1734--;
        if (this.field1734 == 0) {
            this.field1717 = null;
            this.field1739 = null;
            return;
        }
        if (this.field1717 != null) {
            System.arraycopy(this.field1717, arg0 + 1, this.field1717, arg0, this.field1734 - arg0);
        }
        if (this.field1739 != null) {
            System.arraycopy(this.field1739, arg0 + 1, this.field1739, arg0, this.field1734 - arg0);
        }
    }

    @ObfuscatedName("eb.r(IBI)I")
    public int method3060(int arg0, byte arg1) {
        if (arg1 == 126 || arg1 == 127) {
            return -1;
        } else if (this.field1727 == arg0 && (this.field1735 == -1 || this.field1738[this.field1735] < 125)) {
            return -1;
        } else if (this.field1738[arg0] == arg1) {
            return -1;
        } else {
            this.field1738[arg0] = arg1;
            this.method3024();
            return arg0;
        }
    }

    @ObfuscatedName("eb.b(II)Z")
    public boolean method3064(int arg0) {
        if (this.field1727 == arg0 || this.field1738[arg0] == 126) {
            return false;
        }
        this.field1738[this.field1727] = 125;
        this.field1735 = this.field1727;
        this.field1738[arg0] = 126;
        this.field1727 = arg0;
        return true;
    }

    @ObfuscatedName("eb.m(IZB)I")
    public int method3036(int arg0, boolean arg1) {
        if (this.field1733[arg0] == arg1) {
            return -1;
        } else {
            this.field1733[arg0] = arg1;
            return arg0;
        }
    }

    @ObfuscatedName("eb.t(IIIII)I")
    public int method3043(int arg0, int arg1, int arg2, int arg3) {
        int var5 = (0x1 << arg2) - 1;
        int var6 = arg3 == 31 ? -1 : (0x1 << arg3 + 1) - 1;
        int var7 = var6 ^ var5;
        int var8 = arg1 << arg2;
        int var9 = var8 & var7;
        int var10 = this.field1731[arg0];
        if ((var10 & var7) == var9) {
            return -1;
        } else {
            int var11 = var10 & ~var7;
            this.field1731[arg0] = var11 | var9;
            return arg0;
        }
    }

    @ObfuscatedName("eb.h(III)Z")
    public boolean method3033(int arg0, int arg1) {
        if (this.field1740 == null) {
            this.field1740 = new class450(4);
        } else {
            class440 var3 = this.field1740.method7691((long) arg0);
            if (var3 != null) {
                if (var3 instanceof class439) {
                    class439 var4 = (class439) var3;
                    if (var4.field4708 == arg1) {
                        return false;
                    }
                    var4.field4708 = arg1;
                    return true;
                }
                var3.method7431();
            }
        }
        this.field1740.method7693(new class439(arg1), (long) arg0);
        return true;
    }

    @ObfuscatedName("eb.p(IIIII)Z")
    public boolean method3039(int arg0, int arg1, int arg2, int arg3) {
        int var5 = (0x1 << arg2) - 1;
        int var6 = arg3 == 31 ? -1 : (0x1 << arg3 + 1) - 1;
        int var7 = var6 ^ var5;
        int var8 = arg1 << arg2;
        int var9 = var8 & var7;
        if (this.field1740 == null) {
            this.field1740 = new class450(4);
        } else {
            class440 var10 = this.field1740.method7691((long) arg0);
            if (var10 != null) {
                if (var10 instanceof class439) {
                    class439 var11 = (class439) var10;
                    if ((var11.field4708 & var7) == var9) {
                        return false;
                    }
                    var11.field4708 &= ~var7;
                    var11.field4708 |= var9;
                    return true;
                }
                var10.method7431();
            }
        }
        this.field1740.method7693(new class439(var9), (long) arg0);
        return true;
    }

    @ObfuscatedName("eb.o(IJ)Z")
    public boolean method3040(int arg0, long arg1) {
        if (this.field1740 == null) {
            this.field1740 = new class450(4);
        } else {
            class440 var4 = this.field1740.method7691((long) arg0);
            if (var4 != null) {
                if (var4 instanceof class438) {
                    class438 var5 = (class438) var4;
                    if (var5.field4707 == arg1) {
                        return false;
                    }
                    var5.field4707 = arg1;
                    return true;
                }
                var4.method7431();
            }
        }
        this.field1740.method7693(new class438(arg1), (long) arg0);
        return true;
    }

    @ObfuscatedName("eb.u(ILjava/lang/String;I)Z")
    public boolean method3041(int arg0, String arg1) {
        if (arg1 == null) {
            arg1 = "";
        } else if (arg1.length() > 80) {
            arg1 = arg1.substring(0, 80);
        }
        if (this.field1740 == null) {
            this.field1740 = new class450(4);
        } else {
            class440 var3 = this.field1740.method7691((long) arg0);
            if (var3 != null) {
                if (var3 instanceof class436) {
                    class436 var4 = (class436) var3;
                    if (var4.field4705 instanceof String) {
                        if (arg1.equals(var4.field4705)) {
                            return false;
                        }
                        var4.method7431();
                        this.field1740.method7693(new class436(arg1), var4.field4711);
                        return true;
                    }
                }
                var3.method7431();
            }
        }
        this.field1740.method7693(new class436(arg1), (long) arg0);
        return true;
    }

    @ObfuscatedName("eb.x(Lrd;I)V")
    public void method3057(class474 arg0) {
        int var2 = arg0.method7964();
        if (var2 < 1 || var2 > 6) {
            throw new RuntimeException("" + var2);
        }
        int var3 = arg0.method7964();
        if ((var3 & 0x1) != 0) {
            this.field1716 = true;
        }
        if ((var3 & 0x2) != 0) {
            this.field1730 = true;
        }
        if (!this.field1716) {
            this.field1728 = null;
            this.field1717 = null;
        }
        if (!this.field1730) {
            this.field1715 = null;
            this.field1739 = null;
        }
        this.field1719 = arg0.method7979();
        this.field1721 = arg0.method7979();
        if (var2 <= 3 && this.field1721 != 0) {
            this.field1721 += 16912800;
        }
        this.field1724 = arg0.method8032();
        this.field1734 = arg0.method7964();
        this.field1720 = arg0.method7983();
        if (var2 >= 4) {
            arg0.method7979();
        }
        this.field1722 = arg0.method7964() == 1;
        this.field1723 = arg0.method7965();
        this.field1741 = arg0.method7965();
        this.field1737 = arg0.method7965();
        this.field1726 = arg0.method7965();
        if (this.field1724 > 0) {
            if (this.field1716 && (this.field1728 == null || this.field1728.length < this.field1724)) {
                this.field1728 = new long[this.field1724];
            }
            if (this.field1730 && (this.field1715 == null || this.field1715.length < this.field1724)) {
                this.field1715 = new String[this.field1724];
            }
            if (this.field1738 == null || this.field1738.length < this.field1724) {
                this.field1738 = new byte[this.field1724];
            }
            if (this.field1731 == null || this.field1731.length < this.field1724) {
                this.field1731 = new int[this.field1724];
            }
            if (this.field1732 == null || this.field1732.length < this.field1724) {
                this.field1732 = new int[this.field1724];
            }
            if (this.field1733 == null || this.field1733.length < this.field1724) {
                this.field1733 = new boolean[this.field1724];
            }
            for (int var4 = 0; var4 < this.field1724; var4++) {
                if (this.field1716) {
                    this.field1728[var4] = arg0.method8151();
                }
                if (this.field1730) {
                    this.field1715[var4] = arg0.method7973();
                }
                this.field1738[var4] = arg0.method7965();
                if (var2 >= 2) {
                    this.field1731[var4] = arg0.method7979();
                }
                if (var2 >= 5) {
                    this.field1732[var4] = arg0.method8032();
                } else {
                    this.field1732[var4] = 0;
                }
                if (var2 >= 6) {
                    this.field1733[var4] = arg0.method7964() == 1;
                } else {
                    this.field1733[var4] = false;
                }
            }
            this.method3024();
        }
        if (this.field1734 > 0) {
            if (this.field1716 && (this.field1717 == null || this.field1717.length < this.field1734)) {
                this.field1717 = new long[this.field1734];
            }
            if (this.field1730 && (this.field1739 == null || this.field1739.length < this.field1734)) {
                this.field1739 = new String[this.field1734];
            }
            for (int var5 = 0; var5 < this.field1734; var5++) {
                if (this.field1716) {
                    this.field1717[var5] = arg0.method8151();
                }
                if (this.field1730) {
                    this.field1739[var5] = arg0.method7973();
                }
            }
        }
        if (var2 < 3) {
            return;
        }
        int var6 = arg0.method8032();
        if (var6 <= 0) {
            return;
        }
        this.field1740 = new class450(var6 < 16 ? class289.method16(var6) : 16);
        while (var6-- > 0) {
            int var7 = arg0.method7979();
            int var8 = var7 & 0x3FFFFFFF;
            int var9 = var7 >>> 30;
            if (var9 == 0) {
                int var10 = arg0.method7979();
                this.field1740.method7693(new class439(var10), (long) var8);
            } else if (var9 == 1) {
                long var11 = arg0.method8151();
                this.field1740.method7693(new class438(var11), (long) var8);
            } else if (var9 == 2) {
                String var13 = arg0.method7983();
                this.field1740.method7693(new class436(var13), (long) var8);
            }
        }
    }
}
