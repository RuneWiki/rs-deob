package deob;

@ObfuscatedName("fs")
public class class154 {

    @ObfuscatedName("fs.an")
    public boolean field1691;

    @ObfuscatedName("fs.av")
    public boolean field1701;

    @ObfuscatedName("fs.as")
    public long field1690;

    @ObfuscatedName("fs.ax")
    public int field1700 = 0;

    @ObfuscatedName("fs.ap")
    public String field1692 = null;

    @ObfuscatedName("fs.ab")
    public int field1694 = 0;

    @ObfuscatedName("fs.ak")
    public boolean field1709;

    @ObfuscatedName("fs.ae")
    public byte field1695;

    @ObfuscatedName("fs.af")
    public byte field1696;

    @ObfuscatedName("fs.ao")
    public byte field1710;

    @ObfuscatedName("fs.aa")
    public byte field1698;

    @ObfuscatedName("fs.aj")
    public int field1699;

    @ObfuscatedName("fs.ad")
    public long[] field1688;

    @ObfuscatedName("fs.ac")
    public byte[] field1693;

    @ObfuscatedName("fs.ag")
    public int[] field1702;

    @ObfuscatedName("fs.ar")
    public int[] field1703;

    @ObfuscatedName("fs.ah")
    public int[] field1704;

    @ObfuscatedName("fs.az")
    public boolean[] field1705;

    @ObfuscatedName("fs.au")
    public int field1706 = -1;

    @ObfuscatedName("fs.ai")
    public int field1707 = -1;

    @ObfuscatedName("fs.aq")
    public int field1697;

    @ObfuscatedName("fs.aw")
    public long[] field1711;

    @ObfuscatedName("fs.ay")
    public String[] field1687;

    @ObfuscatedName("fs.al")
    public String[] field1689;

    @ObfuscatedName("fs.am")
    public class476 field1712;

    public class154(class501 arg0) {
        this.method3027(arg0);
    }

    @ObfuscatedName("fs.at(II)V")
    public void method2974(int arg0) {
        if (this.field1691) {
            if (this.field1688 == null) {
                this.field1688 = new long[arg0];
            } else {
                System.arraycopy(this.field1688, 0, this.field1688 = new long[arg0], 0, this.field1699);
            }
        }
        if (this.field1701) {
            if (this.field1687 == null) {
                this.field1687 = new String[arg0];
            } else {
                System.arraycopy(this.field1687, 0, this.field1687 = new String[arg0], 0, this.field1699);
            }
        }
        if (this.field1693 == null) {
            this.field1693 = new byte[arg0];
        } else {
            System.arraycopy(this.field1693, 0, this.field1693 = new byte[arg0], 0, this.field1699);
        }
        if (this.field1703 == null) {
            this.field1703 = new int[arg0];
        } else {
            System.arraycopy(this.field1703, 0, this.field1703 = new int[arg0], 0, this.field1699);
        }
        if (this.field1704 == null) {
            this.field1704 = new int[arg0];
        } else {
            System.arraycopy(this.field1704, 0, this.field1704 = new int[arg0], 0, this.field1699);
        }
        if (this.field1705 == null) {
            this.field1705 = new boolean[arg0];
        } else {
            System.arraycopy(this.field1705, 0, this.field1705 = new boolean[arg0], 0, this.field1699);
        }
    }

    @ObfuscatedName("fs.an(II)V")
    public void method3041(int arg0) {
        if (this.field1691) {
            if (this.field1711 == null) {
                this.field1711 = new long[arg0];
            } else {
                System.arraycopy(this.field1711, 0, this.field1711 = new long[arg0], 0, this.field1697);
            }
        }
        if (!this.field1701) {
            return;
        }
        if (this.field1689 == null) {
            this.field1689 = new String[arg0];
        } else {
            System.arraycopy(this.field1689, 0, this.field1689 = new String[arg0], 0, this.field1697);
        }
    }

