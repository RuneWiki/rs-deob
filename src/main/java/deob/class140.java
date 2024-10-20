package deob;

@ObfuscatedName("ek")
public class class140 {

    @ObfuscatedName("ek.q")
    public boolean field1646;

    @ObfuscatedName("ek.l")
    public boolean field1635;

    @ObfuscatedName("ek.k")
    public long field1636;

    @ObfuscatedName("ek.a")
    public int field1637 = 0;

    @ObfuscatedName("ek.m")
    public String field1641 = null;

    @ObfuscatedName("ek.p")
    public int field1639 = 0;

    @ObfuscatedName("ek.s")
    public boolean field1640;

    @ObfuscatedName("ek.r")
    public byte field1634;

    @ObfuscatedName("ek.v")
    public byte field1642;

    @ObfuscatedName("ek.y")
    public byte field1643;

    @ObfuscatedName("ek.c")
    public byte field1649;

    @ObfuscatedName("ek.w")
    public int field1659;

    @ObfuscatedName("ek.b")
    public long[] field1661;

    @ObfuscatedName("ek.t")
    public byte[] field1647;

    @ObfuscatedName("ek.g")
    public int[] field1648;

    @ObfuscatedName("ek.x")
    public int[] field1652;

    @ObfuscatedName("ek.n")
    public int[] field1650;

    @ObfuscatedName("ek.e")
    public boolean[] field1651;

    @ObfuscatedName("ek.h")
    public int field1644 = -1;

    @ObfuscatedName("ek.f")
    public int field1653 = -1;

    @ObfuscatedName("ek.d")
    public int field1645;

    @ObfuscatedName("ek.j")
    public long[] field1654;

    @ObfuscatedName("ek.z")
    public String[] field1656;

    @ObfuscatedName("ek.i")
    public String[] field1657;

    @ObfuscatedName("ek.u")
    public class420 field1658;

    public class140(class440 arg0) {
        this.method2702(arg0);
    }

    @ObfuscatedName("ek.o(IB)V")
    public void method2683(int arg0) {
        if (this.field1646) {
            if (this.field1661 == null) {
                this.field1661 = new long[arg0];
            } else {
                System.arraycopy(this.field1661, 0, this.field1661 = new long[arg0], 0, this.field1659);
            }
        }
        if (this.field1635) {
            if (this.field1656 == null) {
                this.field1656 = new String[arg0];
            } else {
                System.arraycopy(this.field1656, 0, this.field1656 = new String[arg0], 0, this.field1659);
            }
        }
        if (this.field1647 == null) {
            this.field1647 = new byte[arg0];
        } else {
            System.arraycopy(this.field1647, 0, this.field1647 = new byte[arg0], 0, this.field1659);
        }
        if (this.field1652 == null) {
            this.field1652 = new int[arg0];
        } else {
            System.arraycopy(this.field1652, 0, this.field1652 = new int[arg0], 0, this.field1659);
        }
        if (this.field1650 == null) {
            this.field1650 = new int[arg0];
        } else {
            System.arraycopy(this.field1650, 0, this.field1650 = new int[arg0], 0, this.field1659);
        }
        if (this.field1651 == null) {
            this.field1651 = new boolean[arg0];
        } else {
            System.arraycopy(this.field1651, 0, this.field1651 = new boolean[arg0], 0, this.field1659);
        }
    }

    @ObfuscatedName("ek.q(II)V")
    public void method2684(int arg0) {
        if (this.field1646) {
            if (this.field1654 == null) {
                this.field1654 = new long[arg0];
            } else {
                System.arraycopy(this.field1654, 0, this.field1654 = new long[arg0], 0, this.field1645);
            }
        }
        if (!this.field1635) {
            return;
        }
        if (this.field1657 == null) {
            this.field1657 = new String[arg0];
        } else {
            System.arraycopy(this.field1657, 0, this.field1657 = new String[arg0], 0, this.field1645);
        }
    }

