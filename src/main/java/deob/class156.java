package deob;

@ObfuscatedName("fc")
public class class156 {

    @ObfuscatedName("fc.ah")
    public boolean field1703;

    @ObfuscatedName("fc.ar")
    public boolean field1713;

    @ObfuscatedName("fc.ao")
    public long field1723;

    @ObfuscatedName("fc.ab")
    public int field1702 = 0;

    @ObfuscatedName("fc.au")
    public String field1715 = null;

    @ObfuscatedName("fc.aa")
    public int field1721 = 0;

    @ObfuscatedName("fc.ac")
    public boolean field1705;

    @ObfuscatedName("fc.al")
    public byte field1706;

    @ObfuscatedName("fc.az")
    public byte field1707;

    @ObfuscatedName("fc.ap")
    public byte field1708;

    @ObfuscatedName("fc.av")
    public byte field1709;

    @ObfuscatedName("fc.ax")
    public int field1710;

    @ObfuscatedName("fc.as")
    public long[] field1711;

    @ObfuscatedName("fc.ay")
    public byte[] field1712;

    @ObfuscatedName("fc.ak")
    public int[] field1722;

    @ObfuscatedName("fc.aj")
    public int[] field1714;

    @ObfuscatedName("fc.am")
    public int[] field1724;

    @ObfuscatedName("fc.aq")
    public boolean[] field1699;

    @ObfuscatedName("fc.ai")
    public int field1717 = -1;

    @ObfuscatedName("fc.aw")
    public int field1718 = -1;

    @ObfuscatedName("fc.ae")
    public int field1719;

    @ObfuscatedName("fc.an")
    public long[] field1720;

    @ObfuscatedName("fc.ag")
    public String[] field1698;

    @ObfuscatedName("fc.ad")
    public String[] field1704;

    @ObfuscatedName("fc.af")
    public class500 field1701;

    public class156(class527 arg0) {
        this.method3101(arg0);
    }

    @ObfuscatedName("fc.at(IB)V")
    public void method3144(int arg0) {
        if (this.field1703) {
            if (this.field1711 == null) {
                this.field1711 = new long[arg0];
            } else {
                System.arraycopy(this.field1711, 0, this.field1711 = new long[arg0], 0, this.field1710);
            }
        }
        if (this.field1713) {
            if (this.field1698 == null) {
                this.field1698 = new String[arg0];
            } else {
                System.arraycopy(this.field1698, 0, this.field1698 = new String[arg0], 0, this.field1710);
            }
        }
        if (this.field1712 == null) {
            this.field1712 = new byte[arg0];
        } else {
            System.arraycopy(this.field1712, 0, this.field1712 = new byte[arg0], 0, this.field1710);
        }
        if (this.field1714 == null) {
            this.field1714 = new int[arg0];
        } else {
            System.arraycopy(this.field1714, 0, this.field1714 = new int[arg0], 0, this.field1710);
        }
        if (this.field1724 == null) {
            this.field1724 = new int[arg0];
        } else {
            System.arraycopy(this.field1724, 0, this.field1724 = new int[arg0], 0, this.field1710);
        }
        if (this.field1699 == null) {
            this.field1699 = new boolean[arg0];
        } else {
            System.arraycopy(this.field1699, 0, this.field1699 = new boolean[arg0], 0, this.field1710);
        }
    }

    @ObfuscatedName("fc.ah(II)V")
    public void method3083(int arg0) {
        if (this.field1703) {
            if (this.field1720 == null) {
                this.field1720 = new long[arg0];
            } else {
                System.arraycopy(this.field1720, 0, this.field1720 = new long[arg0], 0, this.field1719);
            }
        }
        if (!this.field1713) {
            return;
        }
        if (this.field1704 == null) {
            this.field1704 = new String[arg0];
        } else {
            System.arraycopy(this.field1704, 0, this.field1704 = new String[arg0], 0, this.field1719);
        }
    }