    @ObfuscatedName("fs.av(Ljava/lang/String;I)I")
    public int method2973(String arg0) {
        if (arg0 == null || arg0.length() == 0) {
            return -1;
        }
        for (int var2 = 0; var2 < this.field1699; var2++) {
            if (this.field1687[var2].equals(arg0)) {
                return var2;
            }
        }
        return -1;
    }

    @ObfuscatedName("fs.as(IIIB)I")
    public int method3039(int arg0, int arg1, int arg2) {
        int var4 = arg2 == 31 ? -1 : (0x1 << arg2 + 1) - 1;
        return (this.field1703[arg0] & var4) >>> arg1;
    }

    @ObfuscatedName("fs.ax(II)Ljava/lang/Integer;")
    public Integer method3002(int arg0) {
        if (this.field1712 == null) {
            return null;
        } else {
            class461 var2 = this.field1712.method7848((long) arg0);
            return var2 != null && var2 instanceof class460 ? Integer.valueOf(((class460) var2).field4754) : null;
        }
    }

    @ObfuscatedName("fs.ap(I)[I")
    public int[] method2995() {
        if (this.field1702 == null) {
            String[] var1 = new String[this.field1699];
            this.field1702 = new int[this.field1699];
            int var2 = 0;
            while (var2 < this.field1699) {
                var1[var2] = this.field1687[var2];
                if (var1[var2] != null) {
                    var1[var2] = var1[var2].toLowerCase();
                }
                this.field1702[var2] = var2++;
            }
            int[] var3 = this.field1702;
            class498.method3695(var1, var3, 0, var1.length - 1);
        }
        return this.field1702;
    }

    @ObfuscatedName("fs.ab(JLjava/lang/String;II)V")
    public void method2980(long arg0, String arg1, int arg2) {
        if (arg1 != null && arg1.length() == 0) {
            arg1 = null;
        }
        if (arg0 > 0L != this.field1691) {
            throw new RuntimeException("");
        } else if (this.field1701 == (arg1 != null)) {
            if (arg0 > 0L && (this.field1688 == null || this.field1699 >= this.field1688.length) || arg1 != null && (this.field1687 == null || this.field1699 >= this.field1687.length)) {
                this.method2974(this.field1699 + 5);
            }
            if (this.field1688 != null) {
                this.field1688[this.field1699] = arg0;
            }
            if (this.field1687 != null) {
                this.field1687[this.field1699] = arg1;
            }
            if (this.field1706 == -1) {
                this.field1706 = this.field1699;
                this.field1693[this.field1699] = 126;
            } else {
                this.field1693[this.field1699] = 0;
            }
            this.field1703[this.field1699] = 0;
            this.field1704[this.field1699] = arg2;
            this.field1705[this.field1699] = false;
            this.field1699++;
            this.field1702 = null;
        } else {
            throw new RuntimeException("");
        }
    }

    @ObfuscatedName("fs.ak(II)V")
    public void method2981(int arg0) {
        if (arg0 < 0 || arg0 >= this.field1699) {
            throw new RuntimeException("");
        }
        this.field1699--;
        this.field1702 = null;
        if (this.field1699 == 0) {
            this.field1688 = null;
            this.field1687 = null;
            this.field1693 = null;
            this.field1703 = null;
            this.field1704 = null;
            this.field1705 = null;
            this.field1706 = -1;
            this.field1707 = -1;
            return;
        }
        System.arraycopy(this.field1693, arg0 + 1, this.field1693, arg0, this.field1699 - arg0);
        System.arraycopy(this.field1703, arg0 + 1, this.field1703, arg0, this.field1699 - arg0);
        System.arraycopy(this.field1704, arg0 + 1, this.field1704, arg0, this.field1699 - arg0);
        System.arraycopy(this.field1705, arg0 + 1, this.field1705, arg0, this.field1699 - arg0);
        if (this.field1688 != null) {
            System.arraycopy(this.field1688, arg0 + 1, this.field1688, arg0, this.field1699 - arg0);
        }
        if (this.field1687 != null) {
            System.arraycopy(this.field1687, arg0 + 1, this.field1687, arg0, this.field1699 - arg0);
        }
        this.method2982();
    }

