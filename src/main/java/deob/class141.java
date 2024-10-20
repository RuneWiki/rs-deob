package deob;

@ObfuscatedName("ed")
public class class141 {

    @ObfuscatedName("ed.p")
    public boolean field1625;

    @ObfuscatedName("ed.f")
    public boolean field1626;

    @ObfuscatedName("ed.n")
    public long field1627;

    @ObfuscatedName("ed.k")
    public int field1631 = 0;

    @ObfuscatedName("ed.w")
    public String field1629 = null;

    @ObfuscatedName("ed.s")
    public int field1647 = 0;

    @ObfuscatedName("ed.q")
    public boolean field1638;

    @ObfuscatedName("ed.m")
    public byte field1632;

    @ObfuscatedName("ed.x")
    public byte field1633;

    @ObfuscatedName("ed.j")
    public byte field1634;

    @ObfuscatedName("ed.v")
    public byte field1635;

    @ObfuscatedName("ed.h")
    public int field1636;

    @ObfuscatedName("ed.t")
    public long[] field1650;

    @ObfuscatedName("ed.u")
    public byte[] field1653;

    @ObfuscatedName("ed.d")
    public int[] field1637;

    @ObfuscatedName("ed.b")
    public int[] field1630;

    @ObfuscatedName("ed.a")
    public int[] field1641;

    @ObfuscatedName("ed.l")
    public boolean[] field1643;

    @ObfuscatedName("ed.e")
    public int field1624 = -1;

    @ObfuscatedName("ed.g")
    public int field1644 = -1;

    @ObfuscatedName("ed.y")
    public int field1639;

    @ObfuscatedName("ed.i")
    public long[] field1646;

    @ObfuscatedName("ed.r")
    public String[] field1654;

    @ObfuscatedName("ed.z")
    public String[] field1648;

    @ObfuscatedName("ed.o")
    public class421 field1649;

    public class141(class445 arg0) {
        this.method2900(arg0);
    }

    @ObfuscatedName("ed.c(IB)V")
    public void method2881(int arg0) {
        if (this.field1625) {
            if (this.field1650 == null) {
                this.field1650 = new long[arg0];
            } else {
                System.arraycopy(this.field1650, 0, this.field1650 = new long[arg0], 0, this.field1636);
            }
        }
        if (this.field1626) {
            if (this.field1654 == null) {
                this.field1654 = new String[arg0];
            } else {
                System.arraycopy(this.field1654, 0, this.field1654 = new String[arg0], 0, this.field1636);
            }
        }
        if (this.field1653 == null) {
            this.field1653 = new byte[arg0];
        } else {
            System.arraycopy(this.field1653, 0, this.field1653 = new byte[arg0], 0, this.field1636);
        }
        if (this.field1630 == null) {
            this.field1630 = new int[arg0];
        } else {
            System.arraycopy(this.field1630, 0, this.field1630 = new int[arg0], 0, this.field1636);
        }
        if (this.field1641 == null) {
            this.field1641 = new int[arg0];
        } else {
            System.arraycopy(this.field1641, 0, this.field1641 = new int[arg0], 0, this.field1636);
        }
        if (this.field1643 == null) {
            this.field1643 = new boolean[arg0];
        } else {
            System.arraycopy(this.field1643, 0, this.field1643 = new boolean[arg0], 0, this.field1636);
        }
    }

    @ObfuscatedName("ed.p(II)V")
    public void method2894(int arg0) {
        if (this.field1625) {
            if (this.field1646 == null) {
                this.field1646 = new long[arg0];
            } else {
                System.arraycopy(this.field1646, 0, this.field1646 = new long[arg0], 0, this.field1639);
            }
        }
        if (!this.field1626) {
            return;
        }
        if (this.field1648 == null) {
            this.field1648 = new String[arg0];
        } else {
            System.arraycopy(this.field1648, 0, this.field1648 = new String[arg0], 0, this.field1639);
        }
    }

