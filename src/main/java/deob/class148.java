package deob;

@ObfuscatedName("ep")
public class class148 {

    @ObfuscatedName("ep.e")
    public boolean field1722;

    @ObfuscatedName("ep.v")
    public boolean field1723;

    @ObfuscatedName("ep.x")
    public long field1724;

    @ObfuscatedName("ep.m")
    public int field1747 = 0;

    @ObfuscatedName("ep.q")
    public String field1726 = null;

    @ObfuscatedName("ep.f")
    public int field1727 = 0;

    @ObfuscatedName("ep.r")
    public boolean field1728;

    @ObfuscatedName("ep.u")
    public byte field1729;

    @ObfuscatedName("ep.b")
    public byte field1730;

    @ObfuscatedName("ep.j")
    public byte field1735;

    @ObfuscatedName("ep.g")
    public byte field1732;

    @ObfuscatedName("ep.i")
    public int field1733;

    @ObfuscatedName("ep.o")
    public long[] field1745;

    @ObfuscatedName("ep.n")
    public byte[] field1744;

    @ObfuscatedName("ep.k")
    public int[] field1736;

    @ObfuscatedName("ep.a")
    public int[] field1737;

    @ObfuscatedName("ep.s")
    public int[] field1721;

    @ObfuscatedName("ep.l")
    public boolean[] field1725;

    @ObfuscatedName("ep.t")
    public int field1740 = -1;

    @ObfuscatedName("ep.c")
    public int field1741 = -1;

    @ObfuscatedName("ep.p")
    public int field1742;

    @ObfuscatedName("ep.d")
    public long[] field1739;

    @ObfuscatedName("ep.y")
    public String[] field1738;

    @ObfuscatedName("ep.z")
    public String[] field1743;

    @ObfuscatedName("ep.w")
    public class443 field1746;

    public class148(class467 arg0) {
        this.method2948(arg0);
    }

    @ObfuscatedName("ep.h(II)V")
    public void method2930(int arg0) {
        if (this.field1722) {
            if (this.field1745 == null) {
                this.field1745 = new long[arg0];
            } else {
                System.arraycopy(this.field1745, 0, this.field1745 = new long[arg0], 0, this.field1733);
            }
        }
        if (this.field1723) {
            if (this.field1738 == null) {
                this.field1738 = new String[arg0];
            } else {
                System.arraycopy(this.field1738, 0, this.field1738 = new String[arg0], 0, this.field1733);
            }
        }
        if (this.field1744 == null) {
            this.field1744 = new byte[arg0];
        } else {
            System.arraycopy(this.field1744, 0, this.field1744 = new byte[arg0], 0, this.field1733);
        }
        if (this.field1737 == null) {
            this.field1737 = new int[arg0];
        } else {
            System.arraycopy(this.field1737, 0, this.field1737 = new int[arg0], 0, this.field1733);
        }
        if (this.field1721 == null) {
            this.field1721 = new int[arg0];
        } else {
            System.arraycopy(this.field1721, 0, this.field1721 = new int[arg0], 0, this.field1733);
        }
        if (this.field1725 == null) {
            this.field1725 = new boolean[arg0];
        } else {
            System.arraycopy(this.field1725, 0, this.field1725 = new boolean[arg0], 0, this.field1733);
        }
    }

    @ObfuscatedName("ep.e(II)V")
    public void method2931(int arg0) {
        if (this.field1722) {
            if (this.field1739 == null) {
                this.field1739 = new long[arg0];
            } else {
                System.arraycopy(this.field1739, 0, this.field1739 = new long[arg0], 0, this.field1742);
            }
        }
        if (!this.field1723) {
            return;
        }
        if (this.field1743 == null) {
            this.field1743 = new String[arg0];
        } else {
            System.arraycopy(this.field1743, 0, this.field1743 = new String[arg0], 0, this.field1742);
        }
    }

    @ObfuscatedName("ep.v(Ljava/lang/String;I)I")
    public int method2929(String arg0) {
        if (arg0 == null || arg0.length() == 0) {
            return -1;
        }
        for (int var2 = 0; var2 < this.field1733; var2++) {
            if (this.field1738[var2].equals(arg0)) {
                return var2;
            }
        }
        return -1;
    }

    @ObfuscatedName("ep.x(IIIB)I")
    public int method2932(int arg0, int arg1, int arg2) {
        int var4 = arg2 == 31 ? -1 : (0x1 << arg2 + 1) - 1;
        return (this.field1737[arg0] & var4) >>> arg1;
    }

    @ObfuscatedName("ep.m(II)Ljava/lang/Integer;")
    public Integer method2933(int arg0) {
        if (this.field1746 == null) {
            return null;
        } else {
            class433 var2 = this.field1746.method7525((long) arg0);
            return var2 != null && var2 instanceof class432 ? Integer.valueOf(((class432) var2).field4683) : null;
        }
    }

