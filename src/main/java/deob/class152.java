package deob;

@ObfuscatedName("fi")
public class class152 {

    @ObfuscatedName("fi.al")
    public boolean field1704;

    @ObfuscatedName("fi.ac")
    public boolean field1687;

    @ObfuscatedName("fi.ab")
    public long field1688;

    @ObfuscatedName("fi.an")
    public int field1710 = 0;

    @ObfuscatedName("fi.ao")
    public String field1690 = null;

    @ObfuscatedName("fi.av")
    public int field1691 = 0;

    @ObfuscatedName("fi.aq")
    public boolean field1692;

    @ObfuscatedName("fi.ap")
    public byte field1693;

    @ObfuscatedName("fi.ar")
    public byte field1698;

    @ObfuscatedName("fi.ak")
    public byte field1695;

    @ObfuscatedName("fi.ax")
    public byte field1696;

    @ObfuscatedName("fi.as")
    public int field1697;

    @ObfuscatedName("fi.ay")
    public long[] field1706;

    @ObfuscatedName("fi.am")
    public byte[] field1709;

    @ObfuscatedName("fi.az")
    public int[] field1700;

    @ObfuscatedName("fi.ae")
    public int[] field1701;

    @ObfuscatedName("fi.au")
    public int[] field1702;

    @ObfuscatedName("fi.ag")
    public boolean[] field1703;

    @ObfuscatedName("fi.at")
    public int field1686 = -1;

    @ObfuscatedName("fi.af")
    public int field1705 = -1;

    @ObfuscatedName("fi.ai")
    public int field1685;

    @ObfuscatedName("fi.aw")
    public long[] field1707;

    @ObfuscatedName("fi.aa")
    public String[] field1708;

    @ObfuscatedName("fi.ah")
    public String[] field1689;

    @ObfuscatedName("fi.ad")
    public class454 field1711;

    public class152(class478 arg0) {
        this.method2995(arg0);
    }

    @ObfuscatedName("fi.aj(IB)V")
    public void method3025(int arg0) {
        if (this.field1704) {
            if (this.field1706 == null) {
                this.field1706 = new long[arg0];
            } else {
                System.arraycopy(this.field1706, 0, this.field1706 = new long[arg0], 0, this.field1697);
            }
        }
        if (this.field1687) {
            if (this.field1708 == null) {
                this.field1708 = new String[arg0];
            } else {
                System.arraycopy(this.field1708, 0, this.field1708 = new String[arg0], 0, this.field1697);
            }
        }
        if (this.field1709 == null) {
            this.field1709 = new byte[arg0];
        } else {
            System.arraycopy(this.field1709, 0, this.field1709 = new byte[arg0], 0, this.field1697);
        }
        if (this.field1701 == null) {
            this.field1701 = new int[arg0];
        } else {
            System.arraycopy(this.field1701, 0, this.field1701 = new int[arg0], 0, this.field1697);
        }
        if (this.field1702 == null) {
            this.field1702 = new int[arg0];
        } else {
            System.arraycopy(this.field1702, 0, this.field1702 = new int[arg0], 0, this.field1697);
        }
        if (this.field1703 == null) {
            this.field1703 = new boolean[arg0];
        } else {
            System.arraycopy(this.field1703, 0, this.field1703 = new boolean[arg0], 0, this.field1697);
        }
    }

    @ObfuscatedName("fi.al(IS)V")
    public void method2977(int arg0) {
        if (this.field1704) {
            if (this.field1707 == null) {
                this.field1707 = new long[arg0];
            } else {
                System.arraycopy(this.field1707, 0, this.field1707 = new long[arg0], 0, this.field1685);
            }
        }
        if (!this.field1687) {
            return;
        }
        if (this.field1689 == null) {
            this.field1689 = new String[arg0];
        } else {
            System.arraycopy(this.field1689, 0, this.field1689 = new String[arg0], 0, this.field1685);
        }
    }