    @ObfuscatedName("ek.l(Ljava/lang/String;I)I")
    public int method2685(String arg0) {
        if (arg0 == null || arg0.length() == 0) {
            return -1;
        }
        for (int var2 = 0; var2 < this.field1659; var2++) {
            if (this.field1656[var2].equals(arg0)) {
                return var2;
            }
        }
        return -1;
    }

    @ObfuscatedName("ek.k(IIII)I")
    public int method2686(int arg0, int arg1, int arg2) {
        int var4 = arg2 == 31 ? -1 : (0x1 << arg2 + 1) - 1;
        return (this.field1652[arg0] & var4) >>> arg1;
    }

    @ObfuscatedName("ek.a(II)Ljava/lang/Integer;")
    public Integer method2687(int arg0) {
        if (this.field1658 == null) {
            return null;
        } else {
            class411 var2 = this.field1658.method6665((long) arg0);
            return var2 != null && var2 instanceof class410 ? Integer.valueOf(((class410) var2).field4465) : null;
        }
    }

    @ObfuscatedName("ek.m(I)[I")
    public int[] method2688() {
        if (this.field1648 == null) {
            String[] var1 = new String[this.field1659];
            this.field1648 = new int[this.field1659];
            int var2 = 0;
            while (var2 < this.field1659) {
                var1[var2] = this.field1656[var2];
                if (var1[var2] != null) {
                    var1[var2] = var1[var2].toLowerCase();
                }
                this.field1648[var2] = var2++;
            }
            class437.method2486(var1, this.field1648);
        }
        return this.field1648;
    }

    @ObfuscatedName("ek.p(JLjava/lang/String;II)V")
    public void method2689(long arg0, String arg1, int arg2) {
        if (arg1 != null && arg1.length() == 0) {
            arg1 = null;
        }
        if (arg0 > 0L != this.field1646) {
            throw new RuntimeException("");
        } else if (this.field1635 == (arg1 != null)) {
            if (arg0 > 0L && (this.field1661 == null || this.field1659 >= this.field1661.length) || arg1 != null && (this.field1656 == null || this.field1659 >= this.field1656.length)) {
                this.method2683(this.field1659 + 5);
            }
            if (this.field1661 != null) {
                this.field1661[this.field1659] = arg0;
            }
            if (this.field1656 != null) {
                this.field1656[this.field1659] = arg1;
            }
            if (this.field1644 == -1) {
                this.field1644 = this.field1659;
                this.field1647[this.field1659] = 126;
            } else {
                this.field1647[this.field1659] = 0;
            }
            this.field1652[this.field1659] = 0;
            this.field1650[this.field1659] = arg2;
            this.field1651[this.field1659] = false;
            this.field1659++;
            this.field1648 = null;
        } else {
            throw new RuntimeException("");
        }
    }

    @ObfuscatedName("ek.s(IB)V")
    public void method2727(int arg0) {
        if (arg0 < 0 || arg0 >= this.field1659) {
            throw new RuntimeException("");
        }
        this.field1659--;
        this.field1648 = null;
        if (this.field1659 == 0) {
            this.field1661 = null;
            this.field1656 = null;
            this.field1647 = null;
            this.field1652 = null;
            this.field1650 = null;
            this.field1651 = null;
            this.field1644 = -1;
            this.field1653 = -1;
            return;
        }
        System.arraycopy(this.field1647, arg0 + 1, this.field1647, arg0, this.field1659 - arg0);
        System.arraycopy(this.field1652, arg0 + 1, this.field1652, arg0, this.field1659 - arg0);
        System.arraycopy(this.field1650, arg0 + 1, this.field1650, arg0, this.field1659 - arg0);
        System.arraycopy(this.field1651, arg0 + 1, this.field1651, arg0, this.field1659 - arg0);
        if (this.field1661 != null) {
            System.arraycopy(this.field1661, arg0 + 1, this.field1661, arg0, this.field1659 - arg0);
        }
        if (this.field1656 != null) {
            System.arraycopy(this.field1656, arg0 + 1, this.field1656, arg0, this.field1659 - arg0);
        }
        this.method2691();
    }

