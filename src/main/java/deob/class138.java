package deob;

@ObfuscatedName("ej")
public class class138 {

    @ObfuscatedName("ej.b")
    public boolean field1562;

    @ObfuscatedName("ej.p")
    public boolean field1577;

    @ObfuscatedName("ej.m")
    public long field1563;

    @ObfuscatedName("ej.t")
    public int field1564 = 0;

    @ObfuscatedName("ej.s")
    public String field1565 = null;

    @ObfuscatedName("ej.j")
    public int field1566 = 0;

    @ObfuscatedName("ej.w")
    public boolean field1567;

    @ObfuscatedName("ej.n")
    public byte field1568;

    @ObfuscatedName("ej.r")
    public byte field1569;

    @ObfuscatedName("ej.o")
    public byte field1570;

    @ObfuscatedName("ej.v")
    public byte field1571;

    @ObfuscatedName("ej.d")
    public int field1584;

    @ObfuscatedName("ej.h")
    public long[] field1573;

    @ObfuscatedName("ej.g")
    public byte[] field1574;

    @ObfuscatedName("ej.e")
    public int[] field1575;

    @ObfuscatedName("ej.a")
    public int[] field1576;

    @ObfuscatedName("ej.u")
    public int[] field1583;

    @ObfuscatedName("ej.k")
    public boolean[] field1578;

    @ObfuscatedName("ej.f")
    public int field1579 = -1;

    @ObfuscatedName("ej.l")
    public int field1580 = -1;

    @ObfuscatedName("ej.q")
    public int field1581;

    @ObfuscatedName("ej.x")
    public long[] field1572;

    @ObfuscatedName("ej.z")
    public String[] field1561;

    @ObfuscatedName("ej.i")
    public String[] field1582;

    @ObfuscatedName("ej.y")
    public class396 field1585;

    public class138(class419 arg0) {
        this.method2686(arg0);
    }

    @ObfuscatedName("ej.c(II)V")
    public void method2635(int arg0) {
        if (this.field1562) {
            if (this.field1573 == null) {
                this.field1573 = new long[arg0];
            } else {
                System.arraycopy(this.field1573, 0, this.field1573 = new long[arg0], 0, this.field1584);
            }
        }
        if (this.field1577) {
            if (this.field1561 == null) {
                this.field1561 = new String[arg0];
            } else {
                System.arraycopy(this.field1561, 0, this.field1561 = new String[arg0], 0, this.field1584);
            }
        }
        if (this.field1574 == null) {
            this.field1574 = new byte[arg0];
        } else {
            System.arraycopy(this.field1574, 0, this.field1574 = new byte[arg0], 0, this.field1584);
        }
        if (this.field1576 == null) {
            this.field1576 = new int[arg0];
        } else {
            System.arraycopy(this.field1576, 0, this.field1576 = new int[arg0], 0, this.field1584);
        }
        if (this.field1583 == null) {
            this.field1583 = new int[arg0];
        } else {
            System.arraycopy(this.field1583, 0, this.field1583 = new int[arg0], 0, this.field1584);
        }
        if (this.field1578 == null) {
            this.field1578 = new boolean[arg0];
        } else {
            System.arraycopy(this.field1578, 0, this.field1578 = new boolean[arg0], 0, this.field1584);
        }
    }

    @ObfuscatedName("ej.b(II)V")
    public void method2636(int arg0) {
        if (this.field1562) {
            if (this.field1572 == null) {
                this.field1572 = new long[arg0];
            } else {
                System.arraycopy(this.field1572, 0, this.field1572 = new long[arg0], 0, this.field1581);
            }
        }
        if (!this.field1577) {
            return;
        }
        if (this.field1582 == null) {
            this.field1582 = new String[arg0];
        } else {
            System.arraycopy(this.field1582, 0, this.field1582 = new String[arg0], 0, this.field1581);
        }
    }