    @ObfuscatedName("fi.ac(Ljava/lang/String;I)I")
    public int method3038(String arg0) {
        if (arg0 == null || arg0.length() == 0) {
            return -1;
        }
        for (int var2 = 0; var2 < this.field1697; var2++) {
            if (this.field1708[var2].equals(arg0)) {
                return var2;
            }
        }
        return -1;
    }

    @ObfuscatedName("fi.ab(IIIB)I")
    public int method2979(int arg0, int arg1, int arg2) {
        int var4 = arg2 == 31 ? -1 : (0x1 << arg2 + 1) - 1;
        return (this.field1701[arg0] & var4) >>> arg1;
    }

    @ObfuscatedName("fi.an(IB)Ljava/lang/Integer;")
    public Integer method3012(int arg0) {
        if (this.field1711 == null) {
            return null;
        } else {
            class444 var2 = this.field1711.method7611((long) arg0);
            return var2 != null && var2 instanceof class443 ? Integer.valueOf(((class443) var2).field4671) : null;
        }
    }

    @ObfuscatedName("fi.ao(B)[I")
    public int[] method3003() {
        if (this.field1700 == null) {
            String[] var1 = new String[this.field1697];
            this.field1700 = new int[this.field1697];
            int var2 = 0;
            while (var2 < this.field1697) {
                var1[var2] = this.field1708[var2];
                if (var1[var2] != null) {
                    var1[var2] = var1[var2].toLowerCase();
                }
                this.field1700[var2] = var2++;
            }
            class475.method309(var1, this.field1700);
        }
        return this.field1700;
    }

    @ObfuscatedName("fi.av(JLjava/lang/String;II)V")
    public void method2982(long arg0, String arg1, int arg2) {
        if (arg1 != null && arg1.length() == 0) {
            arg1 = null;
        }
        if (arg0 > 0L != this.field1704) {
            throw new RuntimeException("");
        } else if (this.field1687 == (arg1 != null)) {
            if (arg0 > 0L && (this.field1706 == null || this.field1697 >= this.field1706.length) || arg1 != null && (this.field1708 == null || this.field1697 >= this.field1708.length)) {
                this.method3025(this.field1697 + 5);
            }
            if (this.field1706 != null) {
                this.field1706[this.field1697] = arg0;
            }
            if (this.field1708 != null) {
                this.field1708[this.field1697] = arg1;
            }
            if (this.field1686 == -1) {
                this.field1686 = this.field1697;
                this.field1709[this.field1697] = 126;
            } else {
                this.field1709[this.field1697] = 0;
            }
            this.field1701[this.field1697] = 0;
            this.field1702[this.field1697] = arg2;
            this.field1703[this.field1697] = false;
            this.field1697++;
            this.field1700 = null;
        } else {
            throw new RuntimeException("");
        }
    }

    @ObfuscatedName("fi.aq(II)V")
    public void method2991(int arg0) {
        if (arg0 < 0 || arg0 >= this.field1697) {
            throw new RuntimeException("");
        }
        this.field1697--;
        this.field1700 = null;
        if (this.field1697 == 0) {
            this.field1706 = null;
            this.field1708 = null;
            this.field1709 = null;
            this.field1701 = null;
            this.field1702 = null;
            this.field1703 = null;
            this.field1686 = -1;
            this.field1705 = -1;
            return;
        }
        System.arraycopy(this.field1709, arg0 + 1, this.field1709, arg0, this.field1697 - arg0);
        System.arraycopy(this.field1701, arg0 + 1, this.field1701, arg0, this.field1697 - arg0);
        System.arraycopy(this.field1702, arg0 + 1, this.field1702, arg0, this.field1697 - arg0);
        System.arraycopy(this.field1703, arg0 + 1, this.field1703, arg0, this.field1697 - arg0);
        if (this.field1706 != null) {
            System.arraycopy(this.field1706, arg0 + 1, this.field1706, arg0, this.field1697 - arg0);
        }
        if (this.field1708 != null) {
            System.arraycopy(this.field1708, arg0 + 1, this.field1708, arg0, this.field1697 - arg0);
        }
        this.method3004();
    }

