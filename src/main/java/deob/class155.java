package deob;

@ObfuscatedName("fn")
public class class155 {

    @ObfuscatedName("fn.ap")
    public boolean field1693;

    @ObfuscatedName("fn.af")
    public boolean field1721;

    @ObfuscatedName("fn.aj")
    public long field1695;

    @ObfuscatedName("fn.aq")
    public int field1717 = 0;

    @ObfuscatedName("fn.ar")
    public String field1696 = null;

    @ObfuscatedName("fn.ag")
    public int field1698 = 0;

    @ObfuscatedName("fn.ao")
    public boolean field1720;

    @ObfuscatedName("fn.ae")
    public byte field1700;

    @ObfuscatedName("fn.aa")
    public byte field1708;

    @ObfuscatedName("fn.au")
    public byte field1697;

    @ObfuscatedName("fn.an")
    public byte field1703;

    @ObfuscatedName("fn.ad")
    public int field1704;

    @ObfuscatedName("fn.ax")
    public long[] field1705;

    @ObfuscatedName("fn.aw")
    public byte[] field1706;

    @ObfuscatedName("fn.az")
    public int[] field1707;

    @ObfuscatedName("fn.av")
    public int[] field1699;

    @ObfuscatedName("fn.ak")
    public int[] field1702;

    @ObfuscatedName("fn.ay")
    public boolean[] field1701;

    @ObfuscatedName("fn.as")
    public int field1711 = -1;

    @ObfuscatedName("fn.ab")
    public int field1712 = -1;

    @ObfuscatedName("fn.ah")
    public int field1713;

    @ObfuscatedName("fn.ai")
    public long[] field1714;

    @ObfuscatedName("fn.ac")
    public String[] field1715;

    @ObfuscatedName("fn.al")
    public String[] field1716;

    @ObfuscatedName("fn.at")
    public class504 field1692;

    public class155(class531 arg0) {
        this.method3122(arg0);
    }

    @ObfuscatedName("fn.am(II)V")
    public void method3159(int arg0) {
        if (this.field1693) {
            if (this.field1705 == null) {
                this.field1705 = new long[arg0];
            } else {
                System.arraycopy(this.field1705, 0, this.field1705 = new long[arg0], 0, this.field1704);
            }
        }
        if (this.field1721) {
            if (this.field1715 == null) {
                this.field1715 = new String[arg0];
            } else {
                System.arraycopy(this.field1715, 0, this.field1715 = new String[arg0], 0, this.field1704);
            }
        }
        if (this.field1706 == null) {
            this.field1706 = new byte[arg0];
        } else {
            System.arraycopy(this.field1706, 0, this.field1706 = new byte[arg0], 0, this.field1704);
        }
        if (this.field1699 == null) {
            this.field1699 = new int[arg0];
        } else {
            System.arraycopy(this.field1699, 0, this.field1699 = new int[arg0], 0, this.field1704);
        }
        if (this.field1702 == null) {
            this.field1702 = new int[arg0];
        } else {
            System.arraycopy(this.field1702, 0, this.field1702 = new int[arg0], 0, this.field1704);
        }
        if (this.field1701 == null) {
            this.field1701 = new boolean[arg0];
        } else {
            System.arraycopy(this.field1701, 0, this.field1701 = new boolean[arg0], 0, this.field1704);
        }
    }

    @ObfuscatedName("fn.ap(II)V")
    public void method3132(int arg0) {
        if (this.field1693) {
            if (this.field1714 == null) {
                this.field1714 = new long[arg0];
            } else {
                System.arraycopy(this.field1714, 0, this.field1714 = new long[arg0], 0, this.field1713);
            }
        }
        if (!this.field1721) {
            return;
        }
        if (this.field1716 == null) {
            this.field1716 = new String[arg0];
        } else {
            System.arraycopy(this.field1716, 0, this.field1716 = new String[arg0], 0, this.field1713);
        }
    }