    @ObfuscatedName("ej.p(Ljava/lang/String;I)I")
    public int method2672(String arg0) {
        if (arg0 == null || arg0.length() == 0) {
            return -1;
        }
        for (int var2 = 0; var2 < this.field1584; var2++) {
            if (this.field1561[var2].equals(arg0)) {
                return var2;
            }
        }
        return -1;
    }

    @ObfuscatedName("ej.m(IIIB)I")
    public int method2638(int arg0, int arg1, int arg2) {
        int var4 = arg2 == 31 ? -1 : (0x1 << arg2 + 1) - 1;
        return (this.field1576[arg0] & var4) >>> arg1;
    }

    @ObfuscatedName("ej.t(II)Ljava/lang/Integer;")
    public Integer method2663(int arg0) {
        if (this.field1585 == null) {
            return null;
        } else {
            class387 var2 = this.field1585.method6429((long) arg0);
            return var2 != null && var2 instanceof class386 ? Integer.valueOf(((class386) var2).field4256) : null;
        }
    }

    @ObfuscatedName("ej.s(I)[I")
    public int[] method2693() {
        if (this.field1575 == null) {
            String[] var1 = new String[this.field1584];
            this.field1575 = new int[this.field1584];
            int var2 = 0;
            while (var2 < this.field1584) {
                var1[var2] = this.field1561[var2];
                if (var1[var2] != null) {
                    var1[var2] = var1[var2].toLowerCase();
                }
                this.field1575[var2] = var2++;
            }
            int[] var3 = this.field1575;
            class414.method4975(var1, var3, 0, var1.length - 1);
        }
        return this.field1575;
    }

    @ObfuscatedName("ej.j(JLjava/lang/String;II)V")
    public void method2641(long arg0, String arg1, int arg2) {
        if (arg1 != null && arg1.length() == 0) {
            arg1 = null;
        }
        if (this.field1562 != arg0 > 0L) {
            throw new RuntimeException("");
        } else if (arg1 != null == this.field1577) {
            if (arg0 > 0L && (this.field1573 == null || this.field1584 >= this.field1573.length) || arg1 != null && (this.field1561 == null || this.field1584 >= this.field1561.length)) {
                this.method2635(this.field1584 + 5);
            }
            if (this.field1573 != null) {
                this.field1573[this.field1584] = arg0;
            }
            if (this.field1561 != null) {
                this.field1561[this.field1584] = arg1;
            }
            if (this.field1579 == -1) {
                this.field1579 = this.field1584;
                this.field1574[this.field1584] = 126;
            } else {
                this.field1574[this.field1584] = 0;
            }
            this.field1576[this.field1584] = 0;
            this.field1583[this.field1584] = arg2;
            this.field1578[this.field1584] = false;
            this.field1584++;
            this.field1575 = null;
        } else {
            throw new RuntimeException("");
        }
    }

    @ObfuscatedName("ej.w(IB)V")
    public void method2653(int arg0) {
        if (arg0 < 0 || arg0 >= this.field1584) {
            throw new RuntimeException("");
        }
        this.field1584--;
        this.field1575 = null;
        if (this.field1584 == 0) {
            this.field1573 = null;
            this.field1561 = null;
            this.field1574 = null;
            this.field1576 = null;
            this.field1583 = null;
            this.field1578 = null;
            this.field1579 = -1;
            this.field1580 = -1;
            return;
        }
        System.arraycopy(this.field1574, arg0 + 1, this.field1574, arg0, this.field1584 - arg0);
        System.arraycopy(this.field1576, arg0 + 1, this.field1576, arg0, this.field1584 - arg0);
        System.arraycopy(this.field1583, arg0 + 1, this.field1583, arg0, this.field1584 - arg0);
        System.arraycopy(this.field1578, arg0 + 1, this.field1578, arg0, this.field1584 - arg0);
        if (this.field1573 != null) {
            System.arraycopy(this.field1573, arg0 + 1, this.field1573, arg0, this.field1584 - arg0);
        }
        if (this.field1561 != null) {
            System.arraycopy(this.field1561, arg0 + 1, this.field1561, arg0, this.field1584 - arg0);
        }
        this.method2643();
    }