    @ObfuscatedName("ek.r(I)V")
    public void method2691() {
        if (this.field1659 == 0) {
            this.field1644 = -1;
            this.field1653 = -1;
            return;
        }
        this.field1644 = -1;
        this.field1653 = -1;
        int var1 = 0;
        byte var2 = this.field1647[0];
        for (int var3 = 1; var3 < this.field1659; var3++) {
            if (this.field1647[var3] > var2) {
                if (var2 == 125) {
                    this.field1653 = var1;
                }
                var1 = var3;
                var2 = this.field1647[var3];
            } else if (this.field1653 == -1 && this.field1647[var3] == 125) {
                this.field1653 = var3;
            }
        }
        this.field1644 = var1;
        if (this.field1644 != -1) {
            this.field1647[this.field1644] = 126;
        }
    }

    @ObfuscatedName("ek.v(JLjava/lang/String;B)V")
    public void method2692(long arg0, String arg1) {
        if (arg1 != null && arg1.length() == 0) {
            arg1 = null;
        }
        if (arg0 > 0L != this.field1646) {
            throw new RuntimeException("");
        } else if (arg1 != null == this.field1635) {
            if (arg0 > 0L && (this.field1654 == null || this.field1645 >= this.field1654.length) || arg1 != null && (this.field1657 == null || this.field1645 >= this.field1657.length)) {
                this.method2684(this.field1645 + 5);
            }
            if (this.field1654 != null) {
                this.field1654[this.field1645] = arg0;
            }
            if (this.field1657 != null) {
                this.field1657[this.field1645] = arg1;
            }
            this.field1645++;
        } else {
            throw new RuntimeException("");
        }
    }

    @ObfuscatedName("ek.y(II)V")
    public void method2693(int arg0) {
        this.field1645--;
        if (this.field1645 == 0) {
            this.field1654 = null;
            this.field1657 = null;
            return;
        }
        if (this.field1654 != null) {
            System.arraycopy(this.field1654, arg0 + 1, this.field1654, arg0, this.field1645 - arg0);
        }
        if (this.field1657 != null) {
            System.arraycopy(this.field1657, arg0 + 1, this.field1657, arg0, this.field1645 - arg0);
        }
    }

    @ObfuscatedName("ek.c(IBI)I")
    public int method2731(int arg0, byte arg1) {
        if (arg1 == 126 || arg1 == 127) {
            return -1;
        } else if (this.field1644 == arg0 && (this.field1653 == -1 || this.field1647[this.field1653] < 125)) {
            return -1;
        } else if (this.field1647[arg0] == arg1) {
            return -1;
        } else {
            this.field1647[arg0] = arg1;
            this.method2691();
            return arg0;
        }
    }

    @ObfuscatedName("ek.w(II)Z")
    public boolean method2695(int arg0) {
        if (this.field1644 == arg0 || this.field1647[arg0] == 126) {
            return false;
        }
        this.field1647[this.field1644] = 125;
        this.field1653 = this.field1644;
        this.field1647[arg0] = 126;
        this.field1644 = arg0;
        return true;
    }

    @ObfuscatedName("ek.b(IZI)I")
    public int method2696(int arg0, boolean arg1) {
        if (this.field1651[arg0] == arg1) {
            return -1;
        } else {
            this.field1651[arg0] = arg1;
            return arg0;
        }
    }