    @ObfuscatedName("fn.af(Ljava/lang/String;B)I")
    public int method3163(String arg0) {
        if (arg0 == null || arg0.length() == 0) {
            return -1;
        }
        for (int var2 = 0; var2 < this.field1704; var2++) {
            if (this.field1715[var2].equals(arg0)) {
                return var2;
            }
        }
        return -1;
    }

    @ObfuscatedName("fn.aj(IIII)I")
    public int method3174(int arg0, int arg1, int arg2) {
        int var4 = arg2 == 31 ? -1 : (0x1 << arg2 + 1) - 1;
        return (this.field1699[arg0] & var4) >>> arg1;
    }

    @ObfuscatedName("fn.aq(II)Ljava/lang/Integer;")
    public Integer method3116(int arg0) {
        if (this.field1692 == null) {
            return null;
        } else {
            class489 var2 = this.field1692.method8286((long) arg0);
            return var2 != null && var2 instanceof class488 ? Integer.valueOf(((class488) var2).field4887) : null;
        }
    }

    @ObfuscatedName("fn.ar(I)[I")
    public int[] method3117() {
        if (this.field1707 == null) {
            String[] var1 = new String[this.field1704];
            this.field1707 = new int[this.field1704];
            int var2 = 0;
            while (var2 < this.field1704) {
                var1[var2] = this.field1715[var2];
                if (var1[var2] != null) {
                    var1[var2] = var1[var2].toLowerCase();
                }
                this.field1707[var2] = var2++;
            }
            int[] var3 = this.field1707;
            class526.method2325(var1, var3, 0, var1.length - 1);
        }
        return this.field1707;
    }

    @ObfuscatedName("fn.ag(JLjava/lang/String;II)V")
    public void method3118(long arg0, String arg1, int arg2) {
        if (arg1 != null && arg1.length() == 0) {
            arg1 = null;
        }
        if (arg0 > 0L != this.field1693) {
            throw new RuntimeException("");
        } else if (this.field1721 == (arg1 != null)) {
            if (arg0 > 0L && (this.field1705 == null || this.field1704 >= this.field1705.length) || arg1 != null && (this.field1715 == null || this.field1704 >= this.field1715.length)) {
                this.method3159(this.field1704 + 5);
            }
            if (this.field1705 != null) {
                this.field1705[this.field1704] = arg0;
            }
            if (this.field1715 != null) {
                this.field1715[this.field1704] = arg1;
            }
            if (this.field1711 == -1) {
                this.field1711 = this.field1704;
                this.field1706[this.field1704] = 126;
            } else {
                this.field1706[this.field1704] = 0;
            }
            this.field1699[this.field1704] = 0;
            this.field1702[this.field1704] = arg2;
            this.field1701[this.field1704] = false;
            this.field1704++;
            this.field1707 = null;
        } else {
            throw new RuntimeException("");
        }
    }

    @ObfuscatedName("fn.ao(II)V")
    public void method3184(int arg0) {
        if (arg0 < 0 || arg0 >= this.field1704) {
            throw new RuntimeException("");
        }
        this.field1704--;
        this.field1707 = null;
        if (this.field1704 == 0) {
            this.field1705 = null;
            this.field1715 = null;
            this.field1706 = null;
            this.field1699 = null;
            this.field1702 = null;
            this.field1701 = null;
            this.field1711 = -1;
            this.field1712 = -1;
            return;
        }
        System.arraycopy(this.field1706, arg0 + 1, this.field1706, arg0, this.field1704 - arg0);
        System.arraycopy(this.field1699, arg0 + 1, this.field1699, arg0, this.field1704 - arg0);
        System.arraycopy(this.field1702, arg0 + 1, this.field1702, arg0, this.field1704 - arg0);
        System.arraycopy(this.field1701, arg0 + 1, this.field1701, arg0, this.field1704 - arg0);
        if (this.field1705 != null) {
            System.arraycopy(this.field1705, arg0 + 1, this.field1705, arg0, this.field1704 - arg0);
        }
        if (this.field1715 != null) {
            System.arraycopy(this.field1715, arg0 + 1, this.field1715, arg0, this.field1704 - arg0);
        }
        this.method3113();
    }

