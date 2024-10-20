package deob;

@ObfuscatedName("eh")
public class class140 {

    @ObfuscatedName("eh.h")
    public boolean field1601;

    @ObfuscatedName("eh.w")
    public boolean field1602;

    @ObfuscatedName("eh.v")
    public long field1603;

    @ObfuscatedName("eh.c")
    public int field1604 = 0;

    @ObfuscatedName("eh.q")
    public String field1605 = null;

    @ObfuscatedName("eh.i")
    public int field1606 = 0;

    @ObfuscatedName("eh.k")
    public boolean field1624;

    @ObfuscatedName("eh.o")
    public byte field1607;

    @ObfuscatedName("eh.n")
    public byte field1600;

    @ObfuscatedName("eh.d")
    public byte field1616;

    @ObfuscatedName("eh.a")
    public byte field1611;

    @ObfuscatedName("eh.m")
    public int field1612;

    @ObfuscatedName("eh.u")
    public long[] field1613;

    @ObfuscatedName("eh.l")
    public byte[] field1615;

    @ObfuscatedName("eh.z")
    public int[] field1610;

    @ObfuscatedName("eh.r")
    public int[] field1618;

    @ObfuscatedName("eh.y")
    public int[] field1617;

    @ObfuscatedName("eh.p")
    public boolean[] field1620;

    @ObfuscatedName("eh.e")
    public int field1619 = -1;

    @ObfuscatedName("eh.b")
    public int field1609 = -1;

    @ObfuscatedName("eh.x")
    public int field1621;

    @ObfuscatedName("eh.f")
    public long[] field1622;

    @ObfuscatedName("eh.t")
    public String[] field1623;

    @ObfuscatedName("eh.j")
    public String[] field1614;

    @ObfuscatedName("eh.g")
    public class420 field1625;

    public class140(class444 arg0) {
        this.method2690(arg0);
    }

    @ObfuscatedName("eh.s(IB)V")
    public void method2671(int arg0) {
        if (this.field1601) {
            if (this.field1613 == null) {
                this.field1613 = new long[arg0];
            } else {
                System.arraycopy(this.field1613, 0, this.field1613 = new long[arg0], 0, this.field1612);
            }
        }
        if (this.field1602) {
            if (this.field1623 == null) {
                this.field1623 = new String[arg0];
            } else {
                System.arraycopy(this.field1623, 0, this.field1623 = new String[arg0], 0, this.field1612);
            }
        }
        if (this.field1615 == null) {
            this.field1615 = new byte[arg0];
        } else {
            System.arraycopy(this.field1615, 0, this.field1615 = new byte[arg0], 0, this.field1612);
        }
        if (this.field1618 == null) {
            this.field1618 = new int[arg0];
        } else {
            System.arraycopy(this.field1618, 0, this.field1618 = new int[arg0], 0, this.field1612);
        }
        if (this.field1617 == null) {
            this.field1617 = new int[arg0];
        } else {
            System.arraycopy(this.field1617, 0, this.field1617 = new int[arg0], 0, this.field1612);
        }
        if (this.field1620 == null) {
            this.field1620 = new boolean[arg0];
        } else {
            System.arraycopy(this.field1620, 0, this.field1620 = new boolean[arg0], 0, this.field1612);
        }
    }

    @ObfuscatedName("eh.h(II)V")
    public void method2672(int arg0) {
        if (this.field1601) {
            if (this.field1622 == null) {
                this.field1622 = new long[arg0];
            } else {
                System.arraycopy(this.field1622, 0, this.field1622 = new long[arg0], 0, this.field1621);
            }
        }
        if (!this.field1602) {
            return;
        }
        if (this.field1614 == null) {
            this.field1614 = new String[arg0];
        } else {
            System.arraycopy(this.field1614, 0, this.field1614 = new String[arg0], 0, this.field1621);
        }
    }