    @ObfuscatedName("fs.ae(I)V")
    public void method2982() {
        if (this.field1699 == 0) {
            this.field1706 = -1;
            this.field1707 = -1;
            return;
        }
        this.field1706 = -1;
        this.field1707 = -1;
        int var1 = 0;
        byte var2 = this.field1693[0];
        for (int var3 = 1; var3 < this.field1699; var3++) {
            if (this.field1693[var3] > var2) {
                if (var2 == 125) {
                    this.field1707 = var1;
                }
                var1 = var3;
                var2 = this.field1693[var3];
            } else if (this.field1707 == -1 && this.field1693[var3] == 125) {
                this.field1707 = var3;
            }
        }
        this.field1706 = var1;
        if (this.field1706 != -1) {
            this.field1693[this.field1706] = 126;
        }
    }

    @ObfuscatedName("fs.af(JLjava/lang/String;I)V")
    public void method2983(long arg0, String arg1) {
        if (arg1 != null && arg1.length() == 0) {
            arg1 = null;
        }
        if (arg0 > 0L != this.field1691) {
            throw new RuntimeException("");
        } else if (arg1 != null == this.field1701) {
            if (arg0 > 0L && (this.field1711 == null || this.field1697 >= this.field1711.length) || arg1 != null && (this.field1689 == null || this.field1697 >= this.field1689.length)) {
                this.method3041(this.field1697 + 5);
            }
            if (this.field1711 != null) {
                this.field1711[this.field1697] = arg0;
            }
            if (this.field1689 != null) {
                this.field1689[this.field1697] = arg1;
            }
            this.field1697++;
        } else {
            throw new RuntimeException("");
        }
    }

    @ObfuscatedName("fs.ao(II)V")
    public void method2984(int arg0) {
        this.field1697--;
        if (this.field1697 == 0) {
            this.field1711 = null;
            this.field1689 = null;
            return;
        }
        if (this.field1711 != null) {
            System.arraycopy(this.field1711, arg0 + 1, this.field1711, arg0, this.field1697 - arg0);
        }
        if (this.field1689 != null) {
            System.arraycopy(this.field1689, arg0 + 1, this.field1689, arg0, this.field1697 - arg0);
        }
    }

    @ObfuscatedName("fs.aa(IBI)I")
    public int method2985(int arg0, byte arg1) {
        if (arg1 == 126 || arg1 == 127) {
            return -1;
        } else if (this.field1706 == arg0 && (this.field1707 == -1 || this.field1693[this.field1707] < 125)) {
            return -1;
        } else if (this.field1693[arg0] == arg1) {
            return -1;
        } else {
            this.field1693[arg0] = arg1;
            this.method2982();
            return arg0;
        }
    }

    @ObfuscatedName("fs.aj(II)Z")
    public boolean method2997(int arg0) {
        if (this.field1706 == arg0 || this.field1693[arg0] == 126) {
            return false;
        }
        this.field1693[this.field1706] = 125;
        this.field1707 = this.field1706;
        this.field1693[arg0] = 126;
        this.field1706 = arg0;
        return true;
    }

    @ObfuscatedName("fs.ad(IZI)I")
    public int method2987(int arg0, boolean arg1) {
        if (this.field1705[arg0] == arg1) {
            return -1;
        } else {
            this.field1705[arg0] = arg1;
            return arg0;
        }
    }

