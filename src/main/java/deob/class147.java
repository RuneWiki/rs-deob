package deob;

@ObfuscatedName("er")
public class class147 {

    @ObfuscatedName("er.f")
    public boolean field1662;

    @ObfuscatedName("er.c")
    public boolean field1663;

    @ObfuscatedName("er.x")
    public long field1664;

    @ObfuscatedName("er.h")
    public int field1665 = 0;

    @ObfuscatedName("er.j")
    public String field1676 = null;

    @ObfuscatedName("er.y")
    public int field1667 = 0;

    @ObfuscatedName("er.d")
    public boolean field1668;

    @ObfuscatedName("er.n")
    public byte field1671;

    @ObfuscatedName("er.r")
    public byte field1661;

    @ObfuscatedName("er.l")
    public byte field1681;

    @ObfuscatedName("er.s")
    public byte field1672;

    @ObfuscatedName("er.p")
    public int field1673;

    @ObfuscatedName("er.b")
    public long[] field1684;

    @ObfuscatedName("er.o")
    public byte[] field1685;

    @ObfuscatedName("er.u")
    public int[] field1666;

    @ObfuscatedName("er.z")
    public int[] field1669;

    @ObfuscatedName("er.t")
    public int[] field1678;

    @ObfuscatedName("er.w")
    public boolean[] field1679;

    @ObfuscatedName("er.m")
    public int field1680 = -1;

    @ObfuscatedName("er.q")
    public int field1674 = -1;

    @ObfuscatedName("er.i")
    public int field1682;

    @ObfuscatedName("er.e")
    public long[] field1683;

    @ObfuscatedName("er.g")
    public String[] field1677;

    @ObfuscatedName("er.k")
    public String[] field1675;

    @ObfuscatedName("er.v")
    public class440 field1686;

    public class147(class464 arg0) {
        this.method2893(arg0);
    }

    @ObfuscatedName("er.a(IB)V")
    public void method2874(int arg0) {
        if (this.field1662) {
            if (this.field1684 == null) {
                this.field1684 = new long[arg0];
            } else {
                System.arraycopy(this.field1684, 0, this.field1684 = new long[arg0], 0, this.field1673);
            }
        }
        if (this.field1663) {
            if (this.field1677 == null) {
                this.field1677 = new String[arg0];
            } else {
                System.arraycopy(this.field1677, 0, this.field1677 = new String[arg0], 0, this.field1673);
            }
        }
        if (this.field1685 == null) {
            this.field1685 = new byte[arg0];
        } else {
            System.arraycopy(this.field1685, 0, this.field1685 = new byte[arg0], 0, this.field1673);
        }
        if (this.field1669 == null) {
            this.field1669 = new int[arg0];
        } else {
            System.arraycopy(this.field1669, 0, this.field1669 = new int[arg0], 0, this.field1673);
        }
        if (this.field1678 == null) {
            this.field1678 = new int[arg0];
        } else {
            System.arraycopy(this.field1678, 0, this.field1678 = new int[arg0], 0, this.field1673);
        }
        if (this.field1679 == null) {
            this.field1679 = new boolean[arg0];
        } else {
            System.arraycopy(this.field1679, 0, this.field1679 = new boolean[arg0], 0, this.field1673);
        }
    }

    @ObfuscatedName("er.f(II)V")
    public void method2875(int arg0) {
        if (this.field1662) {
            if (this.field1683 == null) {
                this.field1683 = new long[arg0];
            } else {
                System.arraycopy(this.field1683, 0, this.field1683 = new long[arg0], 0, this.field1682);
            }
        }
        if (!this.field1663) {
            return;
        }
        if (this.field1675 == null) {
            this.field1675 = new String[arg0];
        } else {
            System.arraycopy(this.field1675, 0, this.field1675 = new String[arg0], 0, this.field1682);
        }
    }

    @ObfuscatedName("er.c(Ljava/lang/String;B)I")
    public int method2876(String arg0) {
        if (arg0 == null || arg0.length() == 0) {
            return -1;
        }
        for (int var2 = 0; var2 < this.field1673; var2++) {
            if (this.field1677[var2].equals(arg0)) {
                return var2;
            }
        }
        return -1;
    }

    @ObfuscatedName("er.x(IIII)I")
    public int method2913(int arg0, int arg1, int arg2) {
        int var4 = arg2 == 31 ? -1 : (0x1 << arg2 + 1) - 1;
        return (this.field1669[arg0] & var4) >>> arg1;
    }

    @ObfuscatedName("er.h(II)Ljava/lang/Integer;")
    public Integer method2920(int arg0) {
        if (this.field1686 == null) {
            return null;
        } else {
            class430 var2 = this.field1686.method7455((long) arg0);
            return var2 != null && var2 instanceof class429 ? Integer.valueOf(((class429) var2).field4634) : null;
        }
    }

