package deob;

@ObfuscatedName("ey")
public class class138 {

    @ObfuscatedName("ey.l")
    public boolean field1587;

    @ObfuscatedName("ey.s")
    public boolean field1588;

    @ObfuscatedName("ey.e")
    public long field1589;

    @ObfuscatedName("ey.r")
    public int field1590 = 0;

    @ObfuscatedName("ey.o")
    public String field1609 = null;

    @ObfuscatedName("ey.i")
    public int field1602 = 0;

    @ObfuscatedName("ey.w")
    public boolean field1593;

    @ObfuscatedName("ey.v")
    public byte field1594;

    @ObfuscatedName("ey.a")
    public byte field1595;

    @ObfuscatedName("ey.y")
    public byte field1596;

    @ObfuscatedName("ey.u")
    public byte field1597;

    @ObfuscatedName("ey.h")
    public int field1598;

    @ObfuscatedName("ey.q")
    public long[] field1610;

    @ObfuscatedName("ey.x")
    public byte[] field1600;

    @ObfuscatedName("ey.p")
    public int[] field1601;

    @ObfuscatedName("ey.n")
    public int[] field1586;

    @ObfuscatedName("ey.m")
    public int[] field1603;

    @ObfuscatedName("ey.d")
    public boolean[] field1612;

    @ObfuscatedName("ey.j")
    public int field1605 = -1;

    @ObfuscatedName("ey.f")
    public int field1592 = -1;

    @ObfuscatedName("ey.g")
    public int field1607;

    @ObfuscatedName("ey.t")
    public long[] field1608;

    @ObfuscatedName("ey.k")
    public String[] field1591;

    @ObfuscatedName("ey.b")
    public String[] field1613;

    @ObfuscatedName("ey.z")
    public class401 field1599;

    public class138(class421 arg0) {
        this.method2654(arg0);
    }

    @ObfuscatedName("ey.c(II)V")
    public void method2673(int arg0) {
        if (this.field1587) {
            if (this.field1610 == null) {
                this.field1610 = new long[arg0];
            } else {
                System.arraycopy(this.field1610, 0, this.field1610 = new long[arg0], 0, this.field1598);
            }
        }
        if (this.field1588) {
            if (this.field1591 == null) {
                this.field1591 = new String[arg0];
            } else {
                System.arraycopy(this.field1591, 0, this.field1591 = new String[arg0], 0, this.field1598);
            }
        }
        if (this.field1600 == null) {
            this.field1600 = new byte[arg0];
        } else {
            System.arraycopy(this.field1600, 0, this.field1600 = new byte[arg0], 0, this.field1598);
        }
        if (this.field1586 == null) {
            this.field1586 = new int[arg0];
        } else {
            System.arraycopy(this.field1586, 0, this.field1586 = new int[arg0], 0, this.field1598);
        }
        if (this.field1603 == null) {
            this.field1603 = new int[arg0];
        } else {
            System.arraycopy(this.field1603, 0, this.field1603 = new int[arg0], 0, this.field1598);
        }
        if (this.field1612 == null) {
            this.field1612 = new boolean[arg0];
        } else {
            System.arraycopy(this.field1612, 0, this.field1612 = new boolean[arg0], 0, this.field1598);
        }
    }

    @ObfuscatedName("ey.l(II)V")
    public void method2652(int arg0) {
        if (this.field1587) {
            if (this.field1608 == null) {
                this.field1608 = new long[arg0];
            } else {
                System.arraycopy(this.field1608, 0, this.field1608 = new long[arg0], 0, this.field1607);
            }
        }
        if (!this.field1588) {
            return;
        }
        if (this.field1613 == null) {
            this.field1613 = new String[arg0];
        } else {
            System.arraycopy(this.field1613, 0, this.field1613 = new String[arg0], 0, this.field1607);
        }
    }

    @ObfuscatedName("ey.s(Ljava/lang/String;B)I")
    public int method2637(String arg0) {
        if (arg0 == null || arg0.length() == 0) {
            return -1;
        }
        for (int var2 = 0; var2 < this.field1598; var2++) {
            if (this.field1591[var2].equals(arg0)) {
                return var2;
            }
        }
        return -1;
    }

    @ObfuscatedName("ey.e(IIII)I")
    public int method2638(int arg0, int arg1, int arg2) {
        int var4 = arg2 == 31 ? -1 : (0x1 << arg2 + 1) - 1;
        return (this.field1586[arg0] & var4) >>> arg1;
    }

    @ObfuscatedName("ey.r(IB)Ljava/lang/Integer;")
    public Integer method2639(int arg0) {
        if (this.field1599 == null) {
            return null;
        } else {
            class392 var2 = this.field1599.method6448((long) arg0);
            return var2 != null && var2 instanceof class391 ? Integer.valueOf(((class391) var2).field4299) : null;
        }
    }