    @ObfuscatedName("ed.f(Ljava/lang/String;I)I")
    public int method2904(String arg0) {
        if (arg0 == null || arg0.length() == 0) {
            return -1;
        }
        for (int var2 = 0; var2 < this.field1636; var2++) {
            if (this.field1654[var2].equals(arg0)) {
                return var2;
            }
        }
        return -1;
    }

    @ObfuscatedName("ed.n(IIII)I")
    public int method2919(int arg0, int arg1, int arg2) {
        int var4 = arg2 == 31 ? -1 : (0x1 << arg2 + 1) - 1;
        return (this.field1630[arg0] & var4) >>> arg1;
    }

    @ObfuscatedName("ed.k(II)Ljava/lang/Integer;")
    public Integer method2885(int arg0) {
        if (this.field1649 == null) {
            return null;
        } else {
            class412 var2 = this.field1649.method6917((long) arg0);
            return var2 != null && var2 instanceof class411 ? Integer.valueOf(((class411) var2).field4503) : null;
        }
    }

    @ObfuscatedName("ed.w(I)[I")
    public int[] method2901() {
        if (this.field1637 == null) {
            String[] var1 = new String[this.field1636];
            this.field1637 = new int[this.field1636];
            int var2 = 0;
            while (var2 < this.field1636) {
                var1[var2] = this.field1654[var2];
                if (var1[var2] != null) {
                    var1[var2] = var1[var2].toLowerCase();
                }
                this.field1637[var2] = var2++;
            }
            class442.method2387(var1, this.field1637);
        }
        return this.field1637;
    }

    @ObfuscatedName("ed.s(JLjava/lang/String;IB)V")
    public void method2887(long arg0, String arg1, int arg2) {
        if (arg1 != null && arg1.length() == 0) {
            arg1 = null;
        }
        if (arg0 > 0L != this.field1625) {
            throw new RuntimeException("");
        } else if (arg1 != null == this.field1626) {
            if (arg0 > 0L && (this.field1650 == null || this.field1636 >= this.field1650.length) || arg1 != null && (this.field1654 == null || this.field1636 >= this.field1654.length)) {
                this.method2881(this.field1636 + 5);
            }
            if (this.field1650 != null) {
                this.field1650[this.field1636] = arg0;
            }
            if (this.field1654 != null) {
                this.field1654[this.field1636] = arg1;
            }
            if (this.field1624 == -1) {
                this.field1624 = this.field1636;
                this.field1653[this.field1636] = 126;
            } else {
                this.field1653[this.field1636] = 0;
            }
            this.field1630[this.field1636] = 0;
            this.field1641[this.field1636] = arg2;
            this.field1643[this.field1636] = false;
            this.field1636++;
            this.field1637 = null;
        } else {
            throw new RuntimeException("");
        }
    }

    @ObfuscatedName("ed.q(II)V")
    public void method2916(int arg0) {
        if (arg0 < 0 || arg0 >= this.field1636) {
            throw new RuntimeException("");
        }
        this.field1636--;
        this.field1637 = null;
        if (this.field1636 == 0) {
            this.field1650 = null;
            this.field1654 = null;
            this.field1653 = null;
            this.field1630 = null;
            this.field1641 = null;
            this.field1643 = null;
            this.field1624 = -1;
            this.field1644 = -1;
            return;
        }
        System.arraycopy(this.field1653, arg0 + 1, this.field1653, arg0, this.field1636 - arg0);
        System.arraycopy(this.field1630, arg0 + 1, this.field1630, arg0, this.field1636 - arg0);
        System.arraycopy(this.field1641, arg0 + 1, this.field1641, arg0, this.field1636 - arg0);
        System.arraycopy(this.field1643, arg0 + 1, this.field1643, arg0, this.field1636 - arg0);
        if (this.field1650 != null) {
            System.arraycopy(this.field1650, arg0 + 1, this.field1650, arg0, this.field1636 - arg0);
        }
        if (this.field1654 != null) {
            System.arraycopy(this.field1654, arg0 + 1, this.field1654, arg0, this.field1636 - arg0);
        }
        this.method2889();
    }