    @ObfuscatedName("er.j(B)[I")
    public int[] method2879() {
        if (this.field1666 == null) {
            String[] var1 = new String[this.field1673];
            this.field1666 = new int[this.field1673];
            int var2 = 0;
            while (var2 < this.field1673) {
                var1[var2] = this.field1677[var2];
                if (var1[var2] != null) {
                    var1[var2] = var1[var2].toLowerCase();
                }
                this.field1666[var2] = var2++;
            }
            class461.method2444(var1, this.field1666);
        }
        return this.field1666;
    }

    @ObfuscatedName("er.y(JLjava/lang/String;II)V")
    public void method2880(long arg0, String arg1, int arg2) {
        if (arg1 != null && arg1.length() == 0) {
            arg1 = null;
        }
        if (arg0 > 0L != this.field1662) {
            throw new RuntimeException("");
        } else if (this.field1663 == (arg1 != null)) {
            if (arg0 > 0L && (this.field1684 == null || this.field1673 >= this.field1684.length) || arg1 != null && (this.field1677 == null || this.field1673 >= this.field1677.length)) {
                this.method2874(this.field1673 + 5);
            }
            if (this.field1684 != null) {
                this.field1684[this.field1673] = arg0;
            }
            if (this.field1677 != null) {
                this.field1677[this.field1673] = arg1;
            }
            if (this.field1680 == -1) {
                this.field1680 = this.field1673;
                this.field1685[this.field1673] = 126;
            } else {
                this.field1685[this.field1673] = 0;
            }
            this.field1669[this.field1673] = 0;
            this.field1678[this.field1673] = arg2;
            this.field1679[this.field1673] = false;
            this.field1673++;
            this.field1666 = null;
        } else {
            throw new RuntimeException("");
        }
    }

    @ObfuscatedName("er.d(II)V")
    public void method2881(int arg0) {
        if (arg0 < 0 || arg0 >= this.field1673) {
            throw new RuntimeException("");
        }
        this.field1673--;
        this.field1666 = null;
        if (this.field1673 == 0) {
            this.field1684 = null;
            this.field1677 = null;
            this.field1685 = null;
            this.field1669 = null;
            this.field1678 = null;
            this.field1679 = null;
            this.field1680 = -1;
            this.field1674 = -1;
            return;
        }
        System.arraycopy(this.field1685, arg0 + 1, this.field1685, arg0, this.field1673 - arg0);
        System.arraycopy(this.field1669, arg0 + 1, this.field1669, arg0, this.field1673 - arg0);
        System.arraycopy(this.field1678, arg0 + 1, this.field1678, arg0, this.field1673 - arg0);
        System.arraycopy(this.field1679, arg0 + 1, this.field1679, arg0, this.field1673 - arg0);
        if (this.field1684 != null) {
            System.arraycopy(this.field1684, arg0 + 1, this.field1684, arg0, this.field1673 - arg0);
        }
        if (this.field1677 != null) {
            System.arraycopy(this.field1677, arg0 + 1, this.field1677, arg0, this.field1673 - arg0);
        }
        this.method2882();
    }

    @ObfuscatedName("er.n(I)V")
    public void method2882() {
        if (this.field1673 == 0) {
            this.field1680 = -1;
            this.field1674 = -1;
            return;
        }
        this.field1680 = -1;
        this.field1674 = -1;
        int var1 = 0;
        byte var2 = this.field1685[0];
        for (int var3 = 1; var3 < this.field1673; var3++) {
            if (this.field1685[var3] > var2) {
                if (var2 == 125) {
                    this.field1674 = var1;
                }
                var1 = var3;
                var2 = this.field1685[var3];
            } else if (this.field1674 == -1 && this.field1685[var3] == 125) {
                this.field1674 = var3;
            }
        }
        this.field1680 = var1;
        if (this.field1680 != -1) {
            this.field1685[this.field1680] = 126;
        }
    }

    @ObfuscatedName("er.r(JLjava/lang/String;B)V")
    public void method2922(long arg0, String arg1) {
        if (arg1 != null && arg1.length() == 0) {
            arg1 = null;
        }
        if (this.field1662 != arg0 > 0L) {
            throw new RuntimeException("");
        } else if (this.field1663 == (arg1 != null)) {
            if (arg0 > 0L && (this.field1683 == null || this.field1682 >= this.field1683.length) || arg1 != null && (this.field1675 == null || this.field1682 >= this.field1675.length)) {
                this.method2875(this.field1682 + 5);
            }
            if (this.field1683 != null) {
                this.field1683[this.field1682] = arg0;
            }
            if (this.field1675 != null) {
                this.field1675[this.field1682] = arg1;
            }
            this.field1682++;
        } else {
            throw new RuntimeException("");
        }
    }