    @ObfuscatedName("ep.q(I)[I")
    public int[] method2960() {
        if (this.field1736 == null) {
            String[] var1 = new String[this.field1733];
            this.field1736 = new int[this.field1733];
            int var2 = 0;
            while (var2 < this.field1733) {
                var1[var2] = this.field1738[var2];
                if (var1[var2] != null) {
                    var1[var2] = var1[var2].toLowerCase();
                }
                this.field1736[var2] = var2++;
            }
            Statics.method2123(var1, this.field1736);
        }
        return this.field1736;
    }

    @ObfuscatedName("ep.f(JLjava/lang/String;II)V")
    public void method2975(long arg0, String arg1, int arg2) {
        if (arg1 != null && arg1.length() == 0) {
            arg1 = null;
        }
        if (arg0 > 0L != this.field1722) {
            throw new RuntimeException("");
        } else if (this.field1723 == (arg1 != null)) {
            if (arg0 > 0L && (this.field1745 == null || this.field1733 >= this.field1745.length) || arg1 != null && (this.field1738 == null || this.field1733 >= this.field1738.length)) {
                this.method2930(this.field1733 + 5);
            }
            if (this.field1745 != null) {
                this.field1745[this.field1733] = arg0;
            }
            if (this.field1738 != null) {
                this.field1738[this.field1733] = arg1;
            }
            if (this.field1740 == -1) {
                this.field1740 = this.field1733;
                this.field1744[this.field1733] = 126;
            } else {
                this.field1744[this.field1733] = 0;
            }
            this.field1737[this.field1733] = 0;
            this.field1721[this.field1733] = arg2;
            this.field1725[this.field1733] = false;
            this.field1733++;
            this.field1736 = null;
        } else {
            throw new RuntimeException("");
        }
    }

    @ObfuscatedName("ep.r(II)V")
    public void method2936(int arg0) {
        if (arg0 < 0 || arg0 >= this.field1733) {
            throw new RuntimeException("");
        }
        this.field1733--;
        this.field1736 = null;
        if (this.field1733 == 0) {
            this.field1745 = null;
            this.field1738 = null;
            this.field1744 = null;
            this.field1737 = null;
            this.field1721 = null;
            this.field1725 = null;
            this.field1740 = -1;
            this.field1741 = -1;
            return;
        }
        System.arraycopy(this.field1744, arg0 + 1, this.field1744, arg0, this.field1733 - arg0);
        System.arraycopy(this.field1737, arg0 + 1, this.field1737, arg0, this.field1733 - arg0);
        System.arraycopy(this.field1721, arg0 + 1, this.field1721, arg0, this.field1733 - arg0);
        System.arraycopy(this.field1725, arg0 + 1, this.field1725, arg0, this.field1733 - arg0);
        if (this.field1745 != null) {
            System.arraycopy(this.field1745, arg0 + 1, this.field1745, arg0, this.field1733 - arg0);
        }
        if (this.field1738 != null) {
            System.arraycopy(this.field1738, arg0 + 1, this.field1738, arg0, this.field1733 - arg0);
        }
        this.method2937();
    }

    @ObfuscatedName("ep.u(B)V")
    public void method2937() {
        if (this.field1733 == 0) {
            this.field1740 = -1;
            this.field1741 = -1;
            return;
        }
        this.field1740 = -1;
        this.field1741 = -1;
        int var1 = 0;
        byte var2 = this.field1744[0];
        for (int var3 = 1; var3 < this.field1733; var3++) {
            if (this.field1744[var3] > var2) {
                if (var2 == 125) {
                    this.field1741 = var1;
                }
                var1 = var3;
                var2 = this.field1744[var3];
            } else if (this.field1741 == -1 && this.field1744[var3] == 125) {
                this.field1741 = var3;
            }
        }
        this.field1740 = var1;
        if (this.field1740 != -1) {
            this.field1744[this.field1740] = 126;
        }
    }

    @ObfuscatedName("ep.b(JLjava/lang/String;I)V")
    public void method2939(long arg0, String arg1) {
        if (arg1 != null && arg1.length() == 0) {
            arg1 = null;
        }
        if (arg0 > 0L != this.field1722) {
            throw new RuntimeException("");
        } else if (this.field1723 == (arg1 != null)) {
            if (arg0 > 0L && (this.field1739 == null || this.field1742 >= this.field1739.length) || arg1 != null && (this.field1743 == null || this.field1742 >= this.field1743.length)) {
                this.method2931(this.field1742 + 5);
            }
            if (this.field1739 != null) {
                this.field1739[this.field1742] = arg0;
            }
            if (this.field1743 != null) {
                this.field1743[this.field1742] = arg1;
            }
            this.field1742++;
        } else {
            throw new RuntimeException("");
        }
    }