    @ObfuscatedName("fc.ar(Ljava/lang/String;B)I")
    public int method3084(String arg0) {
        if (arg0 == null || arg0.length() == 0) {
            return -1;
        }
        for (int var2 = 0; var2 < this.field1710; var2++) {
            if (this.field1698[var2].equals(arg0)) {
                return var2;
            }
        }
        return -1;
    }

    @ObfuscatedName("fc.ao(IIII)I")
    public int method3102(int arg0, int arg1, int arg2) {
        int var4 = arg2 == 31 ? -1 : (0x1 << arg2 + 1) - 1;
        return (this.field1714[arg0] & var4) >>> arg1;
    }

    @ObfuscatedName("fc.ab(II)Ljava/lang/Integer;")
    public Integer method3085(int arg0) {
        if (this.field1701 == null) {
            return null;
        } else {
            class485 var2 = this.field1701.method8134((long) arg0);
            return var2 != null && var2 instanceof class484 ? Integer.valueOf(((class484) var2).field4847) : null;
        }
    }

    @ObfuscatedName("fc.au(I)[I")
    public int[] method3087() {
        if (this.field1722 == null) {
            String[] var1 = new String[this.field1710];
            this.field1722 = new int[this.field1710];
            int var2 = 0;
            while (var2 < this.field1710) {
                var1[var2] = this.field1698[var2];
                if (var1[var2] != null) {
                    var1[var2] = var1[var2].toLowerCase();
                }
                this.field1722[var2] = var2++;
            }
            int[] var3 = this.field1722;
            class522.method7807(var1, var3, 0, var1.length - 1);
        }
        return this.field1722;
    }

    @ObfuscatedName("fc.aa(JLjava/lang/String;II)V")
    public void method3088(long arg0, String arg1, int arg2) {
        if (arg1 != null && arg1.length() == 0) {
            arg1 = null;
        }
        if (arg0 > 0L != this.field1703) {
            throw new RuntimeException("");
        } else if (arg1 != null == this.field1713) {
            if (arg0 > 0L && (this.field1711 == null || this.field1710 >= this.field1711.length) || arg1 != null && (this.field1698 == null || this.field1710 >= this.field1698.length)) {
                this.method3144(this.field1710 + 5);
            }
            if (this.field1711 != null) {
                this.field1711[this.field1710] = arg0;
            }
            if (this.field1698 != null) {
                this.field1698[this.field1710] = arg1;
            }
            if (this.field1717 == -1) {
                this.field1717 = this.field1710;
                this.field1712[this.field1710] = 126;
            } else {
                this.field1712[this.field1710] = 0;
            }
            this.field1714[this.field1710] = 0;
            this.field1724[this.field1710] = arg2;
            this.field1699[this.field1710] = false;
            this.field1710++;
            this.field1722 = null;
        } else {
            throw new RuntimeException("");
        }
    }

    @ObfuscatedName("fc.ac(II)V")
    public void method3089(int arg0) {
        if (arg0 < 0 || arg0 >= this.field1710) {
            throw new RuntimeException("");
        }
        this.field1710--;
        this.field1722 = null;
        if (this.field1710 == 0) {
            this.field1711 = null;
            this.field1698 = null;
            this.field1712 = null;
            this.field1714 = null;
            this.field1724 = null;
            this.field1699 = null;
            this.field1717 = -1;
            this.field1718 = -1;
            return;
        }
        System.arraycopy(this.field1712, arg0 + 1, this.field1712, arg0, this.field1710 - arg0);
        System.arraycopy(this.field1714, arg0 + 1, this.field1714, arg0, this.field1710 - arg0);
        System.arraycopy(this.field1724, arg0 + 1, this.field1724, arg0, this.field1710 - arg0);
        System.arraycopy(this.field1699, arg0 + 1, this.field1699, arg0, this.field1710 - arg0);
        if (this.field1711 != null) {
            System.arraycopy(this.field1711, arg0 + 1, this.field1711, arg0, this.field1710 - arg0);
        }
        if (this.field1698 != null) {
            System.arraycopy(this.field1698, arg0 + 1, this.field1698, arg0, this.field1710 - arg0);
        }
        this.method3090();
    }