    @ObfuscatedName("fn.ae(B)V")
    public void method3113() {
        if (this.field1704 == 0) {
            this.field1711 = -1;
            this.field1712 = -1;
            return;
        }
        this.field1711 = -1;
        this.field1712 = -1;
        int var1 = 0;
        byte var2 = this.field1706[0];
        for (int var3 = 1; var3 < this.field1704; var3++) {
            if (this.field1706[var3] > var2) {
                if (var2 == 125) {
                    this.field1712 = var1;
                }
                var1 = var3;
                var2 = this.field1706[var3];
            } else if (this.field1712 == -1 && this.field1706[var3] == 125) {
                this.field1712 = var3;
            }
        }
        this.field1711 = var1;
        if (this.field1711 != -1) {
            this.field1706[this.field1711] = 126;
        }
    }

    @ObfuscatedName("fn.aa(JLjava/lang/String;I)V")
    public void method3121(long arg0, String arg1) {
        if (arg1 != null && arg1.length() == 0) {
            arg1 = null;
        }
        if (this.field1693 != arg0 > 0L) {
            throw new RuntimeException("");
        } else if (arg1 != null == this.field1721) {
            if (arg0 > 0L && (this.field1714 == null || this.field1713 >= this.field1714.length) || arg1 != null && (this.field1716 == null || this.field1713 >= this.field1716.length)) {
                this.method3132(this.field1713 + 5);
            }
            if (this.field1714 != null) {
                this.field1714[this.field1713] = arg0;
            }
            if (this.field1716 != null) {
                this.field1716[this.field1713] = arg1;
            }
            this.field1713++;
        } else {
            throw new RuntimeException("");
        }
    }

    @ObfuscatedName("fn.au(II)V")
    public void method3149(int arg0) {
        this.field1713--;
        if (this.field1713 == 0) {
            this.field1714 = null;
            this.field1716 = null;
            return;
        }
        if (this.field1714 != null) {
            System.arraycopy(this.field1714, arg0 + 1, this.field1714, arg0, this.field1713 - arg0);
        }
        if (this.field1716 != null) {
            System.arraycopy(this.field1716, arg0 + 1, this.field1716, arg0, this.field1713 - arg0);
        }
    }

    @ObfuscatedName("fn.an(IBB)I")
    public int method3123(int arg0, byte arg1) {
        if (arg1 == 126 || arg1 == 127) {
            return -1;
        } else if (this.field1711 == arg0 && (this.field1712 == -1 || this.field1706[this.field1712] < 125)) {
            return -1;
        } else if (this.field1706[arg0] == arg1) {
            return -1;
        } else {
            this.field1706[arg0] = arg1;
            this.method3113();
            return arg0;
        }
    }

    @ObfuscatedName("fn.ad(II)Z")
    public boolean method3182(int arg0) {
        if (this.field1711 == arg0 || this.field1706[arg0] == 126) {
            return false;
        }
        this.field1706[this.field1711] = 125;
        this.field1712 = this.field1711;
        this.field1706[arg0] = 126;
        this.field1711 = arg0;
        return true;
    }

    @ObfuscatedName("fn.ax(IZB)I")
    public int method3125(int arg0, boolean arg1) {
        if (this.field1701[arg0] == arg1) {
            return -1;
        } else {
            this.field1701[arg0] = arg1;
            return arg0;
        }
    }