    @ObfuscatedName("ep.j(II)V")
    public void method2954(int arg0) {
        this.field1742--;
        if (this.field1742 == 0) {
            this.field1739 = null;
            this.field1743 = null;
            return;
        }
        if (this.field1739 != null) {
            System.arraycopy(this.field1739, arg0 + 1, this.field1739, arg0, this.field1742 - arg0);
        }
        if (this.field1743 != null) {
            System.arraycopy(this.field1743, arg0 + 1, this.field1743, arg0, this.field1742 - arg0);
        }
    }

    @ObfuscatedName("ep.g(IBI)I")
    public int method2940(int arg0, byte arg1) {
        if (arg1 == 126 || arg1 == 127) {
            return -1;
        } else if (this.field1740 == arg0 && (this.field1741 == -1 || this.field1744[this.field1741] < 125)) {
            return -1;
        } else if (this.field1744[arg0] == arg1) {
            return -1;
        } else {
            this.field1744[arg0] = arg1;
            this.method2937();
            return arg0;
        }
    }

    @ObfuscatedName("ep.i(IB)Z")
    public boolean method2941(int arg0) {
        if (this.field1740 == arg0 || this.field1744[arg0] == 126) {
            return false;
        }
        this.field1744[this.field1740] = 125;
        this.field1741 = this.field1740;
        this.field1744[arg0] = 126;
        this.field1740 = arg0;
        return true;
    }

    @ObfuscatedName("ep.o(IZB)I")
    public int method2953(int arg0, boolean arg1) {
        if (this.field1725[arg0] == arg1) {
            return -1;
        } else {
            this.field1725[arg0] = arg1;
            return arg0;
        }
    }

    @ObfuscatedName("ep.n(IIIIB)I")
    public int method2943(int arg0, int arg1, int arg2, int arg3) {
        int var5 = (0x1 << arg2) - 1;
        int var6 = arg3 == 31 ? -1 : (0x1 << arg3 + 1) - 1;
        int var7 = var6 ^ var5;
        int var8 = arg1 << arg2;
        int var9 = var8 & var7;
        int var10 = this.field1737[arg0];
        if ((var10 & var7) == var9) {
            return -1;
        } else {
            int var11 = var10 & ~var7;
            this.field1737[arg0] = var11 | var9;
            return arg0;
        }
    }

    @ObfuscatedName("ep.k(III)Z")
    public boolean method2944(int arg0, int arg1) {
        if (this.field1746 == null) {
            this.field1746 = new class443(4);
        } else {
            class433 var3 = this.field1746.method7525((long) arg0);
            if (var3 != null) {
                if (var3 instanceof class432) {
                    class432 var4 = (class432) var3;
                    if (var4.field4683 == arg1) {
                        return false;
                    }
                    var4.field4683 = arg1;
                    return true;
                }
                var3.method7230();
            }
        }
        this.field1746.method7523(new class432(arg1), (long) arg0);
        return true;
    }

    @ObfuscatedName("ep.a(IIIII)Z")
    public boolean method2945(int arg0, int arg1, int arg2, int arg3) {
        int var5 = (0x1 << arg2) - 1;
        int var6 = arg3 == 31 ? -1 : (0x1 << arg3 + 1) - 1;
        int var7 = var6 ^ var5;
        int var8 = arg1 << arg2;
        int var9 = var8 & var7;
        if (this.field1746 == null) {
            this.field1746 = new class443(4);
        } else {
            class433 var10 = this.field1746.method7525((long) arg0);
            if (var10 != null) {
                if (var10 instanceof class432) {
                    class432 var11 = (class432) var10;
                    if ((var11.field4683 & var7) == var9) {
                        return false;
                    }
                    var11.field4683 &= ~var7;
                    var11.field4683 |= var9;
                    return true;
                }
                var10.method7230();
            }
        }
        this.field1746.method7523(new class432(var9), (long) arg0);
        return true;
    }

    @ObfuscatedName("ep.s(IJ)Z")
    public boolean method2946(int arg0, long arg1) {
        if (this.field1746 == null) {
            this.field1746 = new class443(4);
        } else {
            class433 var4 = this.field1746.method7525((long) arg0);
            if (var4 != null) {
                if (var4 instanceof class431) {
                    class431 var5 = (class431) var4;
                    if (var5.field4682 == arg1) {
                        return false;
                    }
                    var5.field4682 = arg1;
                    return true;
                }
                var4.method7230();
            }
        }
        this.field1746.method7523(new class431(arg1), (long) arg0);
        return true;
    }