    @ObfuscatedName("ed.m(I)V")
    public void method2889() {
        if (this.field1636 == 0) {
            this.field1624 = -1;
            this.field1644 = -1;
            return;
        }
        this.field1624 = -1;
        this.field1644 = -1;
        int var1 = 0;
        byte var2 = this.field1653[0];
        for (int var3 = 1; var3 < this.field1636; var3++) {
            if (this.field1653[var3] > var2) {
                if (var2 == 125) {
                    this.field1644 = var1;
                }
                var1 = var3;
                var2 = this.field1653[var3];
            } else if (this.field1644 == -1 && this.field1653[var3] == 125) {
                this.field1644 = var3;
            }
        }
        this.field1624 = var1;
        if (this.field1624 != -1) {
            this.field1653[this.field1624] = 126;
        }
    }

    @ObfuscatedName("ed.x(JLjava/lang/String;I)V")
    public void method2880(long arg0, String arg1) {
        if (arg1 != null && arg1.length() == 0) {
            arg1 = null;
        }
        if (arg0 > 0L != this.field1625) {
            throw new RuntimeException("");
        } else if (arg1 != null == this.field1626) {
            if (arg0 > 0L && (this.field1646 == null || this.field1639 >= this.field1646.length) || arg1 != null && (this.field1648 == null || this.field1639 >= this.field1648.length)) {
                this.method2894(this.field1639 + 5);
            }
            if (this.field1646 != null) {
                this.field1646[this.field1639] = arg0;
            }
            if (this.field1648 != null) {
                this.field1648[this.field1639] = arg1;
            }
            this.field1639++;
        } else {
            throw new RuntimeException("");
        }
    }

    @ObfuscatedName("ed.j(IB)V")
    public void method2891(int arg0) {
        this.field1639--;
        if (this.field1639 == 0) {
            this.field1646 = null;
            this.field1648 = null;
            return;
        }
        if (this.field1646 != null) {
            System.arraycopy(this.field1646, arg0 + 1, this.field1646, arg0, this.field1639 - arg0);
        }
        if (this.field1648 != null) {
            System.arraycopy(this.field1648, arg0 + 1, this.field1648, arg0, this.field1639 - arg0);
        }
    }

    @ObfuscatedName("ed.v(IBI)I")
    public int method2921(int arg0, byte arg1) {
        if (arg1 == 126 || arg1 == 127) {
            return -1;
        } else if (this.field1624 == arg0 && (this.field1644 == -1 || this.field1653[this.field1644] < 125)) {
            return -1;
        } else if (this.field1653[arg0] == arg1) {
            return -1;
        } else {
            this.field1653[arg0] = arg1;
            this.method2889();
            return arg0;
        }
    }

    @ObfuscatedName("ed.h(II)Z")
    public boolean method2893(int arg0) {
        if (this.field1624 == arg0 || this.field1653[arg0] == 126) {
            return false;
        }
        this.field1653[this.field1624] = 125;
        this.field1644 = this.field1624;
        this.field1653[arg0] = 126;
        this.field1624 = arg0;
        return true;
    }

    @ObfuscatedName("ed.t(IZI)I")
    public int method2940(int arg0, boolean arg1) {
        if (this.field1643[arg0] == arg1) {
            return -1;
        } else {
            this.field1643[arg0] = arg1;
            return arg0;
        }
    }