    @ObfuscatedName("fn.aw(IIIIB)I")
    public int method3164(int arg0, int arg1, int arg2, int arg3) {
        int var5 = (0x1 << arg2) - 1;
        int var6 = arg3 == 31 ? -1 : (0x1 << arg3 + 1) - 1;
        int var7 = var6 ^ var5;
        int var8 = arg1 << arg2;
        int var9 = var8 & var7;
        int var10 = this.field1699[arg0];
        if ((var10 & var7) == var9) {
            return -1;
        } else {
            int var11 = var10 & ~var7;
            this.field1699[arg0] = var11 | var9;
            return arg0;
        }
    }

    @ObfuscatedName("fn.az(III)Z")
    public boolean method3126(int arg0, int arg1) {
        if (this.field1692 == null) {
            this.field1692 = new class504(4);
        } else {
            class489 var3 = this.field1692.method8286((long) arg0);
            if (var3 != null) {
                if (var3 instanceof class488) {
                    class488 var4 = (class488) var3;
                    if (var4.field4887 == arg1) {
                        return false;
                    }
                    var4.field4887 = arg1;
                    return true;
                }
                var3.method7988();
            }
        }
        this.field1692.method8292(new class488(arg1), (long) arg0);
        return true;
    }

    @ObfuscatedName("fn.av(IIIIB)Z")
    public boolean method3127(int arg0, int arg1, int arg2, int arg3) {
        int var5 = (0x1 << arg2) - 1;
        int var6 = arg3 == 31 ? -1 : (0x1 << arg3 + 1) - 1;
        int var7 = var6 ^ var5;
        int var8 = arg1 << arg2;
        int var9 = var8 & var7;
        if (this.field1692 == null) {
            this.field1692 = new class504(4);
        } else {
            class489 var10 = this.field1692.method8286((long) arg0);
            if (var10 != null) {
                if (var10 instanceof class488) {
                    class488 var11 = (class488) var10;
                    if ((var11.field4887 & var7) == var9) {
                        return false;
                    }
                    var11.field4887 &= ~var7;
                    var11.field4887 |= var9;
                    return true;
                }
                var10.method7988();
            }
        }
        this.field1692.method8292(new class488(var9), (long) arg0);
        return true;
    }

    @ObfuscatedName("fn.ak(IJ)Z")
    public boolean method3128(int arg0, long arg1) {
        if (this.field1692 == null) {
            this.field1692 = new class504(4);
        } else {
            class489 var4 = this.field1692.method8286((long) arg0);
            if (var4 != null) {
                if (var4 instanceof class487) {
                    class487 var5 = (class487) var4;
                    if (var5.field4886 == arg1) {
                        return false;
                    }
                    var5.field4886 = arg1;
                    return true;
                }
                var4.method7988();
            }
        }
        this.field1692.method8292(new class487(arg1), (long) arg0);
        return true;
    }

    @ObfuscatedName("fn.ay(ILjava/lang/String;I)Z")
    public boolean method3129(int arg0, String arg1) {
        if (arg1 == null) {
            arg1 = "";
        } else if (arg1.length() > 80) {
            arg1 = arg1.substring(0, 80);
        }
        if (this.field1692 == null) {
            this.field1692 = new class504(4);
        } else {
            class489 var3 = this.field1692.method8286((long) arg0);
            if (var3 != null) {
                if (var3 instanceof class486) {
                    class486 var4 = (class486) var3;
                    if (var4.field4885 instanceof String) {
                        if (arg1.equals(var4.field4885)) {
                            return false;
                        }
                        var4.method7988();
                        this.field1692.method8292(new class486(arg1), var4.field4889);
                        return true;
                    }
                }
                var3.method7988();
            }
        }
        this.field1692.method8292(new class486(arg1), (long) arg0);
        return true;
    }

