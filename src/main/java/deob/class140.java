package deob;

@ObfuscatedName("ex")
public class class140 {

    @ObfuscatedName("ex.c")
    public boolean field1585;

    @ObfuscatedName("ex.i")
    public boolean field1586;

    @ObfuscatedName("ex.f")
    public long field1587;

    @ObfuscatedName("ex.b")
    public int field1584 = 0;

    @ObfuscatedName("ex.n")
    public String field1589 = null;

    @ObfuscatedName("ex.s")
    public int field1590 = 0;

    @ObfuscatedName("ex.l")
    public boolean field1598;

    @ObfuscatedName("ex.q")
    public byte field1592;

    @ObfuscatedName("ex.o")
    public byte field1593;

    @ObfuscatedName("ex.r")
    public byte field1594;

    @ObfuscatedName("ex.p")
    public byte field1607;

    @ObfuscatedName("ex.w")
    public int field1596;

    @ObfuscatedName("ex.k")
    public long[] field1597;

    @ObfuscatedName("ex.d")
    public byte[] field1611;

    @ObfuscatedName("ex.m")
    public int[] field1599;

    @ObfuscatedName("ex.u")
    public int[] field1600;

    @ObfuscatedName("ex.t")
    public int[] field1601;

    @ObfuscatedName("ex.g")
    public boolean[] field1602;

    @ObfuscatedName("ex.x")
    public int field1603 = -1;

    @ObfuscatedName("ex.a")
    public int field1605 = -1;

    @ObfuscatedName("ex.y")
    public int field1588;

    @ObfuscatedName("ex.j")
    public long[] field1606;

    @ObfuscatedName("ex.e")
    public String[] field1591;

    @ObfuscatedName("ex.z")
    public String[] field1595;

    @ObfuscatedName("ex.h")
    public class418 field1609;

    public class140(class438 arg0) {
        this.method2736(arg0);
    }

    @ObfuscatedName("ex.v(IB)V")
    public void method2728(int arg0) {
        if (this.field1585) {
            if (this.field1597 == null) {
                this.field1597 = new long[arg0];
            } else {
                System.arraycopy(this.field1597, 0, this.field1597 = new long[arg0], 0, this.field1596);
            }
        }
        if (this.field1586) {
            if (this.field1591 == null) {
                this.field1591 = new String[arg0];
            } else {
                System.arraycopy(this.field1591, 0, this.field1591 = new String[arg0], 0, this.field1596);
            }
        }
        if (this.field1611 == null) {
            this.field1611 = new byte[arg0];
        } else {
            System.arraycopy(this.field1611, 0, this.field1611 = new byte[arg0], 0, this.field1596);
        }
        if (this.field1600 == null) {
            this.field1600 = new int[arg0];
        } else {
            System.arraycopy(this.field1600, 0, this.field1600 = new int[arg0], 0, this.field1596);
        }
        if (this.field1601 == null) {
            this.field1601 = new int[arg0];
        } else {
            System.arraycopy(this.field1601, 0, this.field1601 = new int[arg0], 0, this.field1596);
        }
        if (this.field1602 == null) {
            this.field1602 = new boolean[arg0];
        } else {
            System.arraycopy(this.field1602, 0, this.field1602 = new boolean[arg0], 0, this.field1596);
        }
    }

    @ObfuscatedName("ex.c(IB)V")
    public void method2729(int arg0) {
        if (this.field1585) {
            if (this.field1606 == null) {
                this.field1606 = new long[arg0];
            } else {
                System.arraycopy(this.field1606, 0, this.field1606 = new long[arg0], 0, this.field1588);
            }
        }
        if (!this.field1586) {
            return;
        }
        if (this.field1595 == null) {
            this.field1595 = new String[arg0];
        } else {
            System.arraycopy(this.field1595, 0, this.field1595 = new String[arg0], 0, this.field1588);
        }
    }