    @ObfuscatedName("eh.w(Ljava/lang/String;B)I")
    public int method2673(String arg0) {
        if (arg0 == null || arg0.length() == 0) {
            return -1;
        }
        for (int var2 = 0; var2 < this.field1612; var2++) {
            if (this.field1623[var2].equals(arg0)) {
                return var2;
            }
        }
        return -1;
    }

    @ObfuscatedName("eh.v(IIIB)I")
    public int method2687(int arg0, int arg1, int arg2) {
        int var4 = arg2 == 31 ? -1 : (0x1 << arg2 + 1) - 1;
        return (this.field1618[arg0] & var4) >>> arg1;
    }

    @ObfuscatedName("eh.c(II)Ljava/lang/Integer;")
    public Integer method2675(int arg0) {
        if (this.field1625 == null) {
            return null;
        } else {
            class411 var2 = this.field1625.method6668((long) arg0);
            return var2 != null && var2 instanceof class410 ? Integer.valueOf(((class410) var2).field4467) : null;
        }
    }

    @ObfuscatedName("eh.q(I)[I")
    public int[] method2676() {
        if (this.field1610 == null) {
            String[] var1 = new String[this.field1612];
            this.field1610 = new int[this.field1612];
            int var2 = 0;
            while (var2 < this.field1612) {
                var1[var2] = this.field1623[var2];
                if (var1[var2] != null) {
                    var1[var2] = var1[var2].toLowerCase();
                }
                this.field1610[var2] = var2++;
            }
            int[] var3 = this.field1610;
            class441.method5120(var1, var3, 0, var1.length - 1);
        }
        return this.field1610;
    }

    @ObfuscatedName("eh.i(JLjava/lang/String;II)V")
    public void method2727(long arg0, String arg1, int arg2) {
        if (arg1 != null && arg1.length() == 0) {
            arg1 = null;
        }
        if (arg0 > 0L != this.field1601) {
            throw new RuntimeException("");
        } else if (arg1 != null == this.field1602) {
            if (arg0 > 0L && (this.field1613 == null || this.field1612 >= this.field1613.length) || arg1 != null && (this.field1623 == null || this.field1612 >= this.field1623.length)) {
                this.method2671(this.field1612 + 5);
            }
            if (this.field1613 != null) {
                this.field1613[this.field1612] = arg0;
            }
            if (this.field1623 != null) {
                this.field1623[this.field1612] = arg1;
            }
            if (this.field1619 == -1) {
                this.field1619 = this.field1612;
                this.field1615[this.field1612] = 126;
            } else {
                this.field1615[this.field1612] = 0;
            }
            this.field1618[this.field1612] = 0;
            this.field1617[this.field1612] = arg2;
            this.field1620[this.field1612] = false;
            this.field1612++;
            this.field1610 = null;
        } else {
            throw new RuntimeException("");
        }
    }

    @ObfuscatedName("eh.k(II)V")
    public void method2678(int arg0) {
        if (arg0 < 0 || arg0 >= this.field1612) {
            throw new RuntimeException("");
        }
        this.field1612--;
        this.field1610 = null;
        if (this.field1612 == 0) {
            this.field1613 = null;
            this.field1623 = null;
            this.field1615 = null;
            this.field1618 = null;
            this.field1617 = null;
            this.field1620 = null;
            this.field1619 = -1;
            this.field1609 = -1;
            return;
        }
        System.arraycopy(this.field1615, arg0 + 1, this.field1615, arg0, this.field1612 - arg0);
        System.arraycopy(this.field1618, arg0 + 1, this.field1618, arg0, this.field1612 - arg0);
        System.arraycopy(this.field1617, arg0 + 1, this.field1617, arg0, this.field1612 - arg0);
        System.arraycopy(this.field1620, arg0 + 1, this.field1620, arg0, this.field1612 - arg0);
        if (this.field1613 != null) {
            System.arraycopy(this.field1613, arg0 + 1, this.field1613, arg0, this.field1612 - arg0);
        }
        if (this.field1623 != null) {
            System.arraycopy(this.field1623, arg0 + 1, this.field1623, arg0, this.field1612 - arg0);
        }
        this.method2679();
    }

