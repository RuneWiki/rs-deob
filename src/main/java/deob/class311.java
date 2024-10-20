package deob;

import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;

@ObfuscatedName("lo")
public class class311 {

    @ObfuscatedName("lo.au")
    public class376 field3496 = new class376();

    @ObfuscatedName("lo.ag")
    public class376 field3483 = new class376();

    @ObfuscatedName("lo.at")
    public boolean field3476 = false;

    @ObfuscatedName("lo.af")
    public boolean field3485 = true;

    @ObfuscatedName("lo.ai")
    public int field3486 = 0;

    @ObfuscatedName("lo.aw")
    public boolean field3487 = false;

    @ObfuscatedName("lo.aa")
    public int field3488 = 0;

    @ObfuscatedName("lo.ah")
    public int field3489 = 0;

    @ObfuscatedName("lo.ad")
    public int field3490 = 0;

    @ObfuscatedName("lo.bm")
    public int field3491 = 0;

    @ObfuscatedName("lo.bv")
    public int field3480 = 0;

    @ObfuscatedName("lo.bo")
    public int field3494 = 0;

    @ObfuscatedName("lo.bs")
    public int field3478 = 0;

    @ObfuscatedName("lo.bg")
    public int field3495 = Integer.MAX_VALUE;

    @ObfuscatedName("lo.bh")
    public int field3501 = Integer.MAX_VALUE;

    @ObfuscatedName("lo.bl")
    public int field3497 = 0;

    @ObfuscatedName("lo.bk")
    public int field3484 = 0;

    @ObfuscatedName("lo.br")
    public int field3499 = 0;

    @ObfuscatedName("lo.ba")
    public int field3500 = 0;

    @ObfuscatedName("lo.bz")
    public class305 field3498;

    @ObfuscatedName("lo.bq")
    public class305 field3502;

    public class311() {
        this.field3496.method6534(1);
        this.field3483.method6534(1);
    }

    @ObfuscatedName("lo.aj(I)V")
    public void method5264() {
        this.field3486 = (this.field3486 + 1) % 60;
        if (this.field3478 > 0) {
            this.field3478--;
        }
    }

    @ObfuscatedName("lo.al(ZB)Z")
    public boolean method5339(boolean arg0) {
        boolean var2 = arg0 && this.field3485;
        boolean var3 = this.field3476 != var2;
        this.field3476 = var2;
        if (!this.field3476) {
            this.method5289(this.field3491, this.field3491);
        }
        return var3;
    }

    @ObfuscatedName("lo.ac(ZI)V")
    public void method5287(boolean arg0) {
        this.field3485 = arg0;
        this.field3476 = arg0 && this.field3476;
    }

    @ObfuscatedName("lo.ab(Ljava/lang/String;I)Z")
    public boolean method5414(String arg0) {
        String var2 = this.field3496.method6406();
        if (var2.equals(arg0)) {
            return false;
        }
        String var3 = this.method5292(arg0);
        this.field3496.method6418(var3);
        this.method5274(this.field3499, this.field3500);
        this.method5337();
        this.method5342();
        return true;
    }

    @ObfuscatedName("lo.an(Ljava/lang/String;B)Z")
    public boolean method5268(String arg0) {
        this.field3483.method6418(arg0);
        return true;
    }

    @ObfuscatedName("lo.ao(Lou;I)Z")
    public boolean method5453(class379 arg0) {
        boolean var2 = !this.field3487;
        this.field3496.method6410(arg0);
        this.field3483.method6410(arg0);
        this.field3487 = true;
        boolean var3 = var2 | this.method5274(this.field3499, this.field3500);
        boolean var4 = var3 | this.method5289(this.field3480, this.field3491);
        if (this.method5337()) {
            this.method5342();
            var4 = true;
        }
        return var4;
    }

    @ObfuscatedName("lo.av(III)Z")
    public boolean method5270(int arg0, int arg1) {
        boolean var3 = this.field3497 != arg0 || this.field3484 != arg1;
        this.field3497 = arg0;
        this.field3484 = arg1;
        return var3 | this.method5274(this.field3499, this.field3500);
    }

    @ObfuscatedName("lo.aq(IB)Z")
    public boolean method5263(int arg0) {
        if (arg0 < 0) {
            arg0 = Integer.MAX_VALUE;
        }
        boolean var2 = arg0 == this.field3496.method6429();
        this.field3496.method6407(arg0);
        this.field3483.method6407(arg0);
        if (this.method5337()) {
            this.method5342();
            var2 = true;
        }
        return var2;
    }