    @ObfuscatedName("ex.i(Ljava/lang/String;I)I")
    public int method2730(String arg0) {
        if (arg0 == null || arg0.length() == 0) {
            return -1;
        }
        for (int var2 = 0; var2 < this.field1596; var2++) {
            if (this.field1591[var2].equals(arg0)) {
                return var2;
            }
        }
        return -1;
    }

    @ObfuscatedName("ex.f(IIII)I")
    public int method2731(int arg0, int arg1, int arg2) {
        int var4 = arg2 == 31 ? -1 : (0x1 << arg2 + 1) - 1;
        return (this.field1600[arg0] & var4) >>> arg1;
    }

    @ObfuscatedName("ex.b(II)Ljava/lang/Integer;")
    public Integer method2732(int arg0) {
        if (this.field1609 == null) {
            return null;
        } else {
            class409 var2 = this.field1609.method6760((long) arg0);
            return var2 != null && var2 instanceof class408 ? Integer.valueOf(((class408) var2).field4409) : null;
        }
    }

    @ObfuscatedName("ex.n(B)[I")
    public int[] method2733() {
        if (this.field1599 == null) {
            String[] var1 = new String[this.field1596];
            this.field1599 = new int[this.field1596];
            int var2 = 0;
            while (var2 < this.field1596) {
                var1[var2] = this.field1591[var2];
                if (var1[var2] != null) {
                    var1[var2] = var1[var2].toLowerCase();
                }
                this.field1599[var2] = var2++;
            }
            int[] var3 = this.field1599;
            class435.method6902(var1, var3, 0, var1.length - 1);
        }
        return this.field1599;
    }

    @ObfuscatedName("ex.s(JLjava/lang/String;II)V")
    public void method2734(long arg0, String arg1, int arg2) {
        if (arg1 != null && arg1.length() == 0) {
            arg1 = null;
        }
        if (arg0 > 0L != this.field1585) {
            throw new RuntimeException("");
        } else if (this.field1586 == (arg1 != null)) {
            if (arg0 > 0L && (this.field1597 == null || this.field1596 >= this.field1597.length) || arg1 != null && (this.field1591 == null || this.field1596 >= this.field1591.length)) {
                this.method2728(this.field1596 + 5);
            }
            if (this.field1597 != null) {
                this.field1597[this.field1596] = arg0;
            }
            if (this.field1591 != null) {
                this.field1591[this.field1596] = arg1;
            }
            if (this.field1603 == -1) {
                this.field1603 = this.field1596;
                this.field1611[this.field1596] = 126;
            } else {
                this.field1611[this.field1596] = 0;
            }
            this.field1600[this.field1596] = 0;
            this.field1601[this.field1596] = arg2;
            this.field1602[this.field1596] = false;
            this.field1596++;
            this.field1599 = null;
        } else {
            throw new RuntimeException("");
        }
    }

    @ObfuscatedName("ex.l(II)V")
    public void method2735(int arg0) {
        if (arg0 < 0 || arg0 >= this.field1596) {
            throw new RuntimeException("");
        }
        this.field1596--;
        this.field1599 = null;
        if (this.field1596 == 0) {
            this.field1597 = null;
            this.field1591 = null;
            this.field1611 = null;
            this.field1600 = null;
            this.field1601 = null;
            this.field1602 = null;
            this.field1603 = -1;
            this.field1605 = -1;
            return;
        }
        System.arraycopy(this.field1611, arg0 + 1, this.field1611, arg0, this.field1596 - arg0);
        System.arraycopy(this.field1600, arg0 + 1, this.field1600, arg0, this.field1596 - arg0);
        System.arraycopy(this.field1601, arg0 + 1, this.field1601, arg0, this.field1596 - arg0);
        System.arraycopy(this.field1602, arg0 + 1, this.field1602, arg0, this.field1596 - arg0);
        if (this.field1597 != null) {
            System.arraycopy(this.field1597, arg0 + 1, this.field1597, arg0, this.field1596 - arg0);
        }
        if (this.field1591 != null) {
            System.arraycopy(this.field1591, arg0 + 1, this.field1591, arg0, this.field1596 - arg0);
        }
        this.method2758();
    }