    @ObfuscatedName("er.l(IB)V")
    public void method2884(int arg0) {
        this.field1682--;
        if (this.field1682 == 0) {
            this.field1683 = null;
            this.field1675 = null;
            return;
        }
        if (this.field1683 != null) {
            System.arraycopy(this.field1683, arg0 + 1, this.field1683, arg0, this.field1682 - arg0);
        }
        if (this.field1675 != null) {
            System.arraycopy(this.field1675, arg0 + 1, this.field1675, arg0, this.field1682 - arg0);
        }
    }

    @ObfuscatedName("er.s(IBI)I")
    public int method2885(int arg0, byte arg1) {
        if (arg1 == 126 || arg1 == 127) {
            return -1;
        } else if (this.field1680 == arg0 && (this.field1674 == -1 || this.field1685[this.field1674] < 125)) {
            return -1;
        } else if (this.field1685[arg0] == arg1) {
            return -1;
        } else {
            this.field1685[arg0] = arg1;
            this.method2882();
            return arg0;
        }
    }

    @ObfuscatedName("er.p(II)Z")
    public boolean method2886(int arg0) {
        if (this.field1680 == arg0 || this.field1685[arg0] == 126) {
            return false;
        }
        this.field1685[this.field1680] = 125;
        this.field1674 = this.field1680;
        this.field1685[arg0] = 126;
        this.field1680 = arg0;
        return true;
    }

    @ObfuscatedName("er.b(IZI)I")
    public int method2902(int arg0, boolean arg1) {
        if (this.field1679[arg0] == arg1) {
            return -1;
        } else {
            this.field1679[arg0] = arg1;
            return arg0;
        }
    }

    @ObfuscatedName("er.o(IIIII)I")
    public int method2888(int arg0, int arg1, int arg2, int arg3) {
        int var5 = (0x1 << arg2) - 1;
        int var6 = arg3 == 31 ? -1 : (0x1 << arg3 + 1) - 1;
        int var7 = var6 ^ var5;
        int var8 = arg1 << arg2;
        int var9 = var8 & var7;
        int var10 = this.field1669[arg0];
        if ((var10 & var7) == var9) {
            return -1;
        } else {
            int var11 = var10 & ~var7;
            this.field1669[arg0] = var11 | var9;
            return arg0;
        }
    }

    @ObfuscatedName("er.u(IIS)Z")
    public boolean method2916(int arg0, int arg1) {
        if (this.field1686 == null) {
            this.field1686 = new class440(4);
        } else {
            class430 var3 = this.field1686.method7455((long) arg0);
            if (var3 != null) {
                if (var3 instanceof class429) {
                    class429 var4 = (class429) var3;
                    if (var4.field4634 == arg1) {
                        return false;
                    }
                    var4.field4634 = arg1;
                    return true;
                }
                var3.method7170();
            }
        }
        this.field1686.method7448(new class429(arg1), (long) arg0);
        return true;
    }

    @ObfuscatedName("er.z(IIIII)Z")
    public boolean method2890(int arg0, int arg1, int arg2, int arg3) {
        int var5 = (0x1 << arg2) - 1;
        int var6 = arg3 == 31 ? -1 : (0x1 << arg3 + 1) - 1;
        int var7 = var6 ^ var5;
        int var8 = arg1 << arg2;
        int var9 = var8 & var7;
        if (this.field1686 == null) {
            this.field1686 = new class440(4);
        } else {
            class430 var10 = this.field1686.method7455((long) arg0);
            if (var10 != null) {
                if (var10 instanceof class429) {
                    class429 var11 = (class429) var10;
                    if ((var11.field4634 & var7) == var9) {
                        return false;
                    }
                    var11.field4634 &= ~var7;
                    var11.field4634 |= var9;
                    return true;
                }
                var10.method7170();
            }
        }
        this.field1686.method7448(new class429(var9), (long) arg0);
        return true;
    }

    @ObfuscatedName("er.t(IJ)Z")
    public boolean method2891(int arg0, long arg1) {
        if (this.field1686 == null) {
            this.field1686 = new class440(4);
        } else {
            class430 var4 = this.field1686.method7455((long) arg0);
            if (var4 != null) {
                if (var4 instanceof class428) {
                    class428 var5 = (class428) var4;
                    if (var5.field4633 == arg1) {
                        return false;
                    }
                    var5.field4633 = arg1;
                    return true;
                }
                var4.method7170();
            }
        }
        this.field1686.method7448(new class428(arg1), (long) arg0);
        return true;
    }