    @ObfuscatedName("lo.ap(II)Z")
    public boolean method5272(int arg0) {
        this.field3496.method6408(arg0);
        if (this.method5337()) {
            this.method5342();
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("lo.ar(IB)Z")
    public boolean method5273(int arg0) {
        this.field3501 = arg0;
        if (this.method5337()) {
            this.method5342();
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("lo.ak(III)Z")
    public boolean method5274(int arg0, int arg1) {
        if (!this.method5321()) {
            this.field3499 = arg0;
            this.field3500 = arg1;
            return false;
        }
        int var3 = this.field3499;
        int var4 = this.field3500;
        int var5 = Math.max(0, this.field3496.method6424() - this.field3497 + 2);
        int var6 = Math.max(0, this.field3496.method6425() - this.field3484 + 1);
        this.field3499 = Math.max(0, Math.min(var5, arg0));
        this.field3500 = Math.max(0, Math.min(var6, arg1));
        return this.field3499 != var3 || this.field3500 != var4;
    }

    @ObfuscatedName("lo.ax(III)Z")
    public boolean method5383(int arg0, int arg1) {
        boolean var3 = true;
        if (arg0 < 0 || arg0 > 2) {
            System.out.println("InputField.setAlignment: Invalid horizontal alignment. Given value: '" + arg0 + "'.");
            var3 = false;
        }
        if (arg1 < 0 || arg1 > 2) {
            System.out.println("InputField.setAlignment: Invalid vertical alignment. Given value: '" + arg1 + "'.");
            var3 = false;
        }
        return var3 ? this.field3496.method6412(arg0, arg1) : false;
    }

    @ObfuscatedName("lo.as(II)V")
    public void method5276(int arg0) {
        this.field3496.method6413(arg0);
    }

    @ObfuscatedName("lo.ay(IS)V")
    public void method5310(int arg0) {
        this.field3488 = arg0;
    }

    @ObfuscatedName("lo.am(IB)V")
    public void method5351(int arg0) {
        this.field3496.method6534(arg0);
    }

    @ObfuscatedName("lo.az(IB)V")
    public void method5279(int arg0) {
        this.field3496.method6409(arg0);
    }

    @ObfuscatedName("lo.ae(II)Z")
    public boolean method5366(int arg0) {
        this.field3490 = arg0;
        String var2 = this.field3496.method6406();
        int var3 = var2.length();
        String var4 = this.method5292(var2);
        if (var4.length() == var3) {
            return false;
        }
        this.field3496.method6418(var4);
        this.method5274(this.field3499, this.field3500);
        this.method5337();
        this.method5342();
        return true;
    }

    @ObfuscatedName("lo.au(I)V")
    public void method5281() {
        this.field3487 = false;
    }

    @ObfuscatedName("lo.ag(II)Z")
    public boolean method5282(int arg0) {
        if (this.method5265(arg0)) {
            this.method5511();
            class377 var2 = this.field3496.method6477((char) arg0, this.field3491, this.field3495);
            this.method5289(var2.method6544(), var2.method6544());
            this.method5337();
            this.method5342();
        }
        return true;
    }

    @ObfuscatedName("lo.at(I)V")
    public void method5283() {
        if (!this.method5511() && this.field3491 > 0) {
            int var1 = this.field3496.method6420(this.field3491 - 1);
            this.method5342();
            this.method5289(var1, var1);
        }
    }

    @ObfuscatedName("lo.af(I)V")
    public void method5284() {
        if (!this.method5511() && this.field3491 < this.field3496.method6405()) {
            int var1 = this.field3496.method6420(this.field3491);
            this.method5342();
            this.method5289(var1, var1);
        }
    }

    @ObfuscatedName("lo.ai(I)V")
    public void method5285() {
        if (!this.method5511() && this.field3491 > 0) {
            class452 var1 = this.method5335(this.field3491 - 1);
            int var2 = this.field3496.method6438((Integer) var1.field4799, this.field3491);
            this.method5342();
            this.method5289(var2, var2);
        }
    }

    @ObfuscatedName("lo.aw(I)V")
    public void method5317() {
        if (!this.method5511() && this.field3491 < this.field3496.method6405()) {
            class452 var1 = this.method5335(this.field3491);
            int var2 = this.field3496.method6438(this.field3491, (Integer) var1.field4800);
            this.method5342();
            this.method5289(var2, var2);
        }
    }

    @ObfuscatedName("lo.aa(B)Z")
    public boolean method5511() {
        if (this.method5332()) {
            int var1 = this.field3496.method6438(this.field3480, this.field3491);
            this.method5342();
            this.method5289(var1, var1);
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("lo.ah(B)V")
    public void method5288() {
        this.method5289(0, this.field3496.method6405());
    }

    @ObfuscatedName("lo.ad(III)Z")
    public boolean method5289(int arg0, int arg1) {
        if (!this.method5321()) {
            this.field3480 = arg0;
            this.field3491 = arg1;
            return false;
        }
        if (arg0 > this.field3496.method6405()) {
            arg0 = this.field3496.method6405();
        }
        if (arg1 > this.field3496.method6405()) {
            arg1 = this.field3496.method6405();
        }
        boolean var3 = this.field3480 != arg0 || this.field3491 != arg1;
        this.field3480 = arg0;
        if (this.field3491 != arg1) {
            this.field3491 = arg1;
            this.field3486 = 0;
            this.method5450();
        }
        if (var3 && this.field3502 != null) {
            this.field3502.method2535();
        }
        return var3;
    }

    @ObfuscatedName("lo.bm(ZB)V")
    public void method5426(boolean arg0) {
        class452 var2 = this.method5336(this.field3491);
        this.method5338((Integer) var2.field4799, arg0);
    }

    @ObfuscatedName("lo.bv(ZB)V")
    public void method5495(boolean arg0) {
        class452 var2 = this.method5336(this.field3491);
        this.method5338((Integer) var2.field4800, arg0);
    }

    @ObfuscatedName("lo.bo(ZI)V")
    public void method5345(boolean arg0) {
        this.method5338(0, arg0);
    }

    @ObfuscatedName("lo.bs(ZB)V")
    public void method5293(boolean arg0) {
        this.method5338(this.field3496.method6405(), arg0);
    }

    @ObfuscatedName("lo.bg(ZI)V")
    public void method5294(boolean arg0) {
        if (this.method5332() && !arg0) {
            this.method5338(Math.min(this.field3480, this.field3491), arg0);
        } else if (this.field3491 > 0) {
            this.method5338(this.field3491 - 1, arg0);
        }
    }

    @ObfuscatedName("lo.bh(ZI)V")
    public void method5295(boolean arg0) {
        if (this.method5332() && !arg0) {
            this.method5338(Math.max(this.field3480, this.field3491), arg0);
        } else if (this.field3491 < this.field3496.method6405()) {
            this.method5338(this.field3491 + 1, arg0);
        }
    }

    @ObfuscatedName("lo.bl(ZI)V")
    public void method5296(boolean arg0) {
        if (this.field3491 > 0) {
            class452 var2 = this.method5335(this.field3491 - 1);
            this.method5338((Integer) var2.field4799, arg0);
        }
    }

    @ObfuscatedName("lo.bk(ZI)V")
    public void method5396(boolean arg0) {
        if (this.field3491 < this.field3496.method6405()) {
            class452 var2 = this.method5335(this.field3491 + 1);
            this.method5338((Integer) var2.field4800, arg0);
        }
    }

    @ObfuscatedName("lo.br(ZI)V")
    public void method5271(boolean arg0) {
        if (this.field3491 > 0) {
            this.method5338(this.field3496.method6423(this.field3491, -1), arg0);
        }
    }

    @ObfuscatedName("lo.ba(ZI)V")
    public void method5402(boolean arg0) {
        if (this.field3491 < this.field3496.method6405()) {
            this.method5338(this.field3496.method6423(this.field3491, 1), arg0);
        }
    }

    @ObfuscatedName("lo.bz(ZI)V")
    public void method5325(boolean arg0) {
        if (this.field3491 > 0) {
            int var2 = this.method5530();
            this.method5338(this.field3496.method6423(this.field3491, -var2), arg0);
        }
    }

    @ObfuscatedName("lo.bq(ZI)V")
    public void method5362(boolean arg0) {
        if (this.field3491 < this.field3496.method6405()) {
            int var2 = this.method5530();
            this.method5338(this.field3496.method6423(this.field3491, var2), arg0);
        }
    }

    @ObfuscatedName("lo.bc(ZI)V")
    public void method5460(boolean arg0) {
        class380 var2 = this.field3496.method6414(0, this.field3491);
        class452 var3 = var2.method6667();
        this.method5338(this.field3496.method6422((Integer) var3.field4799, this.field3500), arg0);
    }

    @ObfuscatedName("lo.bt(ZI)V")
    public void method5303(boolean arg0) {
        class380 var2 = this.field3496.method6414(0, this.field3491);
        class452 var3 = var2.method6667();
        this.method5338(this.field3496.method6422((Integer) var3.field4799, this.field3500 + this.field3484), arg0);
    }

    @ObfuscatedName("lo.be(IIZZI)V")
    public void method5304(int arg0, int arg1, boolean arg2, boolean arg3) {
        boolean var5 = false;
        int var6;
        if (this.field3487) {
            int var7 = this.field3499 + arg0;
            int var8 = this.field3500 + arg1;
            class452 var9 = this.method5344();
            var6 = this.field3496.method6422(var7 - (Integer) var9.field4799, var8 - (Integer) var9.field4800);
        } else {
            var6 = 0;
        }
        if (arg2 && arg3) {
            this.field3489 = 1;
            class452 var10 = this.method5335(var6);
            class452 var11 = this.method5335(this.field3494);
            this.method5397(var11, var10);
        } else if (arg2) {
            this.field3489 = 1;
            class452 var12 = this.method5335(var6);
            this.method5289((Integer) var12.field4799, (Integer) var12.field4800);
            this.field3494 = (Integer) var12.field4799;
        } else if (arg3) {
            this.method5289(this.field3494, var6);
        } else {
            if (this.field3478 <= 0 || this.field3494 != var6) {
                this.field3489 = 0;
                this.method5289(var6, var6);
                this.field3494 = var6;
            } else if (this.field3491 == this.field3480) {
                this.field3489 = 1;
                class452 var13 = this.method5335(var6);
                this.method5289((Integer) var13.field4799, (Integer) var13.field4800);
            } else {
                this.field3489 = 2;
                class452 var14 = this.method5336(var6);
                this.method5289((Integer) var14.field4799, (Integer) var14.field4800);
            }
            this.field3478 = 25;
        }
    }

    @ObfuscatedName("lo.bu(IIB)V")
    public void method5305(int arg0, int arg1) {
        if (!this.field3487 || !this.method5403()) {
            return;
        }
        int var3 = this.field3499 + arg0;
        int var4 = this.field3500 + arg1;
        class452 var5 = this.method5344();
        int var6 = this.field3496.method6422(var3 - (Integer) var5.field4799, var4 - (Integer) var5.field4800);
        switch(this.field3489) {
            case 0:
                this.method5289(this.field3480, var6);
                break;
            case 1:
                class452 var9 = this.method5335(this.field3494);
                class452 var10 = this.method5335(var6);
                this.method5397(var9, var10);
                break;
            case 2:
                class452 var7 = this.method5336(this.field3494);
                class452 var8 = this.method5336(var6);
                this.method5397(var7, var8);
        }
    }

    @ObfuscatedName("lo.bd(Ljava/awt/datatransfer/Clipboard;B)V")
    public void method5306(Clipboard arg0) {
        class380 var2 = this.field3496.method6414(this.field3480, this.field3491);
        if (!var2.method6645()) {
            String var3 = var2.method6643();
            if (!var3.isEmpty()) {
                arg0.setContents(new StringSelection(var3), (ClipboardOwner) null);
            }
        }
    }

    @ObfuscatedName("lo.by(Ljava/awt/datatransfer/Clipboard;B)V")
    public void method5504(Clipboard arg0) {
        if (this.method5332()) {
            this.method5306(arg0);
            this.method5511();
        }
    }

    @ObfuscatedName("lo.bp(Ljava/awt/datatransfer/Clipboard;B)V")
    public void method5308(Clipboard arg0) {
        Transferable var2 = arg0.getContents((Object) null);
        if (var2 == null || !var2.isDataFlavorSupported(DataFlavor.stringFlavor)) {
            return;
        }
        try {
            String var3 = this.method5292((String) var2.getTransferData(DataFlavor.stringFlavor));
            this.method5511();
            class377 var4 = this.field3496.method6430(var3, this.field3491, this.field3495);
            this.method5289(var4.method6544(), var4.method6544());
            this.method5337();
            this.method5342();
        } catch (Exception var6) {
            System.out.println("Error pasting clipboard to InputField.");
        }
    }

    @ObfuscatedName("lo.bb(B)V")
    public void method5309() {
        this.field3500 = Math.max(0, this.field3500 - this.field3496.method6426());
    }

    @ObfuscatedName("lo.bx(I)V")
    public void method5307() {
        int var1 = Math.max(0, this.field3496.method6425() - this.field3484);
        this.field3500 = Math.min(var1, this.field3500 + this.field3496.method6426());
    }

    @ObfuscatedName("lo.bn(Lll;B)V")
    public void method5299(class305 arg0) {
        this.field3498 = arg0;
    }

    @ObfuscatedName("lo.bj(Lll;B)V")
    public void method5312(class305 arg0) {
        this.field3502 = arg0;
    }

    @ObfuscatedName("lo.bf(I)Low;")
    public class376 method5313() {
        return this.field3496;
    }

    @ObfuscatedName("lo.bw(I)Low;")
    public class376 method5314() {
        return this.field3483;
    }

    @ObfuscatedName("lo.bi(I)Lon;")
    public class380 method5315() {
        return this.field3496.method6414(this.field3480, this.field3491);
    }

    @ObfuscatedName("lo.cl(I)Z")
    public boolean method5403() {
        return this.field3476;
    }

    @ObfuscatedName("lo.ca(B)Z")
    public boolean method5381() {
        return this.field3485;
    }

    @ObfuscatedName("lo.cb(B)Z")
    public boolean method5318() {
        return this.method5403() && this.field3486 % 60 < 30;
    }

    @ObfuscatedName("lo.co(I)I")
    public int method5319() {
        return this.field3491;
    }

    @ObfuscatedName("lo.cj(I)I")
    public int method5477() {
        return this.field3480;
    }

    @ObfuscatedName("lo.cn(I)Z")
    public boolean method5321() {
        return this.field3487;
    }

    @ObfuscatedName("lo.ce(I)I")
    public int method5322() {
        return this.field3499;
    }

    @ObfuscatedName("lo.cd(I)I")
    public int method5406() {
        return this.field3500;
    }

    @ObfuscatedName("lo.cc(I)I")
    public int method5324() {
        return this.field3496.method6429();
    }

    @ObfuscatedName("lo.ct(I)I")
    public int method5266() {
        return this.field3496.method6464();
    }

    @ObfuscatedName("lo.cy(I)I")
    public int method5328() {
        return this.field3501;
    }

    @ObfuscatedName("lo.ck(B)I")
    public int method5327() {
        return this.field3488;
    }

    @ObfuscatedName("lo.cz(I)I")
    public int method5361() {
        return this.field3496.method6431();
    }

    @ObfuscatedName("lo.cg(S)I")
    public int method5329() {
        return this.field3490;
    }

    @ObfuscatedName("lo.ch(I)I")
    public int method5391() {
        return this.field3496.method6513();
    }

    @ObfuscatedName("lo.cs(I)Z")
    public boolean method5341() {
        return this.method5266() > 1;
    }

    @ObfuscatedName("lo.cq(I)Z")
    public boolean method5332() {
        return this.field3491 != this.field3480;
    }

    @ObfuscatedName("lo.cx(Ljava/lang/String;I)Ljava/lang/String;")
    public String method5292(String arg0) {
        StringBuilder var2 = new StringBuilder(arg0.length());
        for (int var3 = 0; var3 < arg0.length(); var3++) {
            char var4 = arg0.charAt(var3);
            if (this.method5265(var4)) {
                var2.append(var4);
            }
        }
        return var2.toString();
    }

    @ObfuscatedName("lo.cu(Lrv;Lrv;I)V")
    public void method5397(class452 arg0, class452 arg1) {
        if ((Integer) arg1.field4799 < (Integer) arg0.field4799) {
            this.method5289((Integer) arg0.field4800, (Integer) arg1.field4799);
        } else {
            this.method5289((Integer) arg0.field4799, (Integer) arg1.field4800);
        }
    }

    @ObfuscatedName("lo.cm(IB)Lrv;")
    public class452 method5335(int arg0) {
        int var2 = this.field3496.method6405();
        int var3 = 0;
        int var4 = var2;
        for (int var5 = arg0; var5 > 0; var5--) {
            if (this.method5440(this.field3496.method6525(var5 - 1).field4381)) {
                var3 = var5;
                break;
            }
        }
        for (int var6 = arg0; var6 < var2; var6++) {
            if (this.method5440(this.field3496.method6525(var6).field4381)) {
                var4 = var6;
                break;
            }
        }
        return new class452(var3, var4);
    }

    @ObfuscatedName("lo.cw(IB)Lrv;")
    public class452 method5336(int arg0) {
        int var2 = this.field3496.method6405();
        int var3 = 0;
        int var4 = var2;
        for (int var5 = arg0; var5 > 0; var5--) {
            if (this.field3496.method6525(var5 - 1).field4381 == '\n') {
                var3 = var5;
                break;
            }
        }
        for (int var6 = arg0; var6 < var2; var6++) {
            if (this.field3496.method6525(var6).field4381 == '\n') {
                var4 = var6;
                break;
            }
        }
        return new class452(var3, var4);
    }

    @ObfuscatedName("lo.cp(B)Z")
    public boolean method5337() {
        if (!this.method5321()) {
            return false;
        }
        boolean var1 = false;
        if (this.field3496.method6405() > this.field3501) {
            this.field3496.method6438(this.field3501, this.field3496.method6405());
            var1 = true;
        }
        int var2 = this.method5266();
        if (this.field3496.method6427() > var2) {
            int var3 = this.field3496.method6423(0, var2) - 1;
            this.field3496.method6438(var3, this.field3496.method6405());
            var1 = true;
        }
        if (var1) {
            int var4 = this.field3491;
            int var5 = this.field3480;
            int var6 = this.field3496.method6405();
            if (this.field3491 > var6) {
                var4 = var6;
            }
            if (this.field3480 > var6) {
                var5 = var6;
            }
            this.method5289(var5, var4);
        }
        return var1;
    }

    @ObfuscatedName("lo.ci(IZI)V")
    public void method5338(int arg0, boolean arg1) {
        if (arg1) {
            this.method5289(this.field3480, arg0);
        } else {
            this.method5289(arg0, arg0);
        }
    }

    @ObfuscatedName("lo.cf(S)I")
    public int method5530() {
        return this.field3484 / this.field3496.method6426();
    }

    @ObfuscatedName("lo.cv(I)V")
    public void method5450() {
        class380 var1 = this.field3496.method6414(0, this.field3491);
        class452 var2 = var1.method6667();
        int var3 = this.field3496.method6426();
        int var4 = (Integer) var2.field4799 - 10;
        int var5 = var4 + 20;
        int var6 = (Integer) var2.field4800 - 3;
        int var7 = var6 + 6 + var3;
        int var8 = this.field3499;
        int var9 = this.field3497 + var8;
        int var10 = this.field3500;
        int var11 = this.field3484 + var10;
        int var12 = this.field3499;
        int var13 = this.field3500;
        if (var4 < var8) {
            var12 = var4;
        } else if (var5 > var9) {
            var12 = var5 - this.field3497;
        }
        if (var6 < var10) {
            var13 = var6;
        } else if (var7 > var11) {
            var13 = var7 - this.field3484;
        }
        this.method5274(var12, var13);
    }

    @ObfuscatedName("lo.cr(IB)Z")
    public boolean method5440(int arg0) {
        return arg0 == 32 || arg0 == 10 || arg0 == 9;
    }

    @ObfuscatedName("lo.du(I)V")
    public void method5342() {
        if (this.field3498 != null) {
            this.field3498.method2535();
        }
    }

    @ObfuscatedName("lo.dg(II)Z")
    public boolean method5265(int arg0) {
        switch(this.field3490) {
            case 1:
                return class368.method5261((char) arg0);
            case 2:
                return class368.method5791((char) arg0);
            case 3:
                return class368.method421((char) arg0);
            case 4:
                char var2 = (char) arg0;
                if (class368.method421(var2)) {
                    return true;
                } else if (var2 == 'k' || var2 == 'K' || var2 == 'm' || var2 == 'M' || var2 == 'b' || var2 == 'B') {
                    return true;
                } else {
                    return false;
                }
            default:
                return true;
        }
    }

    @ObfuscatedName("lo.dc(B)Lrv;")
    public class452 method5344() {
        int var1 = this.field3496.method6476(this.field3497);
        int var2 = this.field3496.method6440(this.field3484);
        return new class452(var1, var2);
    }
}