    @ObfuscatedName("ex.q(I)V")
    public void method2758() {
        if (this.field1596 == 0) {
            this.field1603 = -1;
            this.field1605 = -1;
            return;
        }
        this.field1603 = -1;
        this.field1605 = -1;
        int var1 = 0;
        byte var2 = this.field1611[0];
        for (int var3 = 1; var3 < this.field1596; var3++) {
            if (this.field1611[var3] > var2) {
                if (var2 == 125) {
                    this.field1605 = var1;
                }
                var1 = var3;
                var2 = this.field1611[var3];
            } else if (this.field1605 == -1 && this.field1611[var3] == 125) {
                this.field1605 = var3;
            }
        }
        this.field1603 = var1;
        if (this.field1603 != -1) {
            this.field1611[this.field1603] = 126;
        }
    }

    @ObfuscatedName("ex.o(JLjava/lang/String;B)V")
    public void method2771(long arg0, String arg1) {
        if (arg1 != null && arg1.length() == 0) {
            arg1 = null;
        }
        if (this.field1585 != arg0 > 0L) {
            throw new RuntimeException("");
        } else if (arg1 != null == this.field1586) {
            if (arg0 > 0L && (this.field1606 == null || this.field1588 >= this.field1606.length) || arg1 != null && (this.field1595 == null || this.field1588 >= this.field1595.length)) {
                this.method2729(this.field1588 + 5);
            }
            if (this.field1606 != null) {
                this.field1606[this.field1588] = arg0;
            }
            if (this.field1595 != null) {
                this.field1595[this.field1588] = arg1;
            }
            this.field1588++;
        } else {
            throw new RuntimeException("");
        }
    }

    @ObfuscatedName("ex.r(II)V")
    public void method2738(int arg0) {
        this.field1588--;
        if (this.field1588 == 0) {
            this.field1606 = null;
            this.field1595 = null;
            return;
        }
        if (this.field1606 != null) {
            System.arraycopy(this.field1606, arg0 + 1, this.field1606, arg0, this.field1588 - arg0);
        }
        if (this.field1595 != null) {
            System.arraycopy(this.field1595, arg0 + 1, this.field1595, arg0, this.field1588 - arg0);
        }
    }

    @ObfuscatedName("ex.p(IBB)I")
    public int method2739(int arg0, byte arg1) {
        if (arg1 == 126 || arg1 == 127) {
            return -1;
        } else if (this.field1603 == arg0 && (this.field1605 == -1 || this.field1611[this.field1605] < 125)) {
            return -1;
        } else if (this.field1611[arg0] == arg1) {
            return -1;
        } else {
            this.field1611[arg0] = arg1;
            this.method2758();
            return arg0;
        }
    }

    @ObfuscatedName("ex.w(II)Z")
    public boolean method2740(int arg0) {
        if (this.field1603 == arg0 || this.field1611[arg0] == 126) {
            return false;
        }
        this.field1611[this.field1603] = 125;
        this.field1605 = this.field1603;
        this.field1611[arg0] = 126;
        this.field1603 = arg0;
        return true;
    }

    @ObfuscatedName("ex.k(IZI)I")
    public int method2802(int arg0, boolean arg1) {
        if (this.field1602[arg0] == arg1) {
            return -1;
        } else {
            this.field1602[arg0] = arg1;
            return arg0;
        }
    }