    @ObfuscatedName("ej.n(S)V")
    public void method2643() {
        if (this.field1584 == 0) {
            this.field1579 = -1;
            this.field1580 = -1;
            return;
        }
        this.field1579 = -1;
        this.field1580 = -1;
        int var1 = 0;
        byte var2 = this.field1574[0];
        for (int var3 = 1; var3 < this.field1584; var3++) {
            if (this.field1574[var3] > var2) {
                if (var2 == 125) {
                    this.field1580 = var1;
                }
                var1 = var3;
                var2 = this.field1574[var3];
            } else if (this.field1580 == -1 && this.field1574[var3] == 125) {
                this.field1580 = var3;
            }
        }
        this.field1579 = var1;
        if (this.field1579 != -1) {
            this.field1574[this.field1579] = 126;
        }
    }

    @ObfuscatedName("ej.r(JLjava/lang/String;I)V")
    public void method2644(long arg0, String arg1) {
        if (arg1 != null && arg1.length() == 0) {
            arg1 = null;
        }
        if (arg0 > 0L != this.field1562) {
            throw new RuntimeException("");
        } else if (arg1 != null == this.field1577) {
            if (arg0 > 0L && (this.field1572 == null || this.field1581 >= this.field1572.length) || arg1 != null && (this.field1582 == null || this.field1581 >= this.field1582.length)) {
                this.method2636(this.field1581 + 5);
            }
            if (this.field1572 != null) {
                this.field1572[this.field1581] = arg0;
            }
            if (this.field1582 != null) {
                this.field1582[this.field1581] = arg1;
            }
            this.field1581++;
        } else {
            throw new RuntimeException("");
        }
    }

    @ObfuscatedName("ej.o(II)V")
    public void method2645(int arg0) {
        this.field1581--;
        if (this.field1581 == 0) {
            this.field1572 = null;
            this.field1582 = null;
            return;
        }
        if (this.field1572 != null) {
            System.arraycopy(this.field1572, arg0 + 1, this.field1572, arg0, this.field1581 - arg0);
        }
        if (this.field1582 != null) {
            System.arraycopy(this.field1582, arg0 + 1, this.field1582, arg0, this.field1581 - arg0);
        }
    }

    @ObfuscatedName("ej.v(IBB)I")
    public int method2678(int arg0, byte arg1) {
        if (arg1 == 126 || arg1 == 127) {
            return -1;
        } else if (this.field1579 == arg0 && (this.field1580 == -1 || this.field1574[this.field1580] < 125)) {
            return -1;
        } else if (this.field1574[arg0] == arg1) {
            return -1;
        } else {
            this.field1574[arg0] = arg1;
            this.method2643();
            return arg0;
        }
    }

    @ObfuscatedName("ej.d(IB)Z")
    public boolean method2654(int arg0) {
        if (this.field1579 == arg0 || this.field1574[arg0] == 126) {
            return false;
        }
        this.field1574[this.field1579] = 125;
        this.field1580 = this.field1579;
        this.field1574[arg0] = 126;
        this.field1579 = arg0;
        return true;
    }

    @ObfuscatedName("ej.h(IZI)I")
    public int method2648(int arg0, boolean arg1) {
        if (this.field1578[arg0] == arg1) {
            return -1;
        } else {
            this.field1578[arg0] = arg1;
            return arg0;
        }
    }

