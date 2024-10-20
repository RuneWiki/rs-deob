package deob;

@ObfuscatedName("en")
public class class140 {

    @ObfuscatedName("en.v")
    public boolean field1649;

    @ObfuscatedName("en.q")
    public boolean field1627;

    @ObfuscatedName("en.f")
    public long field1628;

    @ObfuscatedName("en.j")
    public int field1629 = 0;

    @ObfuscatedName("en.e")
    public String field1630 = null;

    @ObfuscatedName("en.g")
    public int field1631 = 0;

    @ObfuscatedName("en.w")
    public boolean field1632;

    @ObfuscatedName("en.y")
    public byte field1638;

    @ObfuscatedName("en.i")
    public byte field1634;

    @ObfuscatedName("en.s")
    public byte field1635;

    @ObfuscatedName("en.t")
    public byte field1646;

    @ObfuscatedName("en.z")
    public int field1637;

    @ObfuscatedName("en.r")
    public long[] field1644;

    @ObfuscatedName("en.u")
    public byte[] field1633;

    @ObfuscatedName("en.k")
    public int[] field1642;

    @ObfuscatedName("en.h")
    public int[] field1641;

    @ObfuscatedName("en.x")
    public int[] field1650;

    @ObfuscatedName("en.l")
    public boolean[] field1643;

    @ObfuscatedName("en.a")
    public int field1639 = -1;

    @ObfuscatedName("en.p")
    public int field1645 = -1;

    @ObfuscatedName("en.b")
    public int field1640;

    @ObfuscatedName("en.n")
    public long[] field1647;

    @ObfuscatedName("en.o")
    public String[] field1648;

    @ObfuscatedName("en.m")
    public String[] field1636;

    @ObfuscatedName("en.d")
    public class419 field1626;

    public class140(class443 arg0) {
        this.method2758(arg0);
    }

    @ObfuscatedName("en.c(II)V")
    public void method2739(int arg0) {
        if (this.field1649) {
            if (this.field1644 == null) {
                this.field1644 = new long[arg0];
            } else {
                System.arraycopy(this.field1644, 0, this.field1644 = new long[arg0], 0, this.field1637);
            }
        }
        if (this.field1627) {
            if (this.field1648 == null) {
                this.field1648 = new String[arg0];
            } else {
                System.arraycopy(this.field1648, 0, this.field1648 = new String[arg0], 0, this.field1637);
            }
        }
        if (this.field1633 == null) {
            this.field1633 = new byte[arg0];
        } else {
            System.arraycopy(this.field1633, 0, this.field1633 = new byte[arg0], 0, this.field1637);
        }
        if (this.field1641 == null) {
            this.field1641 = new int[arg0];
        } else {
            System.arraycopy(this.field1641, 0, this.field1641 = new int[arg0], 0, this.field1637);
        }
        if (this.field1650 == null) {
            this.field1650 = new int[arg0];
        } else {
            System.arraycopy(this.field1650, 0, this.field1650 = new int[arg0], 0, this.field1637);
        }
        if (this.field1643 == null) {
            this.field1643 = new boolean[arg0];
        } else {
            System.arraycopy(this.field1643, 0, this.field1643 = new boolean[arg0], 0, this.field1637);
        }
    }

    @ObfuscatedName("en.v(II)V")
    public void method2763(int arg0) {
        if (this.field1649) {
            if (this.field1647 == null) {
                this.field1647 = new long[arg0];
            } else {
                System.arraycopy(this.field1647, 0, this.field1647 = new long[arg0], 0, this.field1640);
            }
        }
        if (!this.field1627) {
            return;
        }
        if (this.field1636 == null) {
            this.field1636 = new String[arg0];
        } else {
            System.arraycopy(this.field1636, 0, this.field1636 = new String[arg0], 0, this.field1640);
        }
    }

    @ObfuscatedName("en.q(Ljava/lang/String;I)I")
    public int method2780(String arg0) {
        if (arg0 == null || arg0.length() == 0) {
            return -1;
        }
        for (int var2 = 0; var2 < this.field1637; var2++) {
            if (this.field1648[var2].equals(arg0)) {
                return var2;
            }
        }
        return -1;
    }

    @ObfuscatedName("en.f(IIIS)I")
    public int method2761(int arg0, int arg1, int arg2) {
        int var4 = arg2 == 31 ? -1 : (0x1 << arg2 + 1) - 1;
        return (this.field1641[arg0] & var4) >>> arg1;
    }

    @ObfuscatedName("en.j(IB)Ljava/lang/Integer;")
    public Integer method2743(int arg0) {
        if (this.field1626 == null) {
            return null;
        } else {
            class410 var2 = this.field1626.method6756((long) arg0);
            return var2 != null && var2 instanceof class409 ? Integer.valueOf(((class409) var2).field4461) : null;
        }
    }