    @ObfuscatedName("fn.as(Luk;B)V")
    public void method3122(class531 arg0) {
        int var2 = arg0.method8561();
        if (var2 < 1 || var2 > 6) {
            throw new RuntimeException("" + var2);
        }
        int var3 = arg0.method8561();
        if ((var3 & 0x1) != 0) {
            this.field1693 = true;
        }
        if ((var3 & 0x2) != 0) {
            this.field1721 = true;
        }
        if (!this.field1693) {
            this.field1705 = null;
            this.field1714 = null;
        }
        if (!this.field1721) {
            this.field1715 = null;
            this.field1716 = null;
        }
        this.field1717 = arg0.method8566();
        this.field1698 = arg0.method8566();
        if (var2 <= 3 && this.field1698 != 0) {
            this.field1698 += 16912800;
        }
        this.field1704 = arg0.method8775();
        this.field1713 = arg0.method8561();
        this.field1696 = arg0.method8641();
        if (var2 >= 4) {
            arg0.method8566();
        }
        this.field1720 = arg0.method8561() == 1;
        this.field1700 = arg0.method8562();
        this.field1708 = arg0.method8562();
        this.field1697 = arg0.method8562();
        this.field1703 = arg0.method8562();
        if (this.field1704 > 0) {
            if (this.field1693 && (this.field1705 == null || this.field1705.length < this.field1704)) {
                this.field1705 = new long[this.field1704];
            }
            if (this.field1721 && (this.field1715 == null || this.field1715.length < this.field1704)) {
                this.field1715 = new String[this.field1704];
            }
            if (this.field1706 == null || this.field1706.length < this.field1704) {
                this.field1706 = new byte[this.field1704];
            }
            if (this.field1699 == null || this.field1699.length < this.field1704) {
                this.field1699 = new int[this.field1704];
            }
            if (this.field1702 == null || this.field1702.length < this.field1704) {
                this.field1702 = new int[this.field1704];
            }
            if (this.field1701 == null || this.field1701.length < this.field1704) {
                this.field1701 = new boolean[this.field1704];
            }
            for (int var4 = 0; var4 < this.field1704; var4++) {
                if (this.field1693) {
                    this.field1705[var4] = arg0.method8567();
                }
                if (this.field1721) {
                    this.field1715[var4] = arg0.method8602();
                }
                this.field1706[var4] = arg0.method8562();
                if (var2 >= 2) {
                    this.field1699[var4] = arg0.method8566();
                }
                if (var2 >= 5) {
                    this.field1702[var4] = arg0.method8775();
                } else {
                    this.field1702[var4] = 0;
                }
                if (var2 >= 6) {
                    this.field1701[var4] = arg0.method8561() == 1;
                } else {
                    this.field1701[var4] = false;
                }
            }
            this.method3113();
        }
        if (this.field1713 > 0) {
            if (this.field1693 && (this.field1714 == null || this.field1714.length < this.field1713)) {
                this.field1714 = new long[this.field1713];
            }
            if (this.field1721 && (this.field1716 == null || this.field1716.length < this.field1713)) {
                this.field1716 = new String[this.field1713];
            }
            for (int var5 = 0; var5 < this.field1713; var5++) {
                if (this.field1693) {
                    this.field1714[var5] = arg0.method8567();
                }
                if (this.field1721) {
                    this.field1716[var5] = arg0.method8602();
                }
            }
        }
        if (var2 < 3) {
            return;
        }
        int var6 = arg0.method8775();
        if (var6 <= 0) {
            return;
        }
        this.field1692 = new class504(var6 < 16 ? class318.method2259(var6) : 16);
        while (var6-- > 0) {
            int var7 = arg0.method8566();
            int var8 = var7 & 0x3FFFFFFF;
            int var9 = var7 >>> 30;
            if (var9 == 0) {
                int var10 = arg0.method8566();
                this.field1692.method8292(new class488(var10), (long) var8);
            } else if (var9 == 1) {
                long var11 = arg0.method8567();
                this.field1692.method8292(new class487(var11), (long) var8);
            } else if (var9 == 2) {
                String var13 = arg0.method8641();
                this.field1692.method8292(new class486(var13), (long) var8);
            }
        }
    }
}