    @ObfuscatedName("fc.al(B)V")
    public void method3090() {
        if (this.field1710 == 0) {
            this.field1717 = -1;
            this.field1718 = -1;
            return;
        }
        this.field1717 = -1;
        this.field1718 = -1;
        int var1 = 0;
        byte var2 = this.field1712[0];
        for (int var3 = 1; var3 < this.field1710; var3++) {
            if (this.field1712[var3] > var2) {
                if (var2 == 125) {
                    this.field1718 = var1;
                }
                var1 = var3;
                var2 = this.field1712[var3];
            } else if (this.field1718 == -1 && this.field1712[var3] == 125) {
                this.field1718 = var3;
            }
        }
        this.field1717 = var1;
        if (this.field1717 != -1) {
            this.field1712[this.field1717] = 126;
        }
    }

    @ObfuscatedName("fc.az(JLjava/lang/String;I)V")
    public void method3119(long arg0, String arg1) {
        if (arg1 != null && arg1.length() == 0) {
            arg1 = null;
        }
        if (this.field1703 != arg0 > 0L) {
            throw new RuntimeException("");
        } else if (this.field1713 == (arg1 != null)) {
            if (arg0 > 0L && (this.field1720 == null || this.field1719 >= this.field1720.length) || arg1 != null && (this.field1704 == null || this.field1719 >= this.field1704.length)) {
                this.method3083(this.field1719 + 5);
            }
            if (this.field1720 != null) {
                this.field1720[this.field1719] = arg0;
            }
            if (this.field1704 != null) {
                this.field1704[this.field1719] = arg1;
            }
            this.field1719++;
        } else {
            throw new RuntimeException("");
        }
    }

    @ObfuscatedName("fc.ap(II)V")
    public void method3099(int arg0) {
        this.field1719--;
        if (this.field1719 == 0) {
            this.field1720 = null;
            this.field1704 = null;
            return;
        }
        if (this.field1720 != null) {
            System.arraycopy(this.field1720, arg0 + 1, this.field1720, arg0, this.field1719 - arg0);
        }
        if (this.field1704 != null) {
            System.arraycopy(this.field1704, arg0 + 1, this.field1704, arg0, this.field1719 - arg0);
        }
    }

    @ObfuscatedName("fc.av(IBB)I")
    public int method3140(int arg0, byte arg1) {
        if (arg1 == 126 || arg1 == 127) {
            return -1;
        } else if (this.field1717 == arg0 && (this.field1718 == -1 || this.field1712[this.field1718] < 125)) {
            return -1;
        } else if (this.field1712[arg0] == arg1) {
            return -1;
        } else {
            this.field1712[arg0] = arg1;
            this.method3090();
            return arg0;
        }
    }

    @ObfuscatedName("fc.ax(IB)Z")
    public boolean method3127(int arg0) {
        if (this.field1717 == arg0 || this.field1712[arg0] == 126) {
            return false;
        }
        this.field1712[this.field1717] = 125;
        this.field1718 = this.field1717;
        this.field1712[arg0] = 126;
        this.field1717 = arg0;
        return true;
    }

    @ObfuscatedName("fc.as(IZI)I")
    public int method3095(int arg0, boolean arg1) {
        if (this.field1699[arg0] == arg1) {
            return -1;
        } else {
            this.field1699[arg0] = arg1;
            return arg0;
        }
    }