    @ObfuscatedName("ed.u(IIIII)I")
    public int method2895(int arg0, int arg1, int arg2, int arg3) {
        int var5 = (0x1 << arg2) - 1;
        int var6 = arg3 == 31 ? -1 : (0x1 << arg3 + 1) - 1;
        int var7 = var6 ^ var5;
        int var8 = arg1 << arg2;
        int var9 = var8 & var7;
        int var10 = this.field1630[arg0];
        if ((var10 & var7) == var9) {
            return -1;
        } else {
            int var11 = var10 & ~var7;
            this.field1630[arg0] = var11 | var9;
            return arg0;
        }
    }

    @ObfuscatedName("ed.d(III)Z")
    public boolean method2896(int arg0, int arg1) {
        if (this.field1649 == null) {
            this.field1649 = new class421(4);
        } else {
            class412 var3 = this.field1649.method6917((long) arg0);
            if (var3 != null) {
                if (var3 instanceof class411) {
                    class411 var4 = (class411) var3;
                    if (var4.field4503 == arg1) {
                        return false;
                    }
                    var4.field4503 = arg1;
                    return true;
                }
                var3.method6657();
            }
        }
        this.field1649.method6918(new class411(arg1), (long) arg0);
        return true;
    }

    @ObfuscatedName("ed.b(IIIII)Z")
    public boolean method2930(int arg0, int arg1, int arg2, int arg3) {
        int var5 = (0x1 << arg2) - 1;
        int var6 = arg3 == 31 ? -1 : (0x1 << arg3 + 1) - 1;
        int var7 = var6 ^ var5;
        int var8 = arg1 << arg2;
        int var9 = var8 & var7;
        if (this.field1649 == null) {
            this.field1649 = new class421(4);
        } else {
            class412 var10 = this.field1649.method6917((long) arg0);
            if (var10 != null) {
                if (var10 instanceof class411) {
                    class411 var11 = (class411) var10;
                    if ((var11.field4503 & var7) == var9) {
                        return false;
                    }
                    var11.field4503 &= ~var7;
                    var11.field4503 |= var9;
                    return true;
                }
                var10.method6657();
            }
        }
        this.field1649.method6918(new class411(var9), (long) arg0);
        return true;
    }

    @ObfuscatedName("ed.a(IJ)Z")
    public boolean method2898(int arg0, long arg1) {
        if (this.field1649 == null) {
            this.field1649 = new class421(4);
        } else {
            class412 var4 = this.field1649.method6917((long) arg0);
            if (var4 != null) {
                if (var4 instanceof class410) {
                    class410 var5 = (class410) var4;
                    if (var5.field4502 == arg1) {
                        return false;
                    }
                    var5.field4502 = arg1;
                    return true;
                }
                var4.method6657();
            }
        }
        this.field1649.method6918(new class410(arg1), (long) arg0);
        return true;
    }

    @ObfuscatedName("ed.l(ILjava/lang/String;I)Z")
    public boolean method2899(int arg0, String arg1) {
        if (arg1 == null) {
            arg1 = "";
        } else if (arg1.length() > 80) {
            arg1 = arg1.substring(0, 80);
        }
        if (this.field1649 == null) {
            this.field1649 = new class421(4);
        } else {
            class412 var3 = this.field1649.method6917((long) arg0);
            if (var3 != null) {
                if (var3 instanceof class408) {
                    class408 var4 = (class408) var3;
                    if (var4.field4500 instanceof String) {
                        if (arg1.equals(var4.field4500)) {
                            return false;
                        }
                        var4.method6657();
                        this.field1649.method6918(new class408(arg1), var4.field4504);
                        return true;
                    }
                }
                var3.method6657();
            }
        }
        this.field1649.method6918(new class408(arg1), (long) arg0);
        return true;
    }

