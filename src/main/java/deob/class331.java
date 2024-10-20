package deob;

import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;

@ObfuscatedName("mo")
public class class331 {

    @ObfuscatedName("mo.ab")
    public class396 field3577 = new class396();

    @ObfuscatedName("mo.ad")
    public class396 field3595 = new class396();

    @ObfuscatedName("mo.ao")
    public boolean field3584 = false;

    @ObfuscatedName("mo.ac")
    public boolean field3585 = true;

    @ObfuscatedName("mo.ak")
    public int field3586 = 0;

    @ObfuscatedName("mo.an")
    public boolean field3599 = false;

    @ObfuscatedName("mo.af")
    public int field3582 = 0;

    @ObfuscatedName("mo.ai")
    public int field3589 = 0;

    @ObfuscatedName("mo.al")
    public int field3588 = 0;

    @ObfuscatedName("mo.bd")
    public int field3591 = 0;

    @ObfuscatedName("mo.bb")
    public int field3592 = 0;

    @ObfuscatedName("mo.bn")
    public int field3593 = 0;

    @ObfuscatedName("mo.ba")
    public int field3594 = 0;

    @ObfuscatedName("mo.bf")
    public int field3575 = Integer.MAX_VALUE;

    @ObfuscatedName("mo.bs")
    public int field3596 = Integer.MAX_VALUE;

    @ObfuscatedName("mo.bp")
    public int field3597 = 0;

    @ObfuscatedName("mo.bv")
    public int field3598 = 0;

    @ObfuscatedName("mo.bq")
    public int field3590 = 0;

    @ObfuscatedName("mo.bo")
    public int field3600 = 0;

    @ObfuscatedName("mo.br")
    public class325 field3601;

    @ObfuscatedName("mo.bw")
    public class325 field3602;

    public class331() {
        this.field3577.method6662(1);
        this.field3595.method6662(1);
    }

    @ObfuscatedName("mo.aw(I)V")
    public void method5560() {
        this.field3586 = (this.field3586 + 1) % 60;
        if (this.field3594 > 0) {
            this.field3594--;
        }
    }

    @ObfuscatedName("mo.ay(ZB)Z")
    public boolean method5558(boolean arg0) {
        boolean var2 = arg0 && this.field3585;
        boolean var3 = this.field3584 != var2;
        this.field3584 = var2;
        if (!this.field3584) {
            this.method5582(this.field3591, this.field3591);
        }
        return var3;
    }

    @ObfuscatedName("mo.ar(ZI)V")
    public void method5559(boolean arg0) {
        this.field3585 = arg0;
        this.field3584 = arg0 && this.field3584;
    }

    @ObfuscatedName("mo.am(Ljava/lang/String;B)Z")
    public boolean method5694(String arg0) {
        String var2 = this.field3577.method6708();
        if (var2.equals(arg0)) {
            return false;
        }
        String var3 = this.method5626(arg0);
        this.field3577.method6669(var3);
        this.method5606(this.field3590, this.field3600);
        this.method5630();
        this.method5635();
        return true;
    }

    @ObfuscatedName("mo.as(Ljava/lang/String;I)Z")
    public boolean method5561(String arg0) {
        this.field3595.method6669(arg0);
        return true;
    }

    @ObfuscatedName("mo.aj(Lpq;I)Z")
    public boolean method5642(class399 arg0) {
        boolean var2 = !this.field3599;
        this.field3577.method6789(arg0);
        this.field3595.method6789(arg0);
        this.field3599 = true;
        boolean var3 = var2 | this.method5606(this.field3590, this.field3600);
        boolean var4 = var3 | this.method5582(this.field3592, this.field3591);
        if (this.method5630()) {
            this.method5635();
            var4 = true;
        }
        return var4;
    }

    @ObfuscatedName("mo.ag(III)Z")
    public boolean method5563(int arg0, int arg1) {
        boolean var3 = this.field3597 != arg0 || this.field3598 != arg1;
        this.field3597 = arg0;
        this.field3598 = arg1;
        return var3 | this.method5606(this.field3590, this.field3600);
    }