    @ObfuscatedName("ej.g(IIIII)I")
    public int method2649(int arg0, int arg1, int arg2, int arg3) {
        int var5 = (0x1 << arg2) - 1;
        int var6 = arg3 == 31 ? -1 : (0x1 << arg3 + 1) - 1;
        int var7 = var6 ^ var5;
        int var8 = arg1 << arg2;
        int var9 = var8 & var7;
        int var10 = this.field1576[arg0];
        if ((var10 & var7) == var9) {
            return -1;
        } else {
            int var11 = var10 & ~var7;
            this.field1576[arg0] = var11 | var9;
            return arg0;
        }
    }

    @ObfuscatedName("ej.e(IIB)Z")
    public boolean method2650(int arg0, int arg1) {
        if (this.field1585 == null) {
            this.field1585 = new class396(4);
        } else {
            class387 var3 = this.field1585.method6429((long) arg0);
            if (var3 != null) {
                if (var3 instanceof class386) {
                    class386 var4 = (class386) var3;
                    if (var4.field4256 == arg1) {
                        return false;
                    }
                    var4.field4256 = arg1;
                    return true;
                }
                var3.method6163();
            }
        }
        this.field1585.method6431(new class386(arg1), (long) arg0);
        return true;
    }

    @ObfuscatedName("ej.a(IIIIB)Z")
    public boolean method2651(int arg0, int arg1, int arg2, int arg3) {
        int var5 = (0x1 << arg2) - 1;
        int var6 = arg3 == 31 ? -1 : (0x1 << arg3 + 1) - 1;
        int var7 = var6 ^ var5;
        int var8 = arg1 << arg2;
        int var9 = var8 & var7;
        if (this.field1585 == null) {
            this.field1585 = new class396(4);
        } else {
            class387 var10 = this.field1585.method6429((long) arg0);
            if (var10 != null) {
                if (var10 instanceof class386) {
                    class386 var11 = (class386) var10;
                    if ((var11.field4256 & var7) == var9) {
                        return false;
                    }
                    var11.field4256 &= ~var7;
                    var11.field4256 |= var9;
                    return true;
                }
                var10.method6163();
            }
        }
        this.field1585.method6431(new class386(var9), (long) arg0);
        return true;
    }

    @ObfuscatedName("ej.u(IJ)Z")
    public boolean method2647(int arg0, long arg1) {
        if (this.field1585 == null) {
            this.field1585 = new class396(4);
        } else {
            class387 var4 = this.field1585.method6429((long) arg0);
            if (var4 != null) {
                if (var4 instanceof class385) {
                    class385 var5 = (class385) var4;
                    if (var5.field4255 == arg1) {
                        return false;
                    }
                    var5.field4255 = arg1;
                    return true;
                }
                var4.method6163();
            }
        }
        this.field1585.method6431(new class385(arg1), (long) arg0);
        return true;
    }

    @ObfuscatedName("ej.k(ILjava/lang/String;I)Z")
    public boolean method2664(int arg0, String arg1) {
        if (arg1 == null) {
            arg1 = "";
        } else if (arg1.length() > 80) {
            arg1 = arg1.substring(0, 80);
        }
        if (this.field1585 == null) {
            this.field1585 = new class396(4);
        } else {
            class387 var3 = this.field1585.method6429((long) arg0);
            if (var3 != null) {
                if (var3 instanceof class383) {
                    class383 var4 = (class383) var3;
                    if (var4.field4253 instanceof String) {
                        if (arg1.equals(var4.field4253)) {
                            return false;
                        }
                        var4.method6163();
                        this.field1585.method6431(new class383(arg1), var4.field4257);
                        return true;
                    }
                }
                var3.method6163();
            }
        }
        this.field1585.method6431(new class383(arg1), (long) arg0);
        return true;
    }