    @ObfuscatedName("ed.e(Lqq;I)V")
    public void method2900(class445 arg0) {
        int var2 = arg0.method7196();
        if (var2 < 1 || var2 > 6) {
            throw new RuntimeException("" + var2);
        }
        int var3 = arg0.method7196();
        if ((var3 & 0x1) != 0) {
            this.field1625 = true;
        }
        if ((var3 & 0x2) != 0) {
            this.field1626 = true;
        }
        if (!this.field1625) {
            this.field1650 = null;
            this.field1646 = null;
        }
        if (!this.field1626) {
            this.field1654 = null;
            this.field1648 = null;
        }
        this.field1631 = arg0.method7201();
        this.field1647 = arg0.method7201();
        if (var2 <= 3 && this.field1647 != 0) {
            this.field1647 += 16912800;
        }
        this.field1636 = arg0.method7198();
        this.field1639 = arg0.method7196();
        this.field1629 = arg0.method7206();
        if (var2 >= 4) {
            arg0.method7201();
        }
        this.field1638 = arg0.method7196() == 1;
        this.field1632 = arg0.method7197();
        this.field1633 = arg0.method7197();
        this.field1634 = arg0.method7197();
        this.field1635 = arg0.method7197();
        if (this.field1636 > 0) {
            if (this.field1625 && (this.field1650 == null || this.field1650.length < this.field1636)) {
                this.field1650 = new long[this.field1636];
            }
            if (this.field1626 && (this.field1654 == null || this.field1654.length < this.field1636)) {
                this.field1654 = new String[this.field1636];
            }
            if (this.field1653 == null || this.field1653.length < this.field1636) {
                this.field1653 = new byte[this.field1636];
            }
            if (this.field1630 == null || this.field1630.length < this.field1636) {
                this.field1630 = new int[this.field1636];
            }
            if (this.field1641 == null || this.field1641.length < this.field1636) {
                this.field1641 = new int[this.field1636];
            }
            if (this.field1643 == null || this.field1643.length < this.field1636) {
                this.field1643 = new boolean[this.field1636];
            }
            for (int var4 = 0; var4 < this.field1636; var4++) {
                if (this.field1625) {
                    this.field1650[var4] = arg0.method7319();
                }
                if (this.field1626) {
                    this.field1654[var4] = arg0.method7205();
                }
                this.field1653[var4] = arg0.method7197();
                if (var2 >= 2) {
                    this.field1630[var4] = arg0.method7201();
                }
                if (var2 >= 5) {
                    this.field1641[var4] = arg0.method7198();
                } else {
                    this.field1641[var4] = 0;
                }
                if (var2 >= 6) {
                    this.field1643[var4] = arg0.method7196() == 1;
                } else {
                    this.field1643[var4] = false;
                }
            }
            this.method2889();
        }
        if (this.field1639 > 0) {
            if (this.field1625 && (this.field1646 == null || this.field1646.length < this.field1639)) {
                this.field1646 = new long[this.field1639];
            }
            if (this.field1626 && (this.field1648 == null || this.field1648.length < this.field1639)) {
                this.field1648 = new String[this.field1639];
            }
            for (int var5 = 0; var5 < this.field1639; var5++) {
                if (this.field1625) {
                    this.field1646[var5] = arg0.method7319();
                }
                if (this.field1626) {
                    this.field1648[var5] = arg0.method7205();
                }
            }
        }
        if (var2 < 3) {
            return;
        }
        int var6 = arg0.method7198();
        if (var6 <= 0) {
            return;
        }
        this.field1649 = new class421(var6 < 16 ? class273.method2989(var6) : 16);
        while (var6-- > 0) {
            int var7 = arg0.method7201();
            int var8 = var7 & 0x3FFFFFFF;
            int var9 = var7 >>> 30;
            if (var9 == 0) {
                int var10 = arg0.method7201();
                this.field1649.method6918(new class411(var10), (long) var8);
            } else if (var9 == 1) {
                long var11 = arg0.method7319();
                this.field1649.method6918(new class410(var11), (long) var8);
            } else if (var9 == 2) {
                String var13 = arg0.method7206();
                this.field1649.method6918(new class408(var13), (long) var8);
            }
        }
    }
}