    @ObfuscatedName("fs.ac(IIIIB)I")
    public int method2988(int arg0, int arg1, int arg2, int arg3) {
        int var5 = (0x1 << arg2) - 1;
        int var6 = arg3 == 31 ? -1 : (0x1 << arg3 + 1) - 1;
        int var7 = var6 ^ var5;
        int var8 = arg1 << arg2;
        int var9 = var8 & var7;
        int var10 = this.field1703[arg0];
        if ((var10 & var7) == var9) {
            return -1;
        } else {
            int var11 = var10 & ~var7;
            this.field1703[arg0] = var11 | var9;
            return arg0;
        }
    }

    @ObfuscatedName("fs.ag(IIB)Z")
    public boolean method2976(int arg0, int arg1) {
        if (this.field1712 == null) {
            this.field1712 = new class476(4);
        } else {
            class461 var3 = this.field1712.method7848((long) arg0);
            if (var3 != null) {
                if (var3 instanceof class460) {
                    class460 var4 = (class460) var3;
                    if (var4.field4754 == arg1) {
                        return false;
                    }
                    var4.field4754 = arg1;
                    return true;
                }
                var3.method7560();
            }
        }
        this.field1712.method7857(new class460(arg1), (long) arg0);
        return true;
    }

    @ObfuscatedName("fs.ar(IIIIB)Z")
    public boolean method2990(int arg0, int arg1, int arg2, int arg3) {
        int var5 = (0x1 << arg2) - 1;
        int var6 = arg3 == 31 ? -1 : (0x1 << arg3 + 1) - 1;
        int var7 = var6 ^ var5;
        int var8 = arg1 << arg2;
        int var9 = var8 & var7;
        if (this.field1712 == null) {
            this.field1712 = new class476(4);
        } else {
            class461 var10 = this.field1712.method7848((long) arg0);
            if (var10 != null) {
                if (var10 instanceof class460) {
                    class460 var11 = (class460) var10;
                    if ((var11.field4754 & var7) == var9) {
                        return false;
                    }
                    var11.field4754 &= ~var7;
                    var11.field4754 |= var9;
                    return true;
                }
                var10.method7560();
            }
        }
        this.field1712.method7857(new class460(var9), (long) arg0);
        return true;
    }

    @ObfuscatedName("fs.ah(IJ)Z")
    public boolean method3037(int arg0, long arg1) {
        if (this.field1712 == null) {
            this.field1712 = new class476(4);
        } else {
            class461 var4 = this.field1712.method7848((long) arg0);
            if (var4 != null) {
                if (var4 instanceof class459) {
                    class459 var5 = (class459) var4;
                    if (var5.field4753 == arg1) {
                        return false;
                    }
                    var5.field4753 = arg1;
                    return true;
                }
                var4.method7560();
            }
        }
        this.field1712.method7857(new class459(arg1), (long) arg0);
        return true;
    }

    @ObfuscatedName("fs.az(ILjava/lang/String;B)Z")
    public boolean method2992(int arg0, String arg1) {
        if (arg1 == null) {
            arg1 = "";
        } else if (arg1.length() > 80) {
            arg1 = arg1.substring(0, 80);
        }
        if (this.field1712 == null) {
            this.field1712 = new class476(4);
        } else {
            class461 var3 = this.field1712.method7848((long) arg0);
            if (var3 != null) {
                if (var3 instanceof class458) {
                    class458 var4 = (class458) var3;
                    if (var4.field4752 instanceof String) {
                        if (arg1.equals(var4.field4752)) {
                            return false;
                        }
                        var4.method7560();
                        this.field1712.method7857(new class458(arg1), var4.field4757);
                        return true;
                    }
                }
                var3.method7560();
            }
        }
        this.field1712.method7857(new class458(arg1), (long) arg0);
        return true;
    }