    @ObfuscatedName("ex.d(IIIIB)I")
    public int method2742(int arg0, int arg1, int arg2, int arg3) {
        int var5 = (0x1 << arg2) - 1;
        int var6 = arg3 == 31 ? -1 : (0x1 << arg3 + 1) - 1;
        int var7 = var6 ^ var5;
        int var8 = arg1 << arg2;
        int var9 = var8 & var7;
        int var10 = this.field1600[arg0];
        if ((var10 & var7) == var9) {
            return -1;
        } else {
            int var11 = var10 & ~var7;
            this.field1600[arg0] = var11 | var9;
            return arg0;
        }
    }

    @ObfuscatedName("ex.m(III)Z")
    public boolean method2743(int arg0, int arg1) {
        if (this.field1609 == null) {
            this.field1609 = new class418(4);
        } else {
            class409 var3 = this.field1609.method6760((long) arg0);
            if (var3 != null) {
                if (var3 instanceof class408) {
                    class408 var4 = (class408) var3;
                    if (var4.field4409 == arg1) {
                        return false;
                    }
                    var4.field4409 = arg1;
                    return true;
                }
                var3.method6503();
            }
        }
        this.field1609.method6757(new class408(arg1), (long) arg0);
        return true;
    }

    @ObfuscatedName("ex.u(IIIIB)Z")
    public boolean method2744(int arg0, int arg1, int arg2, int arg3) {
        int var5 = (0x1 << arg2) - 1;
        int var6 = arg3 == 31 ? -1 : (0x1 << arg3 + 1) - 1;
        int var7 = var6 ^ var5;
        int var8 = arg1 << arg2;
        int var9 = var8 & var7;
        if (this.field1609 == null) {
            this.field1609 = new class418(4);
        } else {
            class409 var10 = this.field1609.method6760((long) arg0);
            if (var10 != null) {
                if (var10 instanceof class408) {
                    class408 var11 = (class408) var10;
                    if ((var11.field4409 & var7) == var9) {
                        return false;
                    }
                    var11.field4409 &= ~var7;
                    var11.field4409 |= var9;
                    return true;
                }
                var10.method6503();
            }
        }
        this.field1609.method6757(new class408(var9), (long) arg0);
        return true;
    }

    @ObfuscatedName("ex.t(IJ)Z")
    public boolean method2753(int arg0, long arg1) {
        if (this.field1609 == null) {
            this.field1609 = new class418(4);
        } else {
            class409 var4 = this.field1609.method6760((long) arg0);
            if (var4 != null) {
                if (var4 instanceof class407) {
                    class407 var5 = (class407) var4;
                    if (var5.field4408 == arg1) {
                        return false;
                    }
                    var5.field4408 = arg1;
                    return true;
                }
                var4.method6503();
            }
        }
        this.field1609.method6757(new class407(arg1), (long) arg0);
        return true;
    }

    @ObfuscatedName("ex.g(ILjava/lang/String;B)Z")
    public boolean method2746(int arg0, String arg1) {
        if (arg1 == null) {
            arg1 = "";
        } else if (arg1.length() > 80) {
            arg1 = arg1.substring(0, 80);
        }
        if (this.field1609 == null) {
            this.field1609 = new class418(4);
        } else {
            class409 var3 = this.field1609.method6760((long) arg0);
            if (var3 != null) {
                if (var3 instanceof class405) {
                    class405 var4 = (class405) var3;
                    if (var4.field4406 instanceof String) {
                        if (arg1.equals(var4.field4406)) {
                            return false;
                        }
                        var4.method6503();
                        this.field1609.method6757(new class405(arg1), var4.field4410);
                        return true;
                    }
                }
                var3.method6503();
            }
        }
        this.field1609.method6757(new class405(arg1), (long) arg0);
        return true;
    }