    @ObfuscatedName("ey.o(I)[I")
    public int[] method2665() {
        if (this.field1601 == null) {
            String[] var1 = new String[this.field1598];
            this.field1601 = new int[this.field1598];
            int var2 = 0;
            while (var2 < this.field1598) {
                var1[var2] = this.field1591[var2];
                if (var1[var2] != null) {
                    var1[var2] = var1[var2].toLowerCase();
                }
                this.field1601[var2] = var2++;
            }
            int[] var3 = this.field1601;
            class418.method2297(var1, var3, 0, var1.length - 1);
        }
        return this.field1601;
    }

    @ObfuscatedName("ey.i(JLjava/lang/String;II)V")
    public void method2648(long arg0, String arg1, int arg2) {
        if (arg1 != null && arg1.length() == 0) {
            arg1 = null;
        }
        if (arg0 > 0L != this.field1587) {
            throw new RuntimeException("");
        } else if (arg1 != null == this.field1588) {
            if (arg0 > 0L && (this.field1610 == null || this.field1598 >= this.field1610.length) || arg1 != null && (this.field1591 == null || this.field1598 >= this.field1591.length)) {
                this.method2673(this.field1598 + 5);
            }
            if (this.field1610 != null) {
                this.field1610[this.field1598] = arg0;
            }
            if (this.field1591 != null) {
                this.field1591[this.field1598] = arg1;
            }
            if (this.field1605 == -1) {
                this.field1605 = this.field1598;
                this.field1600[this.field1598] = 126;
            } else {
                this.field1600[this.field1598] = 0;
            }
            this.field1586[this.field1598] = 0;
            this.field1603[this.field1598] = arg2;
            this.field1612[this.field1598] = false;
            this.field1598++;
            this.field1601 = null;
        } else {
            throw new RuntimeException("");
        }
    }

    @ObfuscatedName("ey.w(IB)V")
    public void method2642(int arg0) {
        if (arg0 < 0 || arg0 >= this.field1598) {
            throw new RuntimeException("");
        }
        this.field1598--;
        this.field1601 = null;
        if (this.field1598 == 0) {
            this.field1610 = null;
            this.field1591 = null;
            this.field1600 = null;
            this.field1586 = null;
            this.field1603 = null;
            this.field1612 = null;
            this.field1605 = -1;
            this.field1592 = -1;
            return;
        }
        System.arraycopy(this.field1600, arg0 + 1, this.field1600, arg0, this.field1598 - arg0);
        System.arraycopy(this.field1586, arg0 + 1, this.field1586, arg0, this.field1598 - arg0);
        System.arraycopy(this.field1603, arg0 + 1, this.field1603, arg0, this.field1598 - arg0);
        System.arraycopy(this.field1612, arg0 + 1, this.field1612, arg0, this.field1598 - arg0);
        if (this.field1610 != null) {
            System.arraycopy(this.field1610, arg0 + 1, this.field1610, arg0, this.field1598 - arg0);
        }
        if (this.field1591 != null) {
            System.arraycopy(this.field1591, arg0 + 1, this.field1591, arg0, this.field1598 - arg0);
        }
        this.method2643();
    }

    @ObfuscatedName("ey.v(S)V")
    public void method2643() {
        if (this.field1598 == 0) {
            this.field1605 = -1;
            this.field1592 = -1;
            return;
        }
        this.field1605 = -1;
        this.field1592 = -1;
        int var1 = 0;
        byte var2 = this.field1600[0];
        for (int var3 = 1; var3 < this.field1598; var3++) {
            if (this.field1600[var3] > var2) {
                if (var2 == 125) {
                    this.field1592 = var1;
                }
                var1 = var3;
                var2 = this.field1600[var3];
            } else if (this.field1592 == -1 && this.field1600[var3] == 125) {
                this.field1592 = var3;
            }
        }
        this.field1605 = var1;
        if (this.field1605 != -1) {
            this.field1600[this.field1605] = 126;
        }
    }

    @ObfuscatedName("ey.a(JLjava/lang/String;I)V")
    public void method2666(long arg0, String arg1) {
        if (arg1 != null && arg1.length() == 0) {
            arg1 = null;
        }
        if (arg0 > 0L != this.field1587) {
            throw new RuntimeException("");
        } else if (arg1 != null == this.field1588) {
            if (arg0 > 0L && (this.field1608 == null || this.field1607 >= this.field1608.length) || arg1 != null && (this.field1613 == null || this.field1607 >= this.field1613.length)) {
                this.method2652(this.field1607 + 5);
            }
            if (this.field1608 != null) {
                this.field1608[this.field1607] = arg0;
            }
            if (this.field1613 != null) {
                this.field1613[this.field1607] = arg1;
            }
            this.field1607++;
        } else {
            throw new RuntimeException("");
        }
    }