    @ObfuscatedName("fc.ay(IIIII)I")
    public int method3096(int arg0, int arg1, int arg2, int arg3) {
        int var5 = (0x1 << arg2) - 1;
        int var6 = arg3 == 31 ? -1 : (0x1 << arg3 + 1) - 1;
        int var7 = var6 ^ var5;
        int var8 = arg1 << arg2;
        int var9 = var8 & var7;
        int var10 = this.field1714[arg0];
        if ((var10 & var7) == var9) {
            return -1;
        } else {
            int var11 = var10 & ~var7;
            this.field1714[arg0] = var11 | var9;
            return arg0;
        }
    }

    @ObfuscatedName("fc.ak(III)Z")
    public boolean method3097(int arg0, int arg1) {
        if (this.field1701 == null) {
            this.field1701 = new class500(4);
        } else {
            class485 var3 = this.field1701.method8134((long) arg0);
            if (var3 != null) {
                if (var3 instanceof class484) {
                    class484 var4 = (class484) var3;
                    if (var4.field4847 == arg1) {
                        return false;
                    }
                    var4.field4847 = arg1;
                    return true;
                }
                var3.method7828();
            }
        }
        this.field1701.method8135(new class484(arg1), (long) arg0);
        return true;
    }

    @ObfuscatedName("fc.aj(IIIII)Z")
    public boolean method3098(int arg0, int arg1, int arg2, int arg3) {
        int var5 = (0x1 << arg2) - 1;
        int var6 = arg3 == 31 ? -1 : (0x1 << arg3 + 1) - 1;
        int var7 = var6 ^ var5;
        int var8 = arg1 << arg2;
        int var9 = var8 & var7;
        if (this.field1701 == null) {
            this.field1701 = new class500(4);
        } else {
            class485 var10 = this.field1701.method8134((long) arg0);
            if (var10 != null) {
                if (var10 instanceof class484) {
                    class484 var11 = (class484) var10;
                    if ((var11.field4847 & var7) == var9) {
                        return false;
                    }
                    var11.field4847 &= ~var7;
                    var11.field4847 |= var9;
                    return true;
                }
                var10.method7828();
            }
        }
        this.field1701.method8135(new class484(var9), (long) arg0);
        return true;
    }

    @ObfuscatedName("fc.am(IJ)Z")
    public boolean method3091(int arg0, long arg1) {
        if (this.field1701 == null) {
            this.field1701 = new class500(4);
        } else {
            class485 var4 = this.field1701.method8134((long) arg0);
            if (var4 != null) {
                if (var4 instanceof class483) {
                    class483 var5 = (class483) var4;
                    if (var5.field4846 == arg1) {
                        return false;
                    }
                    var5.field4846 = arg1;
                    return true;
                }
                var4.method7828();
            }
        }
        this.field1701.method8135(new class483(arg1), (long) arg0);
        return true;
    }

    @ObfuscatedName("fc.aq(ILjava/lang/String;I)Z")
    public boolean method3126(int arg0, String arg1) {
        if (arg1 == null) {
            arg1 = "";
        } else if (arg1.length() > 80) {
            arg1 = arg1.substring(0, 80);
        }
        if (this.field1701 == null) {
            this.field1701 = new class500(4);
        } else {
            class485 var3 = this.field1701.method8134((long) arg0);
            if (var3 != null) {
                if (var3 instanceof class482) {
                    class482 var4 = (class482) var3;
                    if (var4.field4845 instanceof String) {
                        if (arg1.equals(var4.field4845)) {
                            return false;
                        }
                        var4.method7828();
                        this.field1701.method8135(new class482(arg1), var4.field4849);
                        return true;
                    }
                }
                var3.method7828();
            }
        }
        this.field1701.method8135(new class482(arg1), (long) arg0);
        return true;
    }