    @ObfuscatedName("ep.l(ILjava/lang/String;B)Z")
    public boolean method2947(int arg0, String arg1) {
        if (arg1 == null) {
            arg1 = "";
        } else if (arg1.length() > 80) {
            arg1 = arg1.substring(0, 80);
        }
        if (this.field1746 == null) {
            this.field1746 = new class443(4);
        } else {
            class433 var3 = this.field1746.method7525((long) arg0);
            if (var3 != null) {
                if (var3 instanceof class429) {
                    class429 var4 = (class429) var3;
                    if (var4.field4680 instanceof String) {
                        if (arg1.equals(var4.field4680)) {
                            return false;
                        }
                        var4.method7230();
                        this.field1746.method7523(new class429(arg1), var4.field4686);
                        return true;
                    }
                }
                var3.method7230();
            }
        }
        this.field1746.method7523(new class429(arg1), (long) arg0);
        return true;
    }

    @ObfuscatedName("ep.t(Lqy;I)V")
    public void method2948(class467 arg0) {
        int var2 = arg0.method7792();
        if (var2 < 1 || var2 > 6) {
            throw new RuntimeException("" + var2);
        }
        int var3 = arg0.method7792();
        if ((var3 & 0x1) != 0) {
            this.field1722 = true;
        }
        if ((var3 & 0x2) != 0) {
            this.field1723 = true;
        }
        if (!this.field1722) {
            this.field1745 = null;
            this.field1739 = null;
        }
        if (!this.field1723) {
            this.field1738 = null;
            this.field1743 = null;
        }
        this.field1747 = arg0.method7946();
        this.field1727 = arg0.method7946();
        if (var2 <= 3 && this.field1727 != 0) {
            this.field1727 += 16912800;
        }
        this.field1733 = arg0.method7794();
        this.field1742 = arg0.method7792();
        this.field1726 = arg0.method7801();
        if (var2 >= 4) {
            arg0.method7946();
        }
        this.field1728 = arg0.method7792() == 1;
        this.field1729 = arg0.method7793();
        this.field1730 = arg0.method7793();
        this.field1735 = arg0.method7793();
        this.field1732 = arg0.method7793();
        if (this.field1733 > 0) {
            if (this.field1722 && (this.field1745 == null || this.field1745.length < this.field1733)) {
                this.field1745 = new long[this.field1733];
            }
            if (this.field1723 && (this.field1738 == null || this.field1738.length < this.field1733)) {
                this.field1738 = new String[this.field1733];
            }
            if (this.field1744 == null || this.field1744.length < this.field1733) {
                this.field1744 = new byte[this.field1733];
            }
            if (this.field1737 == null || this.field1737.length < this.field1733) {
                this.field1737 = new int[this.field1733];
            }
            if (this.field1721 == null || this.field1721.length < this.field1733) {
                this.field1721 = new int[this.field1733];
            }
            if (this.field1725 == null || this.field1725.length < this.field1733) {
                this.field1725 = new boolean[this.field1733];
            }
            for (int var4 = 0; var4 < this.field1733; var4++) {
                if (this.field1722) {
                    this.field1745[var4] = arg0.method7958();
                }
                if (this.field1723) {
                    this.field1738[var4] = arg0.method7800();
                }
                this.field1744[var4] = arg0.method7793();
                if (var2 >= 2) {
                    this.field1737[var4] = arg0.method7946();
                }
                if (var2 >= 5) {
                    this.field1721[var4] = arg0.method7794();
                } else {
                    this.field1721[var4] = 0;
                }
                if (var2 >= 6) {
                    this.field1725[var4] = arg0.method7792() == 1;
                } else {
                    this.field1725[var4] = false;
                }
            }
            this.method2937();
        }
        if (this.field1742 > 0) {
            if (this.field1722 && (this.field1739 == null || this.field1739.length < this.field1742)) {
                this.field1739 = new long[this.field1742];
            }
            if (this.field1723 && (this.field1743 == null || this.field1743.length < this.field1742)) {
                this.field1743 = new String[this.field1742];
            }
            for (int var5 = 0; var5 < this.field1742; var5++) {
                if (this.field1722) {
                    this.field1739[var5] = arg0.method7958();
                }
                if (this.field1723) {
                    this.field1743[var5] = arg0.method7800();
                }
            }
        }
        if (var2 < 3) {
            return;
        }
        int var6 = arg0.method7794();
        if (var6 <= 0) {
            return;
        }
        this.field1746 = new class443(var6 < 16 ? class285.method7578(var6) : 16);
        while (var6-- > 0) {
            int var7 = arg0.method7946();
            int var8 = var7 & 0x3FFFFFFF;
            int var9 = var7 >>> 30;
            if (var9 == 0) {
                int var10 = arg0.method7946();
                this.field1746.method7523(new class432(var10), (long) var8);
            } else if (var9 == 1) {
                long var11 = arg0.method7958();
                this.field1746.method7523(new class431(var11), (long) var8);
            } else if (var9 == 2) {
                String var13 = arg0.method7801();
                this.field1746.method7523(new class429(var13), (long) var8);
            }
        }
    }
}