    @ObfuscatedName("ex.x(Lpi;I)V")
    public void method2736(class438 arg0) {
        int var2 = arg0.method6971();
        if (var2 < 1 || var2 > 6) {
            throw new RuntimeException("" + var2);
        }
        int var3 = arg0.method6971();
        if ((var3 & 0x1) != 0) {
            this.field1585 = true;
        }
        if ((var3 & 0x2) != 0) {
            this.field1586 = true;
        }
        if (!this.field1585) {
            this.field1597 = null;
            this.field1606 = null;
        }
        if (!this.field1586) {
            this.field1591 = null;
            this.field1595 = null;
        }
        this.field1584 = arg0.method6976();
        this.field1590 = arg0.method6976();
        if (var2 <= 3 && this.field1590 != 0) {
            this.field1590 += 16912800;
        }
        this.field1596 = arg0.method7148();
        this.field1588 = arg0.method6971();
        this.field1589 = arg0.method6981();
        if (var2 >= 4) {
            arg0.method6976();
        }
        this.field1598 = arg0.method6971() == 1;
        this.field1592 = arg0.method7093();
        this.field1593 = arg0.method7093();
        this.field1594 = arg0.method7093();
        this.field1607 = arg0.method7093();
        if (this.field1596 > 0) {
            if (this.field1585 && (this.field1597 == null || this.field1597.length < this.field1596)) {
                this.field1597 = new long[this.field1596];
            }
            if (this.field1586 && (this.field1591 == null || this.field1591.length < this.field1596)) {
                this.field1591 = new String[this.field1596];
            }
            if (this.field1611 == null || this.field1611.length < this.field1596) {
                this.field1611 = new byte[this.field1596];
            }
            if (this.field1600 == null || this.field1600.length < this.field1596) {
                this.field1600 = new int[this.field1596];
            }
            if (this.field1601 == null || this.field1601.length < this.field1596) {
                this.field1601 = new int[this.field1596];
            }
            if (this.field1602 == null || this.field1602.length < this.field1596) {
                this.field1602 = new boolean[this.field1596];
            }
            for (int var4 = 0; var4 < this.field1596; var4++) {
                if (this.field1585) {
                    this.field1597[var4] = arg0.method7003();
                }
                if (this.field1586) {
                    this.field1591[var4] = arg0.method6980();
                }
                this.field1611[var4] = arg0.method7093();
                if (var2 >= 2) {
                    this.field1600[var4] = arg0.method6976();
                }
                if (var2 >= 5) {
                    this.field1601[var4] = arg0.method7148();
                } else {
                    this.field1601[var4] = 0;
                }
                if (var2 >= 6) {
                    this.field1602[var4] = arg0.method6971() == 1;
                } else {
                    this.field1602[var4] = false;
                }
            }
            this.method2758();
        }
        if (this.field1588 > 0) {
            if (this.field1585 && (this.field1606 == null || this.field1606.length < this.field1588)) {
                this.field1606 = new long[this.field1588];
            }
            if (this.field1586 && (this.field1595 == null || this.field1595.length < this.field1588)) {
                this.field1595 = new String[this.field1588];
            }
            for (int var5 = 0; var5 < this.field1588; var5++) {
                if (this.field1585) {
                    this.field1606[var5] = arg0.method7003();
                }
                if (this.field1586) {
                    this.field1595[var5] = arg0.method6980();
                }
            }
        }
        if (var2 < 3) {
            return;
        }
        int var6 = arg0.method7148();
        if (var6 <= 0) {
            return;
        }
        this.field1609 = new class418(var6 < 16 ? class272.method1825(var6) : 16);
        while (var6-- > 0) {
            int var7 = arg0.method6976();
            int var8 = var7 & 0x3FFFFFFF;
            int var9 = var7 >>> 30;
            if (var9 == 0) {
                int var10 = arg0.method6976();
                this.field1609.method6757(new class408(var10), (long) var8);
            } else if (var9 == 1) {
                long var11 = arg0.method7003();
                this.field1609.method6757(new class407(var11), (long) var8);
            } else if (var9 == 2) {
                String var13 = arg0.method6981();
                this.field1609.method6757(new class405(var13), (long) var8);
            }
        }
    }
}