    @ObfuscatedName("en.e(S)[I")
    public int[] method2744() {
        if (this.field1642 == null) {
            String[] var1 = new String[this.field1637];
            this.field1642 = new int[this.field1637];
            int var2 = 0;
            while (var2 < this.field1637) {
                var1[var2] = this.field1648[var2];
                if (var1[var2] != null) {
                    var1[var2] = var1[var2].toLowerCase();
                }
                this.field1642[var2] = var2++;
            }
            class440.method5936(var1, this.field1642);
        }
        return this.field1642;
    }

    @ObfuscatedName("en.g(JLjava/lang/String;IB)V")
    public void method2745(long arg0, String arg1, int arg2) {
        if (arg1 != null && arg1.length() == 0) {
            arg1 = null;
        }
        if (this.field1649 != arg0 > 0L) {
            throw new RuntimeException("");
        } else if (arg1 != null == this.field1627) {
            if (arg0 > 0L && (this.field1644 == null || this.field1637 >= this.field1644.length) || arg1 != null && (this.field1648 == null || this.field1637 >= this.field1648.length)) {
                this.method2739(this.field1637 + 5);
            }
            if (this.field1644 != null) {
                this.field1644[this.field1637] = arg0;
            }
            if (this.field1648 != null) {
                this.field1648[this.field1637] = arg1;
            }
            if (this.field1639 == -1) {
                this.field1639 = this.field1637;
                this.field1633[this.field1637] = 126;
            } else {
                this.field1633[this.field1637] = 0;
            }
            this.field1641[this.field1637] = 0;
            this.field1650[this.field1637] = arg2;
            this.field1643[this.field1637] = false;
            this.field1637++;
            this.field1642 = null;
        } else {
            throw new RuntimeException("");
        }
    }

    @ObfuscatedName("en.w(II)V")
    public void method2746(int arg0) {
        if (arg0 < 0 || arg0 >= this.field1637) {
            throw new RuntimeException("");
        }
        this.field1637--;
        this.field1642 = null;
        if (this.field1637 == 0) {
            this.field1644 = null;
            this.field1648 = null;
            this.field1633 = null;
            this.field1641 = null;
            this.field1650 = null;
            this.field1643 = null;
            this.field1639 = -1;
            this.field1645 = -1;
            return;
        }
        System.arraycopy(this.field1633, arg0 + 1, this.field1633, arg0, this.field1637 - arg0);
        System.arraycopy(this.field1641, arg0 + 1, this.field1641, arg0, this.field1637 - arg0);
        System.arraycopy(this.field1650, arg0 + 1, this.field1650, arg0, this.field1637 - arg0);
        System.arraycopy(this.field1643, arg0 + 1, this.field1643, arg0, this.field1637 - arg0);
        if (this.field1644 != null) {
            System.arraycopy(this.field1644, arg0 + 1, this.field1644, arg0, this.field1637 - arg0);
        }
        if (this.field1648 != null) {
            System.arraycopy(this.field1648, arg0 + 1, this.field1648, arg0, this.field1637 - arg0);
        }
        this.method2747();
    }

    @ObfuscatedName("en.y(B)V")
    public void method2747() {
        if (this.field1637 == 0) {
            this.field1639 = -1;
            this.field1645 = -1;
            return;
        }
        this.field1639 = -1;
        this.field1645 = -1;
        int var1 = 0;
        byte var2 = this.field1633[0];
        for (int var3 = 1; var3 < this.field1637; var3++) {
            if (this.field1633[var3] > var2) {
                if (var2 == 125) {
                    this.field1645 = var1;
                }
                var1 = var3;
                var2 = this.field1633[var3];
            } else if (this.field1645 == -1 && this.field1633[var3] == 125) {
                this.field1645 = var3;
            }
        }
        this.field1639 = var1;
        if (this.field1639 != -1) {
            this.field1633[this.field1639] = 126;
        }
    }

    @ObfuscatedName("en.i(JLjava/lang/String;I)V")
    public void method2748(long arg0, String arg1) {
        if (arg1 != null && arg1.length() == 0) {
            arg1 = null;
        }
        if (this.field1649 != arg0 > 0L) {
            throw new RuntimeException("");
        } else if (this.field1627 == (arg1 != null)) {
            if (arg0 > 0L && (this.field1647 == null || this.field1640 >= this.field1647.length) || arg1 != null && (this.field1636 == null || this.field1640 >= this.field1636.length)) {
                this.method2763(this.field1640 + 5);
            }
            if (this.field1647 != null) {
                this.field1647[this.field1640] = arg0;
            }
            if (this.field1636 != null) {
                this.field1636[this.field1640] = arg1;
            }
            this.field1640++;
        } else {
            throw new RuntimeException("");
        }
    }