    @ObfuscatedName("eh.o(B)V")
    public void method2679() {
        if (this.field1612 == 0) {
            this.field1619 = -1;
            this.field1609 = -1;
            return;
        }
        this.field1619 = -1;
        this.field1609 = -1;
        int var1 = 0;
        byte var2 = this.field1615[0];
        for (int var3 = 1; var3 < this.field1612; var3++) {
            if (this.field1615[var3] > var2) {
                if (var2 == 125) {
                    this.field1609 = var1;
                }
                var1 = var3;
                var2 = this.field1615[var3];
            } else if (this.field1609 == -1 && this.field1615[var3] == 125) {
                this.field1609 = var3;
            }
        }
        this.field1619 = var1;
        if (this.field1619 != -1) {
            this.field1615[this.field1619] = 126;
        }
    }

    @ObfuscatedName("eh.n(JLjava/lang/String;I)V")
    public void method2680(long arg0, String arg1) {
        if (arg1 != null && arg1.length() == 0) {
            arg1 = null;
        }
        if (arg0 > 0L != this.field1601) {
            throw new RuntimeException("");
        } else if (arg1 != null == this.field1602) {
            if (arg0 > 0L && (this.field1622 == null || this.field1621 >= this.field1622.length) || arg1 != null && (this.field1614 == null || this.field1621 >= this.field1614.length)) {
                this.method2672(this.field1621 + 5);
            }
            if (this.field1622 != null) {
                this.field1622[this.field1621] = arg0;
            }
            if (this.field1614 != null) {
                this.field1614[this.field1621] = arg1;
            }
            this.field1621++;
        } else {
            throw new RuntimeException("");
        }
    }

    @ObfuscatedName("eh.d(II)V")
    public void method2714(int arg0) {
        this.field1621--;
        if (this.field1621 == 0) {
            this.field1622 = null;
            this.field1614 = null;
            return;
        }
        if (this.field1622 != null) {
            System.arraycopy(this.field1622, arg0 + 1, this.field1622, arg0, this.field1621 - arg0);
        }
        if (this.field1614 != null) {
            System.arraycopy(this.field1614, arg0 + 1, this.field1614, arg0, this.field1621 - arg0);
        }
    }

    @ObfuscatedName("eh.a(IBI)I")
    public int method2682(int arg0, byte arg1) {
        if (arg1 == 126 || arg1 == 127) {
            return -1;
        } else if (this.field1619 == arg0 && (this.field1609 == -1 || this.field1615[this.field1609] < 125)) {
            return -1;
        } else if (this.field1615[arg0] == arg1) {
            return -1;
        } else {
            this.field1615[arg0] = arg1;
            this.method2679();
            return arg0;
        }
    }

    @ObfuscatedName("eh.m(II)Z")
    public boolean method2707(int arg0) {
        if (this.field1619 == arg0 || this.field1615[arg0] == 126) {
            return false;
        }
        this.field1615[this.field1619] = 125;
        this.field1609 = this.field1619;
        this.field1615[arg0] = 126;
        this.field1619 = arg0;
        return true;
    }

    @ObfuscatedName("eh.u(IZI)I")
    public int method2685(int arg0, boolean arg1) {
        if (this.field1620[arg0] == arg1) {
            return -1;
        } else {
            this.field1620[arg0] = arg1;
            return arg0;
        }
    }