    @ObfuscatedName("fc.ai(Luj;B)V")
    public void method3101(class527 arg0) {
        int var2 = arg0.method8410();
        if (var2 < 1 || var2 > 6) {
            throw new RuntimeException("" + var2);
        }
        int var3 = arg0.method8410();
        if ((var3 & 0x1) != 0) {
            this.field1703 = true;
        }
        if ((var3 & 0x2) != 0) {
            this.field1713 = true;
        }
        if (!this.field1703) {
            this.field1711 = null;
            this.field1720 = null;
        }
        if (!this.field1713) {
            this.field1698 = null;
            this.field1704 = null;
        }
        this.field1702 = arg0.method8416();
        this.field1721 = arg0.method8416();
        if (var2 <= 3 && this.field1721 != 0) {
            this.field1721 += 16912800;
        }
        this.field1710 = arg0.method8412();
        this.field1719 = arg0.method8410();
        this.field1715 = arg0.method8535();
        if (var2 >= 4) {
            arg0.method8416();
        }
        this.field1705 = arg0.method8410() == 1;
        this.field1706 = arg0.method8616();
        this.field1707 = arg0.method8616();
        this.field1708 = arg0.method8616();
        this.field1709 = arg0.method8616();
        if (this.field1710 > 0) {
            if (this.field1703 && (this.field1711 == null || this.field1711.length < this.field1710)) {
                this.field1711 = new long[this.field1710];
            }
            if (this.field1713 && (this.field1698 == null || this.field1698.length < this.field1710)) {
                this.field1698 = new String[this.field1710];
            }
            if (this.field1712 == null || this.field1712.length < this.field1710) {
                this.field1712 = new byte[this.field1710];
            }
            if (this.field1714 == null || this.field1714.length < this.field1710) {
                this.field1714 = new int[this.field1710];
            }
            if (this.field1724 == null || this.field1724.length < this.field1710) {
                this.field1724 = new int[this.field1710];
            }
            if (this.field1699 == null || this.field1699.length < this.field1710) {
                this.field1699 = new boolean[this.field1710];
            }
            for (int var4 = 0; var4 < this.field1710; var4++) {
                if (this.field1703) {
                    this.field1711[var4] = arg0.method8417();
                }
                if (this.field1713) {
                    this.field1698[var4] = arg0.method8420();
                }
                this.field1712[var4] = arg0.method8616();
                if (var2 >= 2) {
                    this.field1714[var4] = arg0.method8416();
                }
                if (var2 >= 5) {
                    this.field1724[var4] = arg0.method8412();
                } else {
                    this.field1724[var4] = 0;
                }
                if (var2 >= 6) {
                    this.field1699[var4] = arg0.method8410() == 1;
                } else {
                    this.field1699[var4] = false;
                }
            }
            this.method3090();
        }
        if (this.field1719 > 0) {
            if (this.field1703 && (this.field1720 == null || this.field1720.length < this.field1719)) {
                this.field1720 = new long[this.field1719];
            }
            if (this.field1713 && (this.field1704 == null || this.field1704.length < this.field1719)) {
                this.field1704 = new String[this.field1719];
            }
            for (int var5 = 0; var5 < this.field1719; var5++) {
                if (this.field1703) {
                    this.field1720[var5] = arg0.method8417();
                }
                if (this.field1713) {
                    this.field1704[var5] = arg0.method8420();
                }
            }
        }
        if (var2 < 3) {
            return;
        }
        int var6 = arg0.method8412();
        if (var6 <= 0) {
            return;
        }
        this.field1701 = new class500(var6 < 16 ? class315.method3369(var6) : 16);
        while (var6-- > 0) {
            int var7 = arg0.method8416();
            int var8 = var7 & 0x3FFFFFFF;
            int var9 = var7 >>> 30;
            if (var9 == 0) {
                int var10 = arg0.method8416();
                this.field1701.method8135(new class484(var10), (long) var8);
            } else if (var9 == 1) {
                long var11 = arg0.method8417();
                this.field1701.method8135(new class483(var11), (long) var8);
            } else if (var9 == 2) {
                String var13 = arg0.method8535();
                this.field1701.method8135(new class482(var13), (long) var8);
            }
        }
    }
}