    @ObfuscatedName("ey.y(II)V")
    public void method2645(int arg0) {
        this.field1607--;
        if (this.field1607 == 0) {
            this.field1608 = null;
            this.field1613 = null;
            return;
        }
        if (this.field1608 != null) {
            System.arraycopy(this.field1608, arg0 + 1, this.field1608, arg0, this.field1607 - arg0);
        }
        if (this.field1613 != null) {
            System.arraycopy(this.field1613, arg0 + 1, this.field1613, arg0, this.field1607 - arg0);
        }
    }

    @ObfuscatedName("ey.u(IBI)I")
    public int method2646(int arg0, byte arg1) {
        if (arg1 == 126 || arg1 == 127) {
            return -1;
        } else if (this.field1605 == arg0 && (this.field1592 == -1 || this.field1600[this.field1592] < 125)) {
            return -1;
        } else if (this.field1600[arg0] == arg1) {
            return -1;
        } else {
            this.field1600[arg0] = arg1;
            this.method2643();
            return arg0;
        }
    }

    @ObfuscatedName("ey.h(II)Z")
    public boolean method2647(int arg0) {
        if (this.field1605 == arg0 || this.field1600[arg0] == 126) {
            return false;
        }
        this.field1600[this.field1605] = 125;
        this.field1592 = this.field1605;
        this.field1600[arg0] = 126;
        this.field1605 = arg0;
        return true;
    }

    @ObfuscatedName("ey.q(IZI)I")
    public int method2672(int arg0, boolean arg1) {
        if (this.field1612[arg0] == arg1) {
            return -1;
        } else {
            this.field1612[arg0] = arg1;
            return arg0;
        }
    }

    @ObfuscatedName("ey.x(IIIII)I")
    public int method2649(int arg0, int arg1, int arg2, int arg3) {
        int var5 = (0x1 << arg2) - 1;
        int var6 = arg3 == 31 ? -1 : (0x1 << arg3 + 1) - 1;
        int var7 = var6 ^ var5;
        int var8 = arg1 << arg2;
        int var9 = var8 & var7;
        int var10 = this.field1586[arg0];
        if ((var10 & var7) == var9) {
            return -1;
        } else {
            int var11 = var10 & ~var7;
            this.field1586[arg0] = var11 | var9;
            return arg0;
        }
    }

    @ObfuscatedName("ey.p(III)Z")
    public boolean method2671(int arg0, int arg1) {
        if (this.field1599 == null) {
            this.field1599 = new class401(4);
        } else {
            class392 var3 = this.field1599.method6448((long) arg0);
            if (var3 != null) {
                if (var3 instanceof class391) {
                    class391 var4 = (class391) var3;
                    if (var4.field4299 == arg1) {
                        return false;
                    }
                    var4.field4299 = arg1;
                    return true;
                }
                var3.method6167();
            }
        }
        this.field1599.method6432(new class391(arg1), (long) arg0);
        return true;
    }

    @ObfuscatedName("ey.n(IIIIB)Z")
    public boolean method2651(int arg0, int arg1, int arg2, int arg3) {
        int var5 = (0x1 << arg2) - 1;
        int var6 = arg3 == 31 ? -1 : (0x1 << arg3 + 1) - 1;
        int var7 = var6 ^ var5;
        int var8 = arg1 << arg2;
        int var9 = var8 & var7;
        if (this.field1599 == null) {
            this.field1599 = new class401(4);
        } else {
            class392 var10 = this.field1599.method6448((long) arg0);
            if (var10 != null) {
                if (var10 instanceof class391) {
                    class391 var11 = (class391) var10;
                    if ((var11.field4299 & var7) == var9) {
                        return false;
                    }
                    var11.field4299 &= ~var7;
                    var11.field4299 |= var9;
                    return true;
                }
                var10.method6167();
            }
        }
        this.field1599.method6432(new class391(var9), (long) arg0);
        return true;
    }

    @ObfuscatedName("ey.m(IJ)Z")
    public boolean method2658(int arg0, long arg1) {
        if (this.field1599 == null) {
            this.field1599 = new class401(4);
        } else {
            class392 var4 = this.field1599.method6448((long) arg0);
            if (var4 != null) {
                if (var4 instanceof class390) {
                    class390 var5 = (class390) var4;
                    if (var5.field4298 == arg1) {
                        return false;
                    }
                    var5.field4298 = arg1;
                    return true;
                }
                var4.method6167();
            }
        }
        this.field1599.method6432(new class390(arg1), (long) arg0);
        return true;
    }