    @ObfuscatedName("fi.ap(B)V")
    public void method3004() {
        if (this.field1697 == 0) {
            this.field1686 = -1;
            this.field1705 = -1;
            return;
        }
        this.field1686 = -1;
        this.field1705 = -1;
        int var1 = 0;
        byte var2 = this.field1709[0];
        for (int var3 = 1; var3 < this.field1697; var3++) {
            if (this.field1709[var3] > var2) {
                if (var2 == 125) {
                    this.field1705 = var1;
                }
                var1 = var3;
                var2 = this.field1709[var3];
            } else if (this.field1705 == -1 && this.field1709[var3] == 125) {
                this.field1705 = var3;
            }
        }
        this.field1686 = var1;
        if (this.field1686 != -1) {
            this.field1709[this.field1686] = 126;
        }
    }

    @ObfuscatedName("fi.ar(JLjava/lang/String;I)V")
    public void method2985(long arg0, String arg1) {
        if (arg1 != null && arg1.length() == 0) {
            arg1 = null;
        }
        if (this.field1704 != arg0 > 0L) {
            throw new RuntimeException("");
        } else if (this.field1687 == (arg1 != null)) {
            if (arg0 > 0L && (this.field1707 == null || this.field1685 >= this.field1707.length) || arg1 != null && (this.field1689 == null || this.field1685 >= this.field1689.length)) {
                this.method2977(this.field1685 + 5);
            }
            if (this.field1707 != null) {
                this.field1707[this.field1685] = arg0;
            }
            if (this.field1689 != null) {
                this.field1689[this.field1685] = arg1;
            }
            this.field1685++;
        } else {
            throw new RuntimeException("");
        }
    }

    @ObfuscatedName("fi.ak(IS)V")
    public void method2986(int arg0) {
        this.field1685--;
        if (this.field1685 == 0) {
            this.field1707 = null;
            this.field1689 = null;
            return;
        }
        if (this.field1707 != null) {
            System.arraycopy(this.field1707, arg0 + 1, this.field1707, arg0, this.field1685 - arg0);
        }
        if (this.field1689 != null) {
            System.arraycopy(this.field1689, arg0 + 1, this.field1689, arg0, this.field1685 - arg0);
        }
    }

    @ObfuscatedName("fi.ax(IBI)I")
    public int method2984(int arg0, byte arg1) {
        if (arg1 == 126 || arg1 == 127) {
            return -1;
        } else if (this.field1686 == arg0 && (this.field1705 == -1 || this.field1709[this.field1705] < 125)) {
            return -1;
        } else if (this.field1709[arg0] == arg1) {
            return -1;
        } else {
            this.field1709[arg0] = arg1;
            this.method3004();
            return arg0;
        }
    }

    @ObfuscatedName("fi.as(II)Z")
    public boolean method2975(int arg0) {
        if (this.field1686 == arg0 || this.field1709[arg0] == 126) {
            return false;
        }
        this.field1709[this.field1686] = 125;
        this.field1705 = this.field1686;
        this.field1709[arg0] = 126;
        this.field1686 = arg0;
        return true;
    }

    @ObfuscatedName("fi.ay(IZI)I")
    public int method2989(int arg0, boolean arg1) {
        if (this.field1703[arg0] == arg1) {
            return -1;
        } else {
            this.field1703[arg0] = arg1;
            return arg0;
        }
    }