    @ObfuscatedName("ek.t(IIIII)I")
    public int method2697(int arg0, int arg1, int arg2, int arg3) {
        int var5 = (0x1 << arg2) - 1;
        int var6 = arg3 == 31 ? -1 : (0x1 << arg3 + 1) - 1;
        int var7 = var6 ^ var5;
        int var8 = arg1 << arg2;
        int var9 = var8 & var7;
        int var10 = this.field1652[arg0];
        if ((var10 & var7) == var9) {
            return -1;
        } else {
            int var11 = var10 & ~var7;
            this.field1652[arg0] = var11 | var9;
            return arg0;
        }
    }

    @ObfuscatedName("ek.g(III)Z")
    public boolean method2710(int arg0, int arg1) {
        if (this.field1658 == null) {
            this.field1658 = new class420(4);
        } else {
            class411 var3 = this.field1658.method6665((long) arg0);
            if (var3 != null) {
                if (var3 instanceof class410) {
                    class410 var4 = (class410) var3;
                    if (var4.field4465 == arg1) {
                        return false;
                    }
                    var4.field4465 = arg1;
                    return true;
                }
                var3.method6399();
            }
        }
        this.field1658.method6666(new class410(arg1), (long) arg0);
        return true;
    }

    @ObfuscatedName("ek.x(IIIIB)Z")
    public boolean method2699(int arg0, int arg1, int arg2, int arg3) {
        int var5 = (0x1 << arg2) - 1;
        int var6 = arg3 == 31 ? -1 : (0x1 << arg3 + 1) - 1;
        int var7 = var6 ^ var5;
        int var8 = arg1 << arg2;
        int var9 = var8 & var7;
        if (this.field1658 == null) {
            this.field1658 = new class420(4);
        } else {
            class411 var10 = this.field1658.method6665((long) arg0);
            if (var10 != null) {
                if (var10 instanceof class410) {
                    class410 var11 = (class410) var10;
                    if ((var11.field4465 & var7) == var9) {
                        return false;
                    }
                    var11.field4465 &= ~var7;
                    var11.field4465 |= var9;
                    return true;
                }
                var10.method6399();
            }
        }
        this.field1658.method6666(new class410(var9), (long) arg0);
        return true;
    }

    @ObfuscatedName("ek.n(IJ)Z")
    public boolean method2690(int arg0, long arg1) {
        if (this.field1658 == null) {
            this.field1658 = new class420(4);
        } else {
            class411 var4 = this.field1658.method6665((long) arg0);
            if (var4 != null) {
                if (var4 instanceof class409) {
                    class409 var5 = (class409) var4;
                    if (var5.field4464 == arg1) {
                        return false;
                    }
                    var5.field4464 = arg1;
                    return true;
                }
                var4.method6399();
            }
        }
        this.field1658.method6666(new class409(arg1), (long) arg0);
        return true;
    }

    @ObfuscatedName("ek.e(ILjava/lang/String;I)Z")
    public boolean method2701(int arg0, String arg1) {
        if (arg1 == null) {
            arg1 = "";
        } else if (arg1.length() > 80) {
            arg1 = arg1.substring(0, 80);
        }
        if (this.field1658 == null) {
            this.field1658 = new class420(4);
        } else {
            class411 var3 = this.field1658.method6665((long) arg0);
            if (var3 != null) {
                if (var3 instanceof class407) {
                    class407 var4 = (class407) var3;
                    if (var4.field4462 instanceof String) {
                        if (arg1.equals(var4.field4462)) {
                            return false;
                        }
                        var4.method6399();
                        this.field1658.method6666(new class407(arg1), var4.field4468);
                        return true;
                    }
                }
                var3.method6399();
            }
        }
        this.field1658.method6666(new class407(arg1), (long) arg0);
        return true;
    }