    @ObfuscatedName("fs.au(Ltz;I)V")
    public void method3027(class501 arg0) {
        int var2 = arg0.method8129();
        if (var2 < 1 || var2 > 6) {
            throw new RuntimeException("" + var2);
        }
        int var3 = arg0.method8129();
        if ((var3 & 0x1) != 0) {
            this.field1691 = true;
        }
        if ((var3 & 0x2) != 0) {
            this.field1701 = true;
        }
        if (!this.field1691) {
            this.field1688 = null;
            this.field1711 = null;
        }
        if (!this.field1701) {
            this.field1687 = null;
            this.field1689 = null;
        }
        this.field1700 = arg0.method8134();
        this.field1694 = arg0.method8134();
        if (var2 <= 3 && this.field1694 != 0) {
            this.field1694 += 16912800;
        }
        this.field1699 = arg0.method8195();
        this.field1697 = arg0.method8129();
        this.field1692 = arg0.method8253();
        if (var2 >= 4) {
            arg0.method8134();
        }
        this.field1709 = arg0.method8129() == 1;
        this.field1695 = arg0.method8130();
        this.field1696 = arg0.method8130();
        this.field1710 = arg0.method8130();
        this.field1698 = arg0.method8130();
        if (this.field1699 > 0) {
            if (this.field1691 && (this.field1688 == null || this.field1688.length < this.field1699)) {
                this.field1688 = new long[this.field1699];
            }
            if (this.field1701 && (this.field1687 == null || this.field1687.length < this.field1699)) {
                this.field1687 = new String[this.field1699];
            }
            if (this.field1693 == null || this.field1693.length < this.field1699) {
                this.field1693 = new byte[this.field1699];
            }
            if (this.field1703 == null || this.field1703.length < this.field1699) {
                this.field1703 = new int[this.field1699];
            }
            if (this.field1704 == null || this.field1704.length < this.field1699) {
                this.field1704 = new int[this.field1699];
            }
            if (this.field1705 == null || this.field1705.length < this.field1699) {
                this.field1705 = new boolean[this.field1699];
            }
            for (int var4 = 0; var4 < this.field1699; var4++) {
                if (this.field1691) {
                    this.field1688[var4] = arg0.method8135();
                }
                if (this.field1701) {
                    this.field1687[var4] = arg0.method8128();
                }
                this.field1693[var4] = arg0.method8130();
                if (var2 >= 2) {
                    this.field1703[var4] = arg0.method8134();
                }
                if (var2 >= 5) {
                    this.field1704[var4] = arg0.method8195();
                } else {
                    this.field1704[var4] = 0;
                }
                if (var2 >= 6) {
                    this.field1705[var4] = arg0.method8129() == 1;
                } else {
                    this.field1705[var4] = false;
                }
            }
            this.method2982();
        }
        if (this.field1697 > 0) {
            if (this.field1691 && (this.field1711 == null || this.field1711.length < this.field1697)) {
                this.field1711 = new long[this.field1697];
            }
            if (this.field1701 && (this.field1689 == null || this.field1689.length < this.field1697)) {
                this.field1689 = new String[this.field1697];
            }
            for (int var5 = 0; var5 < this.field1697; var5++) {
                if (this.field1691) {
                    this.field1711[var5] = arg0.method8135();
                }
                if (this.field1701) {
                    this.field1689[var5] = arg0.method8128();
                }
            }
        }
        if (var2 < 3) {
            return;
        }
        int var6 = arg0.method8195();
        if (var6 <= 0) {
            return;
        }
        this.field1712 = new class476(var6 < 16 ? class303.method2820(var6) : 16);
        while (var6-- > 0) {
            int var7 = arg0.method8134();
            int var8 = var7 & 0x3FFFFFFF;
            int var9 = var7 >>> 30;
            if (var9 == 0) {
                int var10 = arg0.method8134();
                this.field1712.method7857(new class460(var10), (long) var8);
            } else if (var9 == 1) {
                long var11 = arg0.method8135();
                this.field1712.method7857(new class459(var11), (long) var8);
            } else if (var9 == 2) {
                String var13 = arg0.method8253();
                this.field1712.method7857(new class458(var13), (long) var8);
            }
        }
    }
}