    @ObfuscatedName("ej.f(Lpi;I)V")
    public void method2686(class419 arg0) {
        int var2 = arg0.method6781();
        if (var2 < 1 || var2 > 6) {
            throw new RuntimeException("" + var2);
        }
        int var3 = arg0.method6781();
        if ((var3 & 0x1) != 0) {
            this.field1562 = true;
        }
        if ((var3 & 0x2) != 0) {
            this.field1577 = true;
        }
        if (!this.field1562) {
            this.field1573 = null;
            this.field1572 = null;
        }
        if (!this.field1577) {
            this.field1561 = null;
            this.field1582 = null;
        }
        this.field1564 = arg0.method6675();
        this.field1566 = arg0.method6675();
        if (var2 <= 3 && this.field1566 != 0) {
            this.field1566 += 16912800;
        }
        this.field1584 = arg0.method6672();
        this.field1581 = arg0.method6781();
        this.field1565 = arg0.method6707();
        if (var2 >= 4) {
            arg0.method6675();
        }
        this.field1567 = arg0.method6781() == 1;
        this.field1568 = arg0.method6846();
        this.field1569 = arg0.method6846();
        this.field1570 = arg0.method6846();
        this.field1571 = arg0.method6846();
        if (this.field1584 > 0) {
            if (this.field1562 && (this.field1573 == null || this.field1573.length < this.field1584)) {
                this.field1573 = new long[this.field1584];
            }
            if (this.field1577 && (this.field1561 == null || this.field1561.length < this.field1584)) {
                this.field1561 = new String[this.field1584];
            }
            if (this.field1574 == null || this.field1574.length < this.field1584) {
                this.field1574 = new byte[this.field1584];
            }
            if (this.field1576 == null || this.field1576.length < this.field1584) {
                this.field1576 = new int[this.field1584];
            }
            if (this.field1583 == null || this.field1583.length < this.field1584) {
                this.field1583 = new int[this.field1584];
            }
            if (this.field1578 == null || this.field1578.length < this.field1584) {
                this.field1578 = new boolean[this.field1584];
            }
            for (int var4 = 0; var4 < this.field1584; var4++) {
                if (this.field1562) {
                    this.field1573[var4] = arg0.method6676();
                }
                if (this.field1577) {
                    this.field1561[var4] = arg0.method6679();
                }
                this.field1574[var4] = arg0.method6846();
                if (var2 >= 2) {
                    this.field1576[var4] = arg0.method6675();
                }
                if (var2 >= 5) {
                    this.field1583[var4] = arg0.method6672();
                } else {
                    this.field1583[var4] = 0;
                }
                if (var2 >= 6) {
                    this.field1578[var4] = arg0.method6781() == 1;
                } else {
                    this.field1578[var4] = false;
                }
            }
            this.method2643();
        }
        if (this.field1581 > 0) {
            if (this.field1562 && (this.field1572 == null || this.field1572.length < this.field1581)) {
                this.field1572 = new long[this.field1581];
            }
            if (this.field1577 && (this.field1582 == null || this.field1582.length < this.field1581)) {
                this.field1582 = new String[this.field1581];
            }
            for (int var5 = 0; var5 < this.field1581; var5++) {
                if (this.field1562) {
                    this.field1572[var5] = arg0.method6676();
                }
                if (this.field1577) {
                    this.field1582[var5] = arg0.method6679();
                }
            }
        }
        if (var2 < 3) {
            return;
        }
        int var6 = arg0.method6672();
        if (var6 <= 0) {
            return;
        }
        this.field1585 = new class396(var6 < 16 ? class259.method3053(var6) : 16);
        while (var6-- > 0) {
            int var7 = arg0.method6675();
            int var8 = var7 & 0x3FFFFFFF;
            int var9 = var7 >>> 30;
            if (var9 == 0) {
                int var10 = arg0.method6675();
                this.field1585.method6431(new class386(var10), (long) var8);
            } else if (var9 == 1) {
                long var11 = arg0.method6676();
                this.field1585.method6431(new class385(var11), (long) var8);
            } else if (var9 == 2) {
                String var13 = arg0.method6707();
                this.field1585.method6431(new class383(var13), (long) var8);
            }
        }
    }
}