    @ObfuscatedName("en.s(IB)V")
    public void method2808(int arg0) {
        this.field1640--;
        if (this.field1640 == 0) {
            this.field1647 = null;
            this.field1636 = null;
            return;
        }
        if (this.field1647 != null) {
            System.arraycopy(this.field1647, arg0 + 1, this.field1647, arg0, this.field1640 - arg0);
        }
        if (this.field1636 != null) {
            System.arraycopy(this.field1636, arg0 + 1, this.field1636, arg0, this.field1640 - arg0);
        }
    }

    @ObfuscatedName("en.t(IBI)I")
    public int method2750(int arg0, byte arg1) {
        if (arg1 == 126 || arg1 == 127) {
            return -1;
        } else if (this.field1639 == arg0 && (this.field1645 == -1 || this.field1633[this.field1645] < 125)) {
            return -1;
        } else if (this.field1633[arg0] == arg1) {
            return -1;
        } else {
            this.field1633[arg0] = arg1;
            this.method2747();
            return arg0;
        }
    }

    @ObfuscatedName("en.z(IB)Z")
    public boolean method2805(int arg0) {
        if (this.field1639 == arg0 || this.field1633[arg0] == 126) {
            return false;
        }
        this.field1633[this.field1639] = 125;
        this.field1645 = this.field1639;
        this.field1633[arg0] = 126;
        this.field1639 = arg0;
        return true;
    }

    @ObfuscatedName("en.r(IZI)I")
    public int method2752(int arg0, boolean arg1) {
        if (this.field1643[arg0] == arg1) {
            return -1;
        } else {
            this.field1643[arg0] = arg1;
            return arg0;
        }
    }

    @ObfuscatedName("en.u(IIIIB)I")
    public int method2753(int arg0, int arg1, int arg2, int arg3) {
        int var5 = (0x1 << arg2) - 1;
        int var6 = arg3 == 31 ? -1 : (0x1 << arg3 + 1) - 1;
        int var7 = var6 ^ var5;
        int var8 = arg1 << arg2;
        int var9 = var8 & var7;
        int var10 = this.field1641[arg0];
        if ((var10 & var7) == var9) {
            return -1;
        } else {
            int var11 = var10 & ~var7;
            this.field1641[arg0] = var11 | var9;
            return arg0;
        }
    }

    @ObfuscatedName("en.k(IIB)Z")
    public boolean method2754(int arg0, int arg1) {
        if (this.field1626 == null) {
            this.field1626 = new class419(4);
        } else {
            class410 var3 = this.field1626.method6756((long) arg0);
            if (var3 != null) {
                if (var3 instanceof class409) {
                    class409 var4 = (class409) var3;
                    if (var4.field4461 == arg1) {
                        return false;
                    }
                    var4.field4461 = arg1;
                    return true;
                }
                var3.method6497();
            }
        }
        this.field1626.method6754(new class409(arg1), (long) arg0);
        return true;
    }

    @ObfuscatedName("en.h(IIIIB)Z")
    public boolean method2793(int arg0, int arg1, int arg2, int arg3) {
        int var5 = (0x1 << arg2) - 1;
        int var6 = arg3 == 31 ? -1 : (0x1 << arg3 + 1) - 1;
        int var7 = var6 ^ var5;
        int var8 = arg1 << arg2;
        int var9 = var8 & var7;
        if (this.field1626 == null) {
            this.field1626 = new class419(4);
        } else {
            class410 var10 = this.field1626.method6756((long) arg0);
            if (var10 != null) {
                if (var10 instanceof class409) {
                    class409 var11 = (class409) var10;
                    if ((var11.field4461 & var7) == var9) {
                        return false;
                    }
                    var11.field4461 &= ~var7;
                    var11.field4461 |= var9;
                    return true;
                }
                var10.method6497();
            }
        }
        this.field1626.method6754(new class409(var9), (long) arg0);
        return true;
    }

    @ObfuscatedName("en.x(IJ)Z")
    public boolean method2756(int arg0, long arg1) {
        if (this.field1626 == null) {
            this.field1626 = new class419(4);
        } else {
            class410 var4 = this.field1626.method6756((long) arg0);
            if (var4 != null) {
                if (var4 instanceof class408) {
                    class408 var5 = (class408) var4;
                    if (var5.field4460 == arg1) {
                        return false;
                    }
                    var5.field4460 = arg1;
                    return true;
                }
                var4.method6497();
            }
        }
        this.field1626.method6754(new class408(arg1), (long) arg0);
        return true;
    }