    @ObfuscatedName("ek.h(Lpx;B)V")
    public void method2702(class440 arg0) {
        int var2 = arg0.method7071();
        if (var2 < 1 || var2 > 6) {
            throw new RuntimeException("" + var2);
        }
        int var3 = arg0.method7071();
        if ((var3 & 0x1) != 0) {
            this.field1646 = true;
        }
        if ((var3 & 0x2) != 0) {
            this.field1635 = true;
        }
        if (!this.field1646) {
            this.field1661 = null;
            this.field1654 = null;
        }
        if (!this.field1635) {
            this.field1656 = null;
            this.field1657 = null;
        }
        this.field1637 = arg0.method6898();
        this.field1639 = arg0.method6898();
        if (var2 <= 3 && this.field1639 != 0) {
            this.field1639 += 16912800;
        }
        this.field1659 = arg0.method7082();
        this.field1645 = arg0.method7071();
        this.field1641 = arg0.method7044();
        if (var2 >= 4) {
            arg0.method6898();
        }
        this.field1640 = arg0.method7071() == 1;
        this.field1634 = arg0.method7034();
        this.field1642 = arg0.method7034();
        this.field1643 = arg0.method7034();
        this.field1649 = arg0.method7034();
        if (this.field1659 > 0) {
            if (this.field1646 && (this.field1661 == null || this.field1661.length < this.field1659)) {
                this.field1661 = new long[this.field1659];
            }
            if (this.field1635 && (this.field1656 == null || this.field1656.length < this.field1659)) {
                this.field1656 = new String[this.field1659];
            }
            if (this.field1647 == null || this.field1647.length < this.field1659) {
                this.field1647 = new byte[this.field1659];
            }
            if (this.field1652 == null || this.field1652.length < this.field1659) {
                this.field1652 = new int[this.field1659];
            }
            if (this.field1650 == null || this.field1650.length < this.field1659) {
                this.field1650 = new int[this.field1659];
            }
            if (this.field1651 == null || this.field1651.length < this.field1659) {
                this.field1651 = new boolean[this.field1659];
            }
            for (int var4 = 0; var4 < this.field1659; var4++) {
                if (this.field1646) {
                    this.field1661[var4] = arg0.method7014();
                }
                if (this.field1635) {
                    this.field1656[var4] = arg0.method6902();
                }
                this.field1647[var4] = arg0.method7034();
                if (var2 >= 2) {
                    this.field1652[var4] = arg0.method6898();
                }
                if (var2 >= 5) {
                    this.field1650[var4] = arg0.method7082();
                } else {
                    this.field1650[var4] = 0;
                }
                if (var2 >= 6) {
                    this.field1651[var4] = arg0.method7071() == 1;
                } else {
                    this.field1651[var4] = false;
                }
            }
            this.method2691();
        }
        if (this.field1645 > 0) {
            if (this.field1646 && (this.field1654 == null || this.field1654.length < this.field1645)) {
                this.field1654 = new long[this.field1645];
            }
            if (this.field1635 && (this.field1657 == null || this.field1657.length < this.field1645)) {
                this.field1657 = new String[this.field1645];
            }
            for (int var5 = 0; var5 < this.field1645; var5++) {
                if (this.field1646) {
                    this.field1654[var5] = arg0.method7014();
                }
                if (this.field1635) {
                    this.field1657[var5] = arg0.method6902();
                }
            }
        }
        if (var2 < 3) {
            return;
        }
        int var6 = arg0.method7082();
        if (var6 <= 0) {
            return;
        }
        this.field1658 = new class420(var6 < 16 ? class272.method6642(var6) : 16);
        while (var6-- > 0) {
            int var7 = arg0.method6898();
            int var8 = var7 & 0x3FFFFFFF;
            int var9 = var7 >>> 30;
            if (var9 == 0) {
                int var10 = arg0.method6898();
                this.field1658.method6666(new class410(var10), (long) var8);
            } else if (var9 == 1) {
                long var11 = arg0.method7014();
                this.field1658.method6666(new class409(var11), (long) var8);
            } else if (var9 == 2) {
                String var13 = arg0.method7044();
                this.field1658.method6666(new class407(var13), (long) var8);
            }
        }
    }
}