    @ObfuscatedName("mo.az(IB)Z")
    public boolean method5729(int arg0) {
        if (arg0 < 0) {
            arg0 = Integer.MAX_VALUE;
        }
        boolean var2 = arg0 == this.field3577.method6680();
        this.field3577.method6724(arg0);
        this.field3595.method6724(arg0);
        if (this.method5630()) {
            this.method5635();
            var2 = true;
        }
        return var2;
    }

    @ObfuscatedName("mo.av(IB)Z")
    public boolean method5565(int arg0) {
        this.field3577.method6659(arg0);
        if (this.method5630()) {
            this.method5635();
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("mo.ap(II)Z")
    public boolean method5566(int arg0) {
        this.field3596 = arg0;
        if (this.method5630()) {
            this.method5635();
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("mo.aq(III)Z")
    public boolean method5606(int arg0, int arg1) {
        if (!this.method5614()) {
            this.field3590 = arg0;
            this.field3600 = arg1;
            return false;
        }
        int var3 = this.field3590;
        int var4 = this.field3600;
        int var5 = Math.max(0, this.field3577.method6675() - this.field3597 + 2);
        int var6 = Math.max(0, this.field3577.method6658() - this.field3598 + 1);
        this.field3590 = Math.max(0, Math.min(var5, arg0));
        this.field3600 = Math.max(0, Math.min(var6, arg1));
        return this.field3590 != var3 || this.field3600 != var4;
    }

    @ObfuscatedName("mo.at(IIS)Z")
    public boolean method5568(int arg0, int arg1) {
        boolean var3 = true;
        if (arg0 < 0 || arg0 > 2) {
            var3 = false;
        }
        if (arg1 < 0 || arg1 > 2) {
            var3 = false;
        }
        return var3 ? this.field3577.method6663(arg0, arg1) : false;
    }

    @ObfuscatedName("mo.ah(II)V")
    public void method5708(int arg0) {
        this.field3577.method6657(arg0);
    }

    @ObfuscatedName("mo.ax(IB)V")
    public void method5748(int arg0) {
        this.field3582 = arg0;
    }

    @ObfuscatedName("mo.aa(II)V")
    public void method5571(int arg0) {
        this.field3577.method6662(arg0);
    }

    @ObfuscatedName("mo.au(II)V")
    public void method5675(int arg0) {
        this.field3577.method6732(arg0);
    }

    @ObfuscatedName("mo.ae(II)Z")
    public boolean method5573(int arg0) {
        this.field3588 = arg0;
        String var2 = this.field3577.method6708();
        int var3 = var2.length();
        String var4 = this.method5626(var2);
        if (var4.length() == var3) {
            return false;
        }
        this.field3577.method6669(var4);
        this.method5606(this.field3590, this.field3600);
        this.method5630();
        this.method5635();
        return true;
    }

    @ObfuscatedName("mo.ab(I)V")
    public void method5574() {
        this.field3599 = false;
    }

    @ObfuscatedName("mo.ad(II)Z")
    public boolean method5820(int arg0) {
        if (this.method5615(arg0)) {
            this.method5580();
            class397 var2 = this.field3577.method6666((char) arg0, this.field3591, this.field3575);
            this.method5582(var2.method6798(), var2.method6798());
            this.method5630();
            this.method5635();
        }
        return true;
    }

    @ObfuscatedName("mo.ao(I)V")
    public void method5633() {
        if (!this.method5580() && this.field3591 > 0) {
            int var1 = this.field3577.method6777(this.field3591 - 1);
            this.method5635();
            this.method5582(var1, var1);
        }
    }

    @ObfuscatedName("mo.ac(I)V")
    public void method5577() {
        if (!this.method5580() && this.field3591 < this.field3577.method6656()) {
            int var1 = this.field3577.method6777(this.field3591);
            this.method5635();
            this.method5582(var1, var1);
        }
    }

    @ObfuscatedName("mo.ak(I)V")
    public void method5578() {
        if (!this.method5580() && this.field3591 > 0) {
            class487 var1 = this.method5575(this.field3591 - 1);
            int var2 = this.field3577.method6672((Integer) var1.field4965, this.field3591);
            this.method5635();
            this.method5582(var2, var2);
        }
    }

    @ObfuscatedName("mo.an(B)V")
    public void method5579() {
        if (!this.method5580() && this.field3591 < this.field3577.method6656()) {
            class487 var1 = this.method5575(this.field3591);
            int var2 = this.field3577.method6672(this.field3591, (Integer) var1.field4963);
            this.method5635();
            this.method5582(var2, var2);
        }
    }

    @ObfuscatedName("mo.af(I)Z")
    public boolean method5580() {
        if (this.method5564()) {
            int var1 = this.field3577.method6672(this.field3592, this.field3591);
            this.method5635();
            this.method5582(var1, var1);
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("mo.ai(I)V")
    public void method5632() {
        this.method5582(0, this.field3577.method6656());
    }

    @ObfuscatedName("mo.al(IIB)Z")
    public boolean method5582(int arg0, int arg1) {
        if (!this.method5614()) {
            this.field3592 = arg0;
            this.field3591 = arg1;
            return false;
        }
        if (arg0 > this.field3577.method6656()) {
            arg0 = this.field3577.method6656();
        }
        if (arg1 > this.field3577.method6656()) {
            arg1 = this.field3577.method6656();
        }
        boolean var3 = this.field3592 != arg0 || this.field3591 != arg1;
        this.field3592 = arg0;
        if (this.field3591 != arg1) {
            this.field3591 = arg1;
            this.field3586 = 0;
            this.method5793();
        }
        if (var3 && this.field3602 != null) {
            this.field3602.method2556();
        }
        return var3;
    }

    @ObfuscatedName("mo.bd(ZB)V")
    public void method5719(boolean arg0) {
        class487 var2 = this.method5572(this.field3591);
        this.method5631((Integer) var2.field4965, arg0);
    }

    @ObfuscatedName("mo.bb(ZI)V")
    public void method5584(boolean arg0) {
        class487 var2 = this.method5572(this.field3591);
        this.method5631((Integer) var2.field4963, arg0);
    }

    @ObfuscatedName("mo.bn(ZB)V")
    public void method5585(boolean arg0) {
        this.method5631(0, arg0);
    }

    @ObfuscatedName("mo.ba(ZB)V")
    public void method5715(boolean arg0) {
        this.method5631(this.field3577.method6656(), arg0);
    }

    @ObfuscatedName("mo.bf(ZI)V")
    public void method5587(boolean arg0) {
        if (this.method5564() && !arg0) {
            this.method5631(Math.min(this.field3592, this.field3591), arg0);
        } else if (this.field3591 > 0) {
            this.method5631(this.field3591 - 1, arg0);
        }
    }

    @ObfuscatedName("mo.bs(ZI)V")
    public void method5588(boolean arg0) {
        if (this.method5564() && !arg0) {
            this.method5631(Math.max(this.field3592, this.field3591), arg0);
        } else if (this.field3591 < this.field3577.method6656()) {
            this.method5631(this.field3591 + 1, arg0);
        }
    }

    @ObfuscatedName("mo.bp(ZI)V")
    public void method5589(boolean arg0) {
        if (this.field3591 > 0) {
            class487 var2 = this.method5575(this.field3591 - 1);
            this.method5631((Integer) var2.field4965, arg0);
        }
    }

    @ObfuscatedName("mo.bv(ZB)V")
    public void method5590(boolean arg0) {
        if (this.field3591 < this.field3577.method6656()) {
            class487 var2 = this.method5575(this.field3591 + 1);
            this.method5631((Integer) var2.field4963, arg0);
        }
    }

    @ObfuscatedName("mo.bq(ZI)V")
    public void method5756(boolean arg0) {
        if (this.field3591 > 0) {
            this.method5631(this.field3577.method6674(this.field3591, -1), arg0);
        }
    }

    @ObfuscatedName("mo.bo(ZI)V")
    public void method5592(boolean arg0) {
        if (this.field3591 < this.field3577.method6656()) {
            this.method5631(this.field3577.method6674(this.field3591, 1), arg0);
        }
    }

    @ObfuscatedName("mo.br(ZB)V")
    public void method5593(boolean arg0) {
        if (this.field3591 > 0) {
            int var2 = this.method5728();
            this.method5631(this.field3577.method6674(this.field3591, -var2), arg0);
        }
    }

    @ObfuscatedName("mo.bw(ZB)V")
    public void method5556(boolean arg0) {
        if (this.field3591 < this.field3577.method6656()) {
            int var2 = this.method5728();
            this.method5631(this.field3577.method6674(this.field3591, var2), arg0);
        }
    }

    @ObfuscatedName("mo.be(ZB)V")
    public void method5751(boolean arg0) {
        class400 var2 = this.field3577.method6762(0, this.field3591);
        class487 var3 = var2.method6920();
        this.method5631(this.field3577.method6673((Integer) var3.field4965, this.field3600), arg0);
    }

    @ObfuscatedName("mo.bc(ZI)V")
    public void method5596(boolean arg0) {
        class400 var2 = this.field3577.method6762(0, this.field3591);
        class487 var3 = var2.method6920();
        this.method5631(this.field3577.method6673((Integer) var3.field4965, this.field3600 + this.field3598), arg0);
    }

    @ObfuscatedName("mo.bi(IIZZI)V")
    public void method5825(int arg0, int arg1, boolean arg2, boolean arg3) {
        boolean var5 = false;
        int var6;
        if (this.field3599) {
            int var7 = this.field3590 + arg0;
            int var8 = this.field3600 + arg1;
            class487 var9 = this.method5636();
            var6 = this.field3577.method6673(var7 - (Integer) var9.field4965, var8 - (Integer) var9.field4963);
        } else {
            var6 = 0;
        }
        if (arg2 && arg3) {
            this.field3589 = 1;
            class487 var10 = this.method5575(var6);
            class487 var11 = this.method5575(this.field3593);
            this.method5627(var11, var10);
        } else if (arg2) {
            this.field3589 = 1;
            class487 var12 = this.method5575(var6);
            this.method5582((Integer) var12.field4965, (Integer) var12.field4963);
            this.field3593 = (Integer) var12.field4965;
        } else if (arg3) {
            this.method5582(this.field3593, var6);
        } else {
            if (this.field3594 <= 0 || this.field3593 != var6) {
                this.field3589 = 0;
                this.method5582(var6, var6);
                this.field3593 = var6;
            } else if (this.field3592 == this.field3591) {
                this.field3589 = 1;
                class487 var13 = this.method5575(var6);
                this.method5582((Integer) var13.field4965, (Integer) var13.field4963);
            } else {
                this.field3589 = 2;
                class487 var14 = this.method5572(var6);
                this.method5582((Integer) var14.field4965, (Integer) var14.field4963);
            }
            this.field3594 = 25;
        }
    }

    @ObfuscatedName("mo.bu(III)V")
    public void method5598(int arg0, int arg1) {
        if (!this.field3599 || !this.method5609()) {
            return;
        }
        int var3 = this.field3590 + arg0;
        int var4 = this.field3600 + arg1;
        class487 var5 = this.method5636();
        int var6 = this.field3577.method6673(var3 - (Integer) var5.field4965, var4 - (Integer) var5.field4963);
        switch(this.field3589) {
            case 0:
                this.method5582(this.field3592, var6);
                break;
            case 1:
                class487 var9 = this.method5575(this.field3593);
                class487 var10 = this.method5575(var6);
                this.method5627(var9, var10);
                break;
            case 2:
                class487 var7 = this.method5572(this.field3593);
                class487 var8 = this.method5572(var6);
                this.method5627(var7, var8);
        }
    }

    @ObfuscatedName("mo.bk(Ljava/awt/datatransfer/Clipboard;B)V")
    public void method5599(Clipboard arg0) {
        class400 var2 = this.field3577.method6762(this.field3592, this.field3591);
        if (!var2.method6916()) {
            String var3 = var2.method6914();
            if (!var3.isEmpty()) {
                arg0.setContents(new StringSelection(var3), (ClipboardOwner) null);
            }
        }
    }

    @ObfuscatedName("mo.bz(Ljava/awt/datatransfer/Clipboard;I)V")
    public void method5600(Clipboard arg0) {
        if (this.method5564()) {
            this.method5599(arg0);
            this.method5580();
        }
    }

    @ObfuscatedName("mo.bx(Ljava/awt/datatransfer/Clipboard;I)V")
    public void method5601(Clipboard arg0) {
        Transferable var2 = arg0.getContents((Object) null);
        if (var2 == null || !var2.isDataFlavorSupported(DataFlavor.stringFlavor)) {
            return;
        }
        try {
            String var3 = this.method5626((String) var2.getTransferData(DataFlavor.stringFlavor));
            this.method5580();
            class397 var4 = this.field3577.method6667(var3, this.field3591, this.field3575);
            this.method5582(var4.method6798(), var4.method6798());
            this.method5630();
            this.method5635();
        } catch (Exception var6) {
        }
    }

    @ObfuscatedName("mo.bh(B)V")
    public void method5628() {
        this.field3600 = Math.max(0, this.field3600 - this.field3577.method6691());
    }

    @ObfuscatedName("mo.bm(B)V")
    public void method5583() {
        int var1 = Math.max(0, this.field3577.method6658() - this.field3598);
        this.field3600 = Math.min(var1, this.field3600 + this.field3577.method6691());
    }

    @ObfuscatedName("mo.bl(Lmv;B)V")
    public void method5625(class325 arg0) {
        this.field3601 = arg0;
    }

    @ObfuscatedName("mo.bt(Lmv;I)V")
    public void method5605(class325 arg0) {
        this.field3602 = arg0;
    }

    @ObfuscatedName("mo.by(I)Lpt;")
    public class396 method5662() {
        return this.field3577;
    }

    @ObfuscatedName("mo.bg(B)Lpt;")
    public class396 method5813() {
        return this.field3595;
    }

    @ObfuscatedName("mo.bj(B)Lpo;")
    public class400 method5608() {
        return this.field3577.method6762(this.field3592, this.field3591);
    }

    @ObfuscatedName("mo.ct(I)Z")
    public boolean method5609() {
        return this.field3584;
    }

    @ObfuscatedName("mo.cf(I)Z")
    public boolean method5610() {
        return this.field3585;
    }

    @ObfuscatedName("mo.cz(B)Z")
    public boolean method5686() {
        return this.method5609() && this.field3586 % 60 < 30;
    }

    @ObfuscatedName("mo.cb(I)I")
    public int method5612() {
        return this.field3591;
    }

    @ObfuscatedName("mo.cs(I)I")
    public int method5613() {
        return this.field3592;
    }

    @ObfuscatedName("mo.cj(B)Z")
    public boolean method5614() {
        return this.field3599;
    }

    @ObfuscatedName("mo.cn(I)I")
    public int method5714() {
        return this.field3590;
    }

    @ObfuscatedName("mo.cw(B)I")
    public int method5616() {
        return this.field3600;
    }

    @ObfuscatedName("mo.ce(I)I")
    public int method5617() {
        return this.field3577.method6680();
    }

    @ObfuscatedName("mo.cq(I)I")
    public int method5618() {
        return this.field3577.method6681();
    }

    @ObfuscatedName("mo.cm(B)I")
    public int method5619() {
        return this.field3596;
    }

    @ObfuscatedName("mo.ca(I)I")
    public int method5602() {
        return this.field3582;
    }

    @ObfuscatedName("mo.cx(B)I")
    public int method5621() {
        return this.field3577.method6720();
    }

    @ObfuscatedName("mo.co(I)I")
    public int method5709() {
        return this.field3588;
    }

    @ObfuscatedName("mo.cu(B)I")
    public int method5698() {
        return this.field3577.method6683();
    }

    @ObfuscatedName("mo.cr(S)Z")
    public boolean method5624() {
        return this.method5618() > 1;
    }

    @ObfuscatedName("mo.cd(I)Z")
    public boolean method5564() {
        return this.field3592 != this.field3591;
    }

    @ObfuscatedName("mo.cy(Ljava/lang/String;I)Ljava/lang/String;")
    public String method5626(String arg0) {
        StringBuilder var2 = new StringBuilder(arg0.length());
        for (int var3 = 0; var3 < arg0.length(); var3++) {
            char var4 = arg0.charAt(var3);
            if (this.method5615(var4)) {
                var2.append(var4);
            }
        }
        return var2.toString();
    }

    @ObfuscatedName("mo.ck(Lsf;Lsf;I)V")
    public void method5627(class487 arg0, class487 arg1) {
        if ((Integer) arg1.field4965 < (Integer) arg0.field4965) {
            this.method5582((Integer) arg0.field4963, (Integer) arg1.field4965);
        } else {
            this.method5582((Integer) arg0.field4965, (Integer) arg1.field4963);
        }
    }

    @ObfuscatedName("mo.cl(IB)Lsf;")
    public class487 method5575(int arg0) {
        int var2 = this.field3577.method6656();
        int var3 = 0;
        int var4 = var2;
        for (int var5 = arg0; var5 > 0; var5--) {
            if (this.method5690(this.field3577.method6652(var5 - 1).field4481)) {
                var3 = var5;
                break;
            }
        }
        for (int var6 = arg0; var6 < var2; var6++) {
            if (this.method5690(this.field3577.method6652(var6).field4481)) {
                var4 = var6;
                break;
            }
        }
        return new class487(var3, var4);
    }

    @ObfuscatedName("mo.cp(II)Lsf;")
    public class487 method5572(int arg0) {
        int var2 = this.field3577.method6656();
        int var3 = 0;
        int var4 = var2;
        for (int var5 = arg0; var5 > 0; var5--) {
            if (this.field3577.method6652(var5 - 1).field4481 == '\n') {
                var3 = var5;
                break;
            }
        }
        for (int var6 = arg0; var6 < var2; var6++) {
            if (this.field3577.method6652(var6).field4481 == '\n') {
                var4 = var6;
                break;
            }
        }
        return new class487(var3, var4);
    }

    @ObfuscatedName("mo.ch(I)Z")
    public boolean method5630() {
        if (!this.method5614()) {
            return false;
        }
        boolean var1 = false;
        if (this.field3577.method6656() > this.field3596) {
            this.field3577.method6672(this.field3596, this.field3577.method6656());
            var1 = true;
        }
        int var2 = this.method5618();
        if (this.field3577.method6678() > var2) {
            int var3 = this.field3577.method6674(0, var2) - 1;
            this.field3577.method6672(var3, this.field3577.method6656());
            var1 = true;
        }
        if (var1) {
            int var4 = this.field3591;
            int var5 = this.field3592;
            int var6 = this.field3577.method6656();
            if (this.field3591 > var6) {
                var4 = var6;
            }
            if (this.field3592 > var6) {
                var5 = var6;
            }
            this.method5582(var5, var4);
        }
        return var1;
    }

    @ObfuscatedName("mo.cg(IZI)V")
    public void method5631(int arg0, boolean arg1) {
        if (arg1) {
            this.method5582(this.field3592, arg0);
        } else {
            this.method5582(arg0, arg0);
        }
    }

    @ObfuscatedName("mo.ci(I)I")
    public int method5728() {
        return this.field3598 / this.field3577.method6691();
    }

    @ObfuscatedName("mo.cv(I)V")
    public void method5793() {
        class400 var1 = this.field3577.method6762(0, this.field3591);
        class487 var2 = var1.method6920();
        int var3 = this.field3577.method6691();
        int var4 = (Integer) var2.field4965 - 10;
        int var5 = var4 + 20;
        int var6 = (Integer) var2.field4963 - 3;
        int var7 = var6 + 6 + var3;
        int var8 = this.field3590;
        int var9 = this.field3597 + var8;
        int var10 = this.field3600;
        int var11 = this.field3598 + var10;
        int var12 = this.field3590;
        int var13 = this.field3600;
        if (var4 < var8) {
            var12 = var4;
        } else if (var5 > var9) {
            var12 = var5 - this.field3597;
        }
        if (var6 < var10) {
            var13 = var6;
        } else if (var7 > var11) {
            var13 = var7 - this.field3598;
        }
        this.method5606(var12, var13);
    }

    @ObfuscatedName("mo.cc(II)Z")
    public boolean method5690(int arg0) {
        return arg0 == 32 || arg0 == 10 || arg0 == 9;
    }

    @ObfuscatedName("mo.dc(I)V")
    public void method5635() {
        if (this.field3601 != null) {
            this.field3601.method2556();
        }
    }

    @ObfuscatedName("mo.dq(IB)Z")
    public boolean method5615(int arg0) {
        switch(this.field3588) {
            case 1:
                return class388.method2810((char) arg0);
            case 2:
                return class388.method316((char) arg0);
            case 3:
                return class388.method3115((char) arg0);
            case 4:
                char var2 = (char) arg0;
                if (class388.method3115(var2)) {
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

    @ObfuscatedName("mo.dg(B)Lsf;")
    public class487 method5636() {
        int var1 = this.field3577.method6684(this.field3597);
        int var2 = this.field3577.method6685(this.field3598);
        return new class487(var1, var2);
    }
}