    @ObfuscatedName("fi.am(IIIIS)I")
    public int method2983(int arg0, int arg1, int arg2, int arg3) {
        int var5 = (0x1 << arg2) - 1;
        int var6 = arg3 == 31 ? -1 : (0x1 << arg3 + 1) - 1;
        int var7 = var6 ^ var5;
        int var8 = arg1 << arg2;
        int var9 = var8 & var7;
        int var10 = this.field1701[arg0];
        if ((var10 & var7) == var9) {
            return -1;
        } else {
            int var11 = var10 & ~var7;
            this.field1701[arg0] = var11 | var9;
            return arg0;
        }
    }

    @ObfuscatedName("fi.az(III)Z")
    public boolean method3026(int arg0, int arg1) {
        if (this.field1711 == null) {
            this.field1711 = new class454(4);
        } else {
            class444 var3 = this.field1711.method7611((long) arg0);
            if (var3 != null) {
                if (var3 instanceof class443) {
                    class443 var4 = (class443) var3;
                    if (var4.field4671 == arg1) {
                        return false;
                    }
                    var4.field4671 = arg1;
                    return true;
                }
                var3.method7335();
            }
        }
        this.field1711.method7595(new class443(arg1), (long) arg0);
        return true;
    }

    @ObfuscatedName("fi.ae(IIIIS)Z")
    public boolean method2992(int arg0, int arg1, int arg2, int arg3) {
        int var5 = (0x1 << arg2) - 1;
        int var6 = arg3 == 31 ? -1 : (0x1 << arg3 + 1) - 1;
        int var7 = var6 ^ var5;
        int var8 = arg1 << arg2;
        int var9 = var8 & var7;
        if (this.field1711 == null) {
            this.field1711 = new class454(4);
        } else {
            class444 var10 = this.field1711.method7611((long) arg0);
            if (var10 != null) {
                if (var10 instanceof class443) {
                    class443 var11 = (class443) var10;
                    if ((var11.field4671 & var7) == var9) {
                        return false;
                    }
                    var11.field4671 &= ~var7;
                    var11.field4671 |= var9;
                    return true;
                }
                var10.method7335();
            }
        }
        this.field1711.method7595(new class443(var9), (long) arg0);
        return true;
    }

    @ObfuscatedName("fi.au(IJ)Z")
    public boolean method2993(int arg0, long arg1) {
        if (this.field1711 == null) {
            this.field1711 = new class454(4);
        } else {
            class444 var4 = this.field1711.method7611((long) arg0);
            if (var4 != null) {
                if (var4 instanceof class442) {
                    class442 var5 = (class442) var4;
                    if (var5.field4670 == arg1) {
                        return false;
                    }
                    var5.field4670 = arg1;
                    return true;
                }
                var4.method7335();
            }
        }
        this.field1711.method7595(new class442(arg1), (long) arg0);
        return true;
    }

    @ObfuscatedName("fi.ag(ILjava/lang/String;I)Z")
    public boolean method2994(int arg0, String arg1) {
        if (arg1 == null) {
            arg1 = "";
        } else if (arg1.length() > 80) {
            arg1 = arg1.substring(0, 80);
        }
        if (this.field1711 == null) {
            this.field1711 = new class454(4);
        } else {
            class444 var3 = this.field1711.method7611((long) arg0);
            if (var3 != null) {
                if (var3 instanceof class440) {
                    class440 var4 = (class440) var3;
                    if (var4.field4668 instanceof String) {
                        if (arg1.equals(var4.field4668)) {
                            return false;
                        }
                        var4.method7335();
                        this.field1711.method7595(new class440(arg1), var4.field4673);
                        return true;
                    }
                }
                var3.method7335();
            }
        }
        this.field1711.method7595(new class440(arg1), (long) arg0);
        return true;
    }