    @ObfuscatedName("ey.d(ILjava/lang/String;I)Z")
    public boolean method2653(int arg0, String arg1) {
        if (arg1 == null) {
            arg1 = "";
        } else if (arg1.length() > 80) {
            arg1 = arg1.substring(0, 80);
        }
        if (this.field1599 == null) {
            this.field1599 = new class401(4);
        } else {
            class392 var3 = this.field1599.method6448((long) arg0);
            if (var3 != null) {
                if (var3 instanceof class388) {
                    class388 var4 = (class388) var3;
                    if (var4.field4296 instanceof String) {
                        if (arg1.equals(var4.field4296)) {
                            return false;
                        }
                        var4.method6167();
                        this.field1599.method6432(new class388(arg1), var4.field4301);
                        return true;
                    }
                }
                var3.method6167();
            }
        }
        this.field1599.method6432(new class388(arg1), (long) arg0);
        return true;
    }

    @ObfuscatedName("ey.j(Lpi;I)V")
    public void method2654(class421 arg0) {
        int var2 = arg0.method6686();
        if (var2 < 1 || var2 > 6) {
            throw new RuntimeException("" + var2);
        }
        int var3 = arg0.method6686();
        if ((var3 & 0x1) != 0) {
            this.field1587 = true;
        }
        if ((var3 & 0x2) != 0) {
            this.field1588 = true;
        }
        if (!this.field1587) {
            this.field1610 = null;
            this.field1608 = null;
        }
        if (!this.field1588) {
            this.field1591 = null;
            this.field1613 = null;
        }
        this.field1590 = arg0.method6669();
        this.field1602 = arg0.method6669();
        if (var2 <= 3 && this.field1602 != 0) {
            this.field1602 += 16912800;
        }
        this.field1598 = arg0.method6666();
        this.field1607 = arg0.method6686();
        this.field1609 = arg0.method6674();
        if (var2 >= 4) {
            arg0.method6669();
        }
        this.field1593 = arg0.method6686() == 1;
        this.field1594 = arg0.method6664();
        this.field1595 = arg0.method6664();
        this.field1596 = arg0.method6664();
        this.field1597 = arg0.method6664();
        if (this.field1598 > 0) {
            if (this.field1587 && (this.field1610 == null || this.field1610.length < this.field1598)) {
                this.field1610 = new long[this.field1598];
            }
            if (this.field1588 && (this.field1591 == null || this.field1591.length < this.field1598)) {
                this.field1591 = new String[this.field1598];
            }
            if (this.field1600 == null || this.field1600.length < this.field1598) {
                this.field1600 = new byte[this.field1598];
            }
            if (this.field1586 == null || this.field1586.length < this.field1598) {
                this.field1586 = new int[this.field1598];
            }
            if (this.field1603 == null || this.field1603.length < this.field1598) {
                this.field1603 = new int[this.field1598];
            }
            if (this.field1612 == null || this.field1612.length < this.field1598) {
                this.field1612 = new boolean[this.field1598];
            }
            for (int var4 = 0; var4 < this.field1598; var4++) {
                if (this.field1587) {
                    this.field1610[var4] = arg0.method6670();
                }
                if (this.field1588) {
                    this.field1591[var4] = arg0.method6721();
                }
                this.field1600[var4] = arg0.method6664();
                if (var2 >= 2) {
                    this.field1586[var4] = arg0.method6669();
                }
                if (var2 >= 5) {
                    this.field1603[var4] = arg0.method6666();
                } else {
                    this.field1603[var4] = 0;
                }
                if (var2 >= 6) {
                    this.field1612[var4] = arg0.method6686() == 1;
                } else {
                    this.field1612[var4] = false;
                }
            }
            this.method2643();
        }
        if (this.field1607 > 0) {
            if (this.field1587 && (this.field1608 == null || this.field1608.length < this.field1607)) {
                this.field1608 = new long[this.field1607];
            }
            if (this.field1588 && (this.field1613 == null || this.field1613.length < this.field1607)) {
                this.field1613 = new String[this.field1607];
            }
            for (int var5 = 0; var5 < this.field1607; var5++) {
                if (this.field1587) {
                    this.field1608[var5] = arg0.method6670();
                }
                if (this.field1588) {
                    this.field1613[var5] = arg0.method6721();
                }
            }
        }
        if (var2 < 3) {
            return;
        }
        int var6 = arg0.method6666();
        if (var6 <= 0) {
            return;
        }
        this.field1599 = new class401(var6 < 16 ? class264.method5144(var6) : 16);
        while (var6-- > 0) {
            int var7 = arg0.method6669();
            int var8 = var7 & 0x3FFFFFFF;
            int var9 = var7 >>> 30;
            if (var9 == 0) {
                int var10 = arg0.method6669();
                this.field1599.method6432(new class391(var10), (long) var8);
            } else if (var9 == 1) {
                long var11 = arg0.method6670();
                this.field1599.method6432(new class390(var11), (long) var8);
            } else if (var9 == 2) {
                String var13 = arg0.method6674();
                this.field1599.method6432(new class388(var13), (long) var8);
            }
        }
    }
}