    @ObfuscatedName("eh.l(IIIII)I")
    public int method2709(int arg0, int arg1, int arg2, int arg3) {
        int var5 = (0x1 << arg2) - 1;
        int var6 = arg3 == 31 ? -1 : (0x1 << arg3 + 1) - 1;
        int var7 = var6 ^ var5;
        int var8 = arg1 << arg2;
        int var9 = var8 & var7;
        int var10 = this.field1618[arg0];
        if ((var10 & var7) == var9) {
            return -1;
        } else {
            int var11 = var10 & ~var7;
            this.field1618[arg0] = var11 | var9;
            return arg0;
        }
    }

    @ObfuscatedName("eh.z(IIB)Z")
    public boolean method2686(int arg0, int arg1) {
        if (this.field1625 == null) {
            this.field1625 = new class420(4);
        } else {
            class411 var3 = this.field1625.method6668((long) arg0);
            if (var3 != null) {
                if (var3 instanceof class410) {
                    class410 var4 = (class410) var3;
                    if (var4.field4467 == arg1) {
                        return false;
                    }
                    var4.field4467 = arg1;
                    return true;
                }
                var3.method6409();
            }
        }
        this.field1625.method6673(new class410(arg1), (long) arg0);
        return true;
    }

    @ObfuscatedName("eh.r(IIIII)Z")
    public boolean method2732(int arg0, int arg1, int arg2, int arg3) {
        int var5 = (0x1 << arg2) - 1;
        int var6 = arg3 == 31 ? -1 : (0x1 << arg3 + 1) - 1;
        int var7 = var6 ^ var5;
        int var8 = arg1 << arg2;
        int var9 = var8 & var7;
        if (this.field1625 == null) {
            this.field1625 = new class420(4);
        } else {
            class411 var10 = this.field1625.method6668((long) arg0);
            if (var10 != null) {
                if (var10 instanceof class410) {
                    class410 var11 = (class410) var10;
                    if ((var11.field4467 & var7) == var9) {
                        return false;
                    }
                    var11.field4467 &= ~var7;
                    var11.field4467 |= var9;
                    return true;
                }
                var10.method6409();
            }
        }
        this.field1625.method6673(new class410(var9), (long) arg0);
        return true;
    }

    @ObfuscatedName("eh.y(IJ)Z")
    public boolean method2688(int arg0, long arg1) {
        if (this.field1625 == null) {
            this.field1625 = new class420(4);
        } else {
            class411 var4 = this.field1625.method6668((long) arg0);
            if (var4 != null) {
                if (var4 instanceof class409) {
                    class409 var5 = (class409) var4;
                    if (var5.field4466 == arg1) {
                        return false;
                    }
                    var5.field4466 = arg1;
                    return true;
                }
                var4.method6409();
            }
        }
        this.field1625.method6673(new class409(arg1), (long) arg0);
        return true;
    }

    @ObfuscatedName("eh.p(ILjava/lang/String;B)Z")
    public boolean method2738(int arg0, String arg1) {
        if (arg1 == null) {
            arg1 = "";
        } else if (arg1.length() > 80) {
            arg1 = arg1.substring(0, 80);
        }
        if (this.field1625 == null) {
            this.field1625 = new class420(4);
        } else {
            class411 var3 = this.field1625.method6668((long) arg0);
            if (var3 != null) {
                if (var3 instanceof class407) {
                    class407 var4 = (class407) var3;
                    if (var4.field4464 instanceof String) {
                        if (arg1.equals(var4.field4464)) {
                            return false;
                        }
                        var4.method6409();
                        this.field1625.method6673(new class407(arg1), var4.field4468);
                        return true;
                    }
                }
                var3.method6409();
            }
        }
        this.field1625.method6673(new class407(arg1), (long) arg0);
        return true;
    }