    @ObfuscatedName("en.l(ILjava/lang/String;I)Z")
    public boolean method2757(int arg0, String arg1) {
        if (arg1 == null) {
            arg1 = "";
        } else if (arg1.length() > 80) {
            arg1 = arg1.substring(0, 80);
        }
        if (this.field1626 == null) {
            this.field1626 = new class419(4);
        } else {
            class410 var3 = this.field1626.method6756((long) arg0);
            if (var3 != null) {
                if (var3 instanceof class406) {
                    class406 var4 = (class406) var3;
                    if (var4.field4458 instanceof String) {
                        if (arg1.equals(var4.field4458)) {
                            return false;
                        }
                        var4.method6497();
                        this.field1626.method6754(new class406(arg1), var4.field4462);
                        return true;
                    }
                }
                var3.method6497();
            }
        }
        this.field1626.method6754(new class406(arg1), (long) arg0);
        return true;
    }

    @ObfuscatedName("en.a(Lqt;B)V")
    public void method2758(class443 arg0) {
        int var2 = arg0.method7047();
        if (var2 < 1 || var2 > 6) {
            throw new RuntimeException("" + var2);
        }
        int var3 = arg0.method7047();
        if ((var3 & 0x1) != 0) {
            this.field1649 = true;
        }
        if ((var3 & 0x2) != 0) {
            this.field1627 = true;
        }
        if (!this.field1649) {
            this.field1644 = null;
            this.field1647 = null;
        }
        if (!this.field1627) {
            this.field1648 = null;
            this.field1636 = null;
        }
        this.field1629 = arg0.method7052();
        this.field1631 = arg0.method7052();
        if (var2 <= 3 && this.field1631 != 0) {
            this.field1631 += 16912800;
        }
        this.field1637 = arg0.method7049();
        this.field1640 = arg0.method7047();
        this.field1630 = arg0.method7057();
        if (var2 >= 4) {
            arg0.method7052();
        }
        this.field1632 = arg0.method7047() == 1;
        this.field1638 = arg0.method7048();
        this.field1634 = arg0.method7048();
        this.field1635 = arg0.method7048();
        this.field1646 = arg0.method7048();
        if (this.field1637 > 0) {
            if (this.field1649 && (this.field1644 == null || this.field1644.length < this.field1637)) {
                this.field1644 = new long[this.field1637];
            }
            if (this.field1627 && (this.field1648 == null || this.field1648.length < this.field1637)) {
                this.field1648 = new String[this.field1637];
            }
            if (this.field1633 == null || this.field1633.length < this.field1637) {
                this.field1633 = new byte[this.field1637];
            }
            if (this.field1641 == null || this.field1641.length < this.field1637) {
                this.field1641 = new int[this.field1637];
            }
            if (this.field1650 == null || this.field1650.length < this.field1637) {
                this.field1650 = new int[this.field1637];
            }
            if (this.field1643 == null || this.field1643.length < this.field1637) {
                this.field1643 = new boolean[this.field1637];
            }
            for (int var4 = 0; var4 < this.field1637; var4++) {
                if (this.field1649) {
                    this.field1644[var4] = arg0.method7106();
                }
                if (this.field1627) {
                    this.field1648[var4] = arg0.method7056();
                }
                this.field1633[var4] = arg0.method7048();
                if (var2 >= 2) {
                    this.field1641[var4] = arg0.method7052();
                }
                if (var2 >= 5) {
                    this.field1650[var4] = arg0.method7049();
                } else {
                    this.field1650[var4] = 0;
                }
                if (var2 >= 6) {
                    this.field1643[var4] = arg0.method7047() == 1;
                } else {
                    this.field1643[var4] = false;
                }
            }
            this.method2747();
        }
        if (this.field1640 > 0) {
            if (this.field1649 && (this.field1647 == null || this.field1647.length < this.field1640)) {
                this.field1647 = new long[this.field1640];
            }
            if (this.field1627 && (this.field1636 == null || this.field1636.length < this.field1640)) {
                this.field1636 = new String[this.field1640];
            }
            for (int var5 = 0; var5 < this.field1640; var5++) {
                if (this.field1649) {
                    this.field1647[var5] = arg0.method7106();
                }
                if (this.field1627) {
                    this.field1636[var5] = arg0.method7056();
                }
            }
        }
        if (var2 < 3) {
            return;
        }
        int var6 = arg0.method7049();
        if (var6 <= 0) {
            return;
        }
        this.field1626 = new class419(var6 < 16 ? class271.method2726(var6) : 16);
        while (var6-- > 0) {
            int var7 = arg0.method7052();
            int var8 = var7 & 0x3FFFFFFF;
            int var9 = var7 >>> 30;
            if (var9 == 0) {
                int var10 = arg0.method7052();
                this.field1626.method6754(new class409(var10), (long) var8);
            } else if (var9 == 1) {
                long var11 = arg0.method7106();
                this.field1626.method6754(new class408(var11), (long) var8);
            } else if (var9 == 2) {
                String var13 = arg0.method7057();
                this.field1626.method6754(new class406(var13), (long) var8);
            }
        }
    }
}