    @ObfuscatedName("er.w(ILjava/lang/String;I)Z")
    public boolean method2892(int arg0, String arg1) {
        if (arg1 == null) {
            arg1 = "";
        } else if (arg1.length() > 80) {
            arg1 = arg1.substring(0, 80);
        }
        if (this.field1686 == null) {
            this.field1686 = new class440(4);
        } else {
            class430 var3 = this.field1686.method7455((long) arg0);
            if (var3 != null) {
                if (var3 instanceof class426) {
                    class426 var4 = (class426) var3;
                    if (var4.field4631 instanceof String) {
                        if (arg1.equals(var4.field4631)) {
                            return false;
                        }
                        var4.method7170();
                        this.field1686.method7448(new class426(arg1), var4.field4635);
                        return true;
                    }
                }
                var3.method7170();
            }
        }
        this.field1686.method7448(new class426(arg1), (long) arg0);
        return true;
    }

    @ObfuscatedName("er.m(Lqr;I)V")
    public void method2893(class464 arg0) {
        int var2 = arg0.method7735();
        if (var2 < 1 || var2 > 6) {
            throw new RuntimeException("" + var2);
        }
        int var3 = arg0.method7735();
        if ((var3 & 0x1) != 0) {
            this.field1662 = true;
        }
        if ((var3 & 0x2) != 0) {
            this.field1663 = true;
        }
        if (!this.field1662) {
            this.field1684 = null;
            this.field1683 = null;
        }
        if (!this.field1663) {
            this.field1677 = null;
            this.field1675 = null;
        }
        this.field1665 = arg0.method7720();
        this.field1667 = arg0.method7720();
        if (var2 <= 3 && this.field1667 != 0) {
            this.field1667 += 16912800;
        }
        this.field1673 = arg0.method7716();
        this.field1682 = arg0.method7735();
        this.field1676 = arg0.method7725();
        if (var2 >= 4) {
            arg0.method7720();
        }
        this.field1668 = arg0.method7735() == 1;
        this.field1671 = arg0.method7881();
        this.field1661 = arg0.method7881();
        this.field1681 = arg0.method7881();
        this.field1672 = arg0.method7881();
        if (this.field1673 > 0) {
            if (this.field1662 && (this.field1684 == null || this.field1684.length < this.field1673)) {
                this.field1684 = new long[this.field1673];
            }
            if (this.field1663 && (this.field1677 == null || this.field1677.length < this.field1673)) {
                this.field1677 = new String[this.field1673];
            }
            if (this.field1685 == null || this.field1685.length < this.field1673) {
                this.field1685 = new byte[this.field1673];
            }
            if (this.field1669 == null || this.field1669.length < this.field1673) {
                this.field1669 = new int[this.field1673];
            }
            if (this.field1678 == null || this.field1678.length < this.field1673) {
                this.field1678 = new int[this.field1673];
            }
            if (this.field1679 == null || this.field1679.length < this.field1673) {
                this.field1679 = new boolean[this.field1673];
            }
            for (int var4 = 0; var4 < this.field1673; var4++) {
                if (this.field1662) {
                    this.field1684[var4] = arg0.method7721();
                }
                if (this.field1663) {
                    this.field1677[var4] = arg0.method7899();
                }
                this.field1685[var4] = arg0.method7881();
                if (var2 >= 2) {
                    this.field1669[var4] = arg0.method7720();
                }
                if (var2 >= 5) {
                    this.field1678[var4] = arg0.method7716();
                } else {
                    this.field1678[var4] = 0;
                }
                if (var2 >= 6) {
                    this.field1679[var4] = arg0.method7735() == 1;
                } else {
                    this.field1679[var4] = false;
                }
            }
            this.method2882();
        }
        if (this.field1682 > 0) {
            if (this.field1662 && (this.field1683 == null || this.field1683.length < this.field1682)) {
                this.field1683 = new long[this.field1682];
            }
            if (this.field1663 && (this.field1675 == null || this.field1675.length < this.field1682)) {
                this.field1675 = new String[this.field1682];
            }
            for (int var5 = 0; var5 < this.field1682; var5++) {
                if (this.field1662) {
                    this.field1683[var5] = arg0.method7721();
                }
                if (this.field1663) {
                    this.field1675[var5] = arg0.method7899();
                }
            }
        }
        if (var2 < 3) {
            return;
        }
        int var6 = arg0.method7716();
        if (var6 <= 0) {
            return;
        }
        this.field1686 = new class440(var6 < 16 ? class282.method707(var6) : 16);
        while (var6-- > 0) {
            int var7 = arg0.method7720();
            int var8 = var7 & 0x3FFFFFFF;
            int var9 = var7 >>> 30;
            if (var9 == 0) {
                int var10 = arg0.method7720();
                this.field1686.method7448(new class429(var10), (long) var8);
            } else if (var9 == 1) {
                long var11 = arg0.method7721();
                this.field1686.method7448(new class428(var11), (long) var8);
            } else if (var9 == 2) {
                String var13 = arg0.method7725();
                this.field1686.method7448(new class426(var13), (long) var8);
            }
        }
    }
}