    @ObfuscatedName("fi.at(Lsy;I)V")
    public void method2995(class478 arg0) {
        int var2 = arg0.method7909();
        if (var2 < 1 || var2 > 6) {
            throw new RuntimeException("" + var2);
        }
        int var3 = arg0.method7909();
        if ((var3 & 0x1) != 0) {
            this.field1704 = true;
        }
        if ((var3 & 0x2) != 0) {
            this.field1687 = true;
        }
        if (!this.field1704) {
            this.field1706 = null;
            this.field1707 = null;
        }
        if (!this.field1687) {
            this.field1708 = null;
            this.field1689 = null;
        }
        this.field1710 = arg0.method7908();
        this.field1691 = arg0.method7908();
        if (var2 <= 3 && this.field1691 != 0) {
            this.field1691 += 16912800;
        }
        this.field1697 = arg0.method7905();
        this.field1685 = arg0.method7909();
        this.field1690 = arg0.method7950();
        if (var2 >= 4) {
            arg0.method7908();
        }
        this.field1692 = arg0.method7909() == 1;
        this.field1693 = arg0.method8163();
        this.field1698 = arg0.method8163();
        this.field1695 = arg0.method8163();
        this.field1696 = arg0.method8163();
        if (this.field1697 > 0) {
            if (this.field1704 && (this.field1706 == null || this.field1706.length < this.field1697)) {
                this.field1706 = new long[this.field1697];
            }
            if (this.field1687 && (this.field1708 == null || this.field1708.length < this.field1697)) {
                this.field1708 = new String[this.field1697];
            }
            if (this.field1709 == null || this.field1709.length < this.field1697) {
                this.field1709 = new byte[this.field1697];
            }
            if (this.field1701 == null || this.field1701.length < this.field1697) {
                this.field1701 = new int[this.field1697];
            }
            if (this.field1702 == null || this.field1702.length < this.field1697) {
                this.field1702 = new int[this.field1697];
            }
            if (this.field1703 == null || this.field1703.length < this.field1697) {
                this.field1703 = new boolean[this.field1697];
            }
            for (int var4 = 0; var4 < this.field1697; var4++) {
                if (this.field1704) {
                    this.field1706[var4] = arg0.method7949();
                }
                if (this.field1687) {
                    this.field1708[var4] = arg0.method8048();
                }
                this.field1709[var4] = arg0.method8163();
                if (var2 >= 2) {
                    this.field1701[var4] = arg0.method7908();
                }
                if (var2 >= 5) {
                    this.field1702[var4] = arg0.method7905();
                } else {
                    this.field1702[var4] = 0;
                }
                if (var2 >= 6) {
                    this.field1703[var4] = arg0.method7909() == 1;
                } else {
                    this.field1703[var4] = false;
                }
            }
            this.method3004();
        }
        if (this.field1685 > 0) {
            if (this.field1704 && (this.field1707 == null || this.field1707.length < this.field1685)) {
                this.field1707 = new long[this.field1685];
            }
            if (this.field1687 && (this.field1689 == null || this.field1689.length < this.field1685)) {
                this.field1689 = new String[this.field1685];
            }
            for (int var5 = 0; var5 < this.field1685; var5++) {
                if (this.field1704) {
                    this.field1707[var5] = arg0.method7949();
                }
                if (this.field1687) {
                    this.field1689[var5] = arg0.method8048();
                }
            }
        }
        if (var2 < 3) {
            return;
        }
        int var6 = arg0.method7905();
        if (var6 <= 0) {
            return;
        }
        this.field1711 = new class454(var6 < 16 ? class292.method4415(var6) : 16);
        while (var6-- > 0) {
            int var7 = arg0.method7908();
            int var8 = var7 & 0x3FFFFFFF;
            int var9 = var7 >>> 30;
            if (var9 == 0) {
                int var10 = arg0.method7908();
                this.field1711.method7595(new class443(var10), (long) var8);
            } else if (var9 == 1) {
                long var11 = arg0.method7949();
                this.field1711.method7595(new class442(var11), (long) var8);
            } else if (var9 == 2) {
                String var13 = arg0.method7950();
                this.field1711.method7595(new class440(var13), (long) var8);
            }
        }
    }
}