    @ObfuscatedName("eh.e(Lqr;I)V")
    public void method2690(class444 arg0) {
        int var2 = arg0.method6929();
        if (var2 < 1 || var2 > 6) {
            throw new RuntimeException("" + var2);
        }
        int var3 = arg0.method6929();
        if ((var3 & 0x1) != 0) {
            this.field1601 = true;
        }
        if ((var3 & 0x2) != 0) {
            this.field1602 = true;
        }
        if (!this.field1601) {
            this.field1613 = null;
            this.field1622 = null;
        }
        if (!this.field1602) {
            this.field1623 = null;
            this.field1614 = null;
        }
        this.field1604 = arg0.method6934();
        this.field1606 = arg0.method6934();
        if (var2 <= 3 && this.field1606 != 0) {
            this.field1606 += 16912800;
        }
        this.field1612 = arg0.method7120();
        this.field1621 = arg0.method6929();
        this.field1605 = arg0.method6975();
        if (var2 >= 4) {
            arg0.method6934();
        }
        this.field1624 = arg0.method6929() == 1;
        this.field1607 = arg0.method6930();
        this.field1600 = arg0.method6930();
        this.field1616 = arg0.method6930();
        this.field1611 = arg0.method6930();
        if (this.field1612 > 0) {
            if (this.field1601 && (this.field1613 == null || this.field1613.length < this.field1612)) {
                this.field1613 = new long[this.field1612];
            }
            if (this.field1602 && (this.field1623 == null || this.field1623.length < this.field1612)) {
                this.field1623 = new String[this.field1612];
            }
            if (this.field1615 == null || this.field1615.length < this.field1612) {
                this.field1615 = new byte[this.field1612];
            }
            if (this.field1618 == null || this.field1618.length < this.field1612) {
                this.field1618 = new int[this.field1612];
            }
            if (this.field1617 == null || this.field1617.length < this.field1612) {
                this.field1617 = new int[this.field1612];
            }
            if (this.field1620 == null || this.field1620.length < this.field1612) {
                this.field1620 = new boolean[this.field1612];
            }
            for (int var4 = 0; var4 < this.field1612; var4++) {
                if (this.field1601) {
                    this.field1613[var4] = arg0.method6935();
                }
                if (this.field1602) {
                    this.field1623[var4] = arg0.method6938();
                }
                this.field1615[var4] = arg0.method6930();
                if (var2 >= 2) {
                    this.field1618[var4] = arg0.method6934();
                }
                if (var2 >= 5) {
                    this.field1617[var4] = arg0.method7120();
                } else {
                    this.field1617[var4] = 0;
                }
                if (var2 >= 6) {
                    this.field1620[var4] = arg0.method6929() == 1;
                } else {
                    this.field1620[var4] = false;
                }
            }
            this.method2679();
        }
        if (this.field1621 > 0) {
            if (this.field1601 && (this.field1622 == null || this.field1622.length < this.field1621)) {
                this.field1622 = new long[this.field1621];
            }
            if (this.field1602 && (this.field1614 == null || this.field1614.length < this.field1621)) {
                this.field1614 = new String[this.field1621];
            }
            for (int var5 = 0; var5 < this.field1621; var5++) {
                if (this.field1601) {
                    this.field1622[var5] = arg0.method6935();
                }
                if (this.field1602) {
                    this.field1614[var5] = arg0.method6938();
                }
            }
        }
        if (var2 < 3) {
            return;
        }
        int var6 = arg0.method7120();
        if (var6 <= 0) {
            return;
        }
        this.field1625 = new class420(var6 < 16 ? class272.method4475(var6) : 16);
        while (var6-- > 0) {
            int var7 = arg0.method6934();
            int var8 = var7 & 0x3FFFFFFF;
            int var9 = var7 >>> 30;
            if (var9 == 0) {
                int var10 = arg0.method6934();
                this.field1625.method6673(new class410(var10), (long) var8);
            } else if (var9 == 1) {
                long var11 = arg0.method6935();
                this.field1625.method6673(new class409(var11), (long) var8);
            } else if (var9 == 2) {
                String var13 = arg0.method6975();
                this.field1625.method6673(new class407(var13), (long) var8);
            }
        }
    }
}
