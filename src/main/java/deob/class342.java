package deob;

import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;

@ObfuscatedName("ni")
public class class342 {

    @ObfuscatedName("ni.am")
    public class407 field3621 = new class407();

    @ObfuscatedName("ni.aq")
    public class407 field3620 = new class407();

    @ObfuscatedName("ni.ai")
    public boolean field3629 = false;

    @ObfuscatedName("ni.aw")
    public boolean field3622 = true;

    @ObfuscatedName("ni.ae")
    public int field3619 = 0;

    @ObfuscatedName("ni.an")
    public boolean field3624 = false;

    @ObfuscatedName("ni.ag")
    public int field3625 = 0;

    @ObfuscatedName("ni.ad")
    public int field3626 = 0;

    @ObfuscatedName("ni.af")
    public int field3627 = 0;

    @ObfuscatedName("ni.be")
    public int field3639 = 0;

    @ObfuscatedName("ni.bd")
    public int field3615 = 0;

    @ObfuscatedName("ni.bl")
    public int field3616 = 0;

    @ObfuscatedName("ni.bi")
    public int field3631 = 0;

    @ObfuscatedName("ni.bv")
    public int field3632 = Integer.MAX_VALUE;

    @ObfuscatedName("ni.bf")
    public int field3633 = Integer.MAX_VALUE;

    @ObfuscatedName("ni.bg")
    public int field3634 = 0;

    @ObfuscatedName("ni.ba")
    public int field3628 = 0;

    @ObfuscatedName("ni.bm")
    public int field3636 = 0;

    @ObfuscatedName("ni.bp")
    public int field3640 = 0;

    @ObfuscatedName("ni.bw")
    public class335 field3638;

    @ObfuscatedName("ni.bj")
    public class335 field3637;

    public class342() {
        this.field3621.method6941(1);
        this.field3620.method6941(1);
    }

    @ObfuscatedName("ni.at(B)V")
    public void method5711() {
        this.field3619 = (this.field3619 + 1) % 60;
        if (this.field3631 > 0) {
            this.field3631--;
        }
    }

    @ObfuscatedName("ni.ah(ZI)Z")
    public boolean method5712(boolean arg0) {
        boolean var2 = arg0 && this.field3622;
        boolean var3 = this.field3629 != var2;
        this.field3629 = var2;
        if (!this.field3629) {
            this.method5736(this.field3639, this.field3639);
        }
        return var3;
    }

    @ObfuscatedName("ni.ar(ZI)V")
    public void method5965(boolean arg0) {
        this.field3622 = arg0;
        this.field3629 = arg0 && this.field3629;
    }

    @ObfuscatedName("ni.ao(Ljava/lang/String;B)Z")
    public boolean method5714(String arg0) {
        String var2 = this.field3621.method6839();
        if (var2.equals(arg0)) {
            return false;
        }
        String var3 = this.method5780(arg0);
        this.field3621.method6851(var3);
        this.method5736(this.field3615, this.field3639);
        this.method5721(this.field3636, this.field3640);
        this.method5802();
        this.method5925();
        return true;
    }

    @ObfuscatedName("ni.ab(Ljava/lang/String;B)Z")
    public boolean method5715(String arg0) {
        this.field3620.method6851(arg0);
        return true;
    }

    @ObfuscatedName("ni.au(Lpa;B)Z")
    public boolean method5782(class410 arg0) {
        boolean var2 = !this.field3624;
        this.field3621.method6843(arg0);
        this.field3620.method6843(arg0);
        this.field3624 = true;
        boolean var3 = var2 | this.method5721(this.field3636, this.field3640);
        boolean var4 = var3 | this.method5736(this.field3615, this.field3639);
        if (this.method5802()) {
            this.method5925();
            var4 = true;
        }
        return var4;
    }

    @ObfuscatedName("ni.aa(IIB)Z")
    public boolean method5717(int arg0, int arg1) {
        boolean var3 = this.field3634 != arg0 || this.field3628 != arg1;
        this.field3634 = arg0;
        this.field3628 = arg1;
        return var3 | this.method5721(this.field3636, this.field3640);
    }

    @ObfuscatedName("ni.ac(II)Z")
    public boolean method5718(int arg0) {
        if (arg0 < 0) {
            arg0 = Integer.MAX_VALUE;
        }
        boolean var2 = arg0 == this.field3621.method6862();
        this.field3621.method6840(arg0);
        this.field3620.method6840(arg0);
        if (this.method5802()) {
            this.method5925();
            var2 = true;
        }
        return var2;
    }

    @ObfuscatedName("ni.al(IB)Z")
    public boolean method5904(int arg0) {
        this.field3621.method6841(arg0);
        if (this.method5802()) {
            this.method5925();
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("ni.az(II)Z")
    public boolean method5720(int arg0) {
        this.field3633 = arg0;
        if (this.method5802()) {
            this.method5925();
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("ni.ap(III)Z")
    public boolean method5721(int arg0, int arg1) {
        if (!this.method5745()) {
            this.field3636 = arg0;
            this.field3640 = arg1;
            return false;
        }
        int var3 = this.field3636;
        int var4 = this.field3640;
        int var5 = Math.max(0, this.field3621.method6969() - this.field3634 + 2);
        int var6 = Math.max(0, this.field3621.method6934() - this.field3628 + 1);
        this.field3636 = Math.max(0, Math.min(var5, arg0));
        this.field3640 = Math.max(0, Math.min(var6, arg1));
        return this.field3636 != var3 || this.field3640 != var4;
    }

    @ObfuscatedName("ni.av(IIB)Z")
    public boolean method5722(int arg0, int arg1) {
        boolean var3 = true;
        if (arg0 < 0 || arg0 > 2) {
            var3 = false;
        }
        if (arg1 < 0 || arg1 > 2) {
            var3 = false;
        }
        return var3 ? this.field3621.method6845(arg0, arg1) : false;
    }

    @ObfuscatedName("ni.ax(IB)V")
    public void method5723(int arg0) {
        this.field3621.method6846(arg0);
    }

    @ObfuscatedName("ni.as(IB)V")
    public void method5724(int arg0) {
        this.field3625 = arg0;
    }

    @ObfuscatedName("ni.ay(II)V")
    public void method5764(int arg0) {
        this.field3621.method6941(arg0);
    }

    @ObfuscatedName("ni.ak(II)V")
    public void method5726(int arg0) {
        this.field3621.method6842(arg0);
    }

    @ObfuscatedName("ni.aj(II)Z")
    public boolean method5727(int arg0) {
        this.field3627 = arg0;
        String var2 = this.field3621.method6839();
        int var3 = var2.length();
        String var4 = this.method5780(var2);
        if (var4.length() == var3) {
            return false;
        }
        this.field3621.method6851(var4);
        this.method5721(this.field3636, this.field3640);
        this.method5802();
        this.method5925();
        return true;
    }

    @ObfuscatedName("ni.am(I)V")
    public void method5737() {
        this.field3624 = false;
    }

    @ObfuscatedName("ni.aq(II)Z")
    public boolean method5729(int arg0) {
        if (this.method5790(arg0)) {
            this.method5812();
            class408 var2 = this.field3621.method6947((char) arg0, this.field3639, this.field3632);
            this.method5736(var2.method6971(), var2.method6971());
            this.method5802();
            this.method5925();
        }
        return true;
    }

    @ObfuscatedName("ni.ai(B)V")
    public void method5719() {
        if (!this.method5812() && this.field3639 > 0) {
            int var1 = this.field3621.method6885(this.field3639 - 1);
            this.method5925();
            this.method5736(var1, var1);
        }
    }

    @ObfuscatedName("ni.aw(I)V")
    public void method5731() {
        if (!this.method5812() && this.field3639 < this.field3621.method6838()) {
            int var1 = this.field3621.method6885(this.field3639);
            this.method5925();
            this.method5736(var1, var1);
        }
    }

    @ObfuscatedName("ni.ae(B)V")
    public void method5779() {
        if (!this.method5812() && this.field3639 > 0) {
            class498 var1 = this.method5829(this.field3639 - 1);
            int var2 = this.field3621.method6854((Integer) var1.field4997, this.field3639);
            this.method5925();
            this.method5736(var2, var2);
        }
    }

    @ObfuscatedName("ni.an(I)V")
    public void method5733() {
        if (!this.method5812() && this.field3639 < this.field3621.method6838()) {
            class498 var1 = this.method5829(this.field3639);
            int var2 = this.field3621.method6854(this.field3639, (Integer) var1.field4998);
            this.method5925();
            this.method5736(var2, var2);
        }
    }

    @ObfuscatedName("ni.ag(I)Z")
    public boolean method5812() {
        if (this.method5713()) {
            int var1 = this.field3621.method6854(this.field3615, this.field3639);
            this.method5925();
            this.method5736(var1, var1);
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("ni.ad(I)V")
    public void method5785() {
        this.method5736(0, this.field3621.method6838());
    }

    @ObfuscatedName("ni.af(III)Z")
    public boolean method5736(int arg0, int arg1) {
        if (!this.method5745()) {
            this.field3615 = arg0;
            this.field3639 = arg1;
            return false;
        }
        if (arg0 > this.field3621.method6838()) {
            arg0 = this.field3621.method6838();
        }
        if (arg1 > this.field3621.method6838()) {
            arg1 = this.field3621.method6838();
        }
        boolean var3 = this.field3615 != arg0 || this.field3639 != arg1;
        this.field3615 = arg0;
        if (this.field3639 != arg1) {
            this.field3639 = arg1;
            this.field3619 = 0;
            this.method5787();
        }
        if (var3 && this.field3637 != null) {
            this.field3637.method2628();
        }
        return var3;
    }

    @ObfuscatedName("ni.be(ZB)V")
    public void method5791(boolean arg0) {
        class498 var2 = this.method5810(this.field3639);
        this.method5856((Integer) var2.field4997, arg0);
    }

    @ObfuscatedName("ni.bd(ZB)V")
    public void method5738(boolean arg0) {
        class498 var2 = this.method5810(this.field3639);
        this.method5856((Integer) var2.field4998, arg0);
    }

    @ObfuscatedName("ni.bl(ZI)V")
    public void method5916(boolean arg0) {
        this.method5856(0, arg0);
    }

    @ObfuscatedName("ni.bi(ZI)V")
    public void method5740(boolean arg0) {
        this.method5856(this.field3621.method6838(), arg0);
    }

    @ObfuscatedName("ni.bv(ZI)V")
    public void method5741(boolean arg0) {
        if (this.method5713() && !arg0) {
            this.method5856(Math.min(this.field3615, this.field3639), arg0);
        } else if (this.field3639 > 0) {
            this.method5856(this.field3639 - 1, arg0);
        }
    }

    @ObfuscatedName("ni.bf(ZB)V")
    public void method5742(boolean arg0) {
        if (this.method5713() && !arg0) {
            this.method5856(Math.max(this.field3615, this.field3639), arg0);
        } else if (this.field3639 < this.field3621.method6838()) {
            this.method5856(this.field3639 + 1, arg0);
        }
    }

    @ObfuscatedName("ni.bg(ZI)V")
    public void method5743(boolean arg0) {
        if (this.field3639 > 0) {
            class498 var2 = this.method5829(this.field3639 - 1);
            this.method5856((Integer) var2.field4997, arg0);
        }
    }

    @ObfuscatedName("ni.ba(ZI)V")
    public void method5744(boolean arg0) {
        if (this.field3639 < this.field3621.method6838()) {
            class498 var2 = this.method5829(this.field3639 + 1);
            this.method5856((Integer) var2.field4998, arg0);
        }
    }

    @ObfuscatedName("ni.bm(ZI)V")
    public void method5953(boolean arg0) {
        if (this.field3639 > 0) {
            this.method5856(this.field3621.method6856(this.field3639, -1), arg0);
        }
    }

    @ObfuscatedName("ni.bp(ZB)V")
    public void method5746(boolean arg0) {
        if (this.field3639 < this.field3621.method6838()) {
            this.method5856(this.field3621.method6856(this.field3639, 1), arg0);
        }
    }

    @ObfuscatedName("ni.bw(ZI)V")
    public void method5747(boolean arg0) {
        if (this.field3639 > 0) {
            int var2 = this.method5927();
            this.method5856(this.field3621.method6856(this.field3639, -var2), arg0);
        }
    }

    @ObfuscatedName("ni.bj(ZI)V")
    public void method5748(boolean arg0) {
        if (this.field3639 < this.field3621.method6838()) {
            int var2 = this.method5927();
            this.method5856(this.field3621.method6856(this.field3639, var2), arg0);
        }
    }

    @ObfuscatedName("ni.bn(ZI)V")
    public void method5947(boolean arg0) {
        class411 var2 = this.field3621.method6847(0, this.field3639);
        class498 var3 = var2.method7105();
        this.method5856(this.field3621.method6855((Integer) var3.field4997, this.field3640), arg0);
    }

    @ObfuscatedName("ni.bo(ZI)V")
    public void method5857(boolean arg0) {
        class411 var2 = this.field3621.method6847(0, this.field3639);
        class498 var3 = var2.method7105();
        this.method5856(this.field3621.method6855((Integer) var3.field4997, this.field3640 + this.field3628), arg0);
    }

    @ObfuscatedName("ni.bt(IIZZI)V")
    public void method5751(int arg0, int arg1, boolean arg2, boolean arg3) {
        boolean var5 = false;
        int var6;
        if (this.field3624) {
            int var7 = this.field3636 + arg0;
            int var8 = this.field3640 + arg1;
            class498 var9 = this.method5892();
            var6 = this.field3621.method6855(var7 - (Integer) var9.field4997, var8 - (Integer) var9.field4998);
        } else {
            var6 = 0;
        }
        if (arg2 && arg3) {
            this.field3626 = 1;
            class498 var10 = this.method5829(var6);
            class498 var11 = this.method5829(this.field3616);
            this.method5781(var11, var10);
        } else if (arg2) {
            this.field3626 = 1;
            class498 var12 = this.method5829(var6);
            this.method5736((Integer) var12.field4997, (Integer) var12.field4998);
            this.field3616 = (Integer) var12.field4997;
        } else if (arg3) {
            this.method5736(this.field3616, var6);
        } else {
            if (this.field3631 <= 0 || this.field3616 != var6) {
                this.field3626 = 0;
                this.method5736(var6, var6);
                this.field3616 = var6;
            } else if (this.field3639 == this.field3615) {
                this.field3626 = 1;
                class498 var13 = this.method5829(var6);
                this.method5736((Integer) var13.field4997, (Integer) var13.field4998);
            } else {
                this.field3626 = 2;
                class498 var14 = this.method5810(var6);
                this.method5736((Integer) var14.field4997, (Integer) var14.field4998);
            }
            this.field3631 = 25;
        }
    }

    @ObfuscatedName("ni.bu(III)V")
    public void method5752(int arg0, int arg1) {
        if (!this.field3624 || !this.method5991()) {
            return;
        }
        int var3 = this.field3636 + arg0;
        int var4 = this.field3640 + arg1;
        class498 var5 = this.method5892();
        int var6 = this.field3621.method6855(var3 - (Integer) var5.field4997, var4 - (Integer) var5.field4998);
        switch(this.field3626) {
            case 0:
                this.method5736(this.field3615, var6);
                break;
            case 1:
                class498 var9 = this.method5829(this.field3616);
                class498 var10 = this.method5829(var6);
                this.method5781(var9, var10);
                break;
            case 2:
                class498 var7 = this.method5810(this.field3616);
                class498 var8 = this.method5810(var6);
                this.method5781(var7, var8);
        }
    }

    @ObfuscatedName("ni.by(Ljava/awt/datatransfer/Clipboard;I)V")
    public void method5753(Clipboard arg0) {
        class411 var2 = this.field3621.method6847(this.field3615, this.field3639);
        if (!var2.method7089()) {
            String var3 = var2.method7087();
            if (!var3.isEmpty()) {
                arg0.setContents(new StringSelection(var3), (ClipboardOwner) null);
            }
        }
    }

    @ObfuscatedName("ni.bh(Ljava/awt/datatransfer/Clipboard;I)V")
    public void method5754(Clipboard arg0) {
        if (this.method5713()) {
            this.method5753(arg0);
            this.method5812();
        }
    }

    @ObfuscatedName("ni.bz(Ljava/awt/datatransfer/Clipboard;I)V")
    public void method5897(Clipboard arg0) {
        Transferable var2 = arg0.getContents((Object) null);
        if (var2 == null || !var2.isDataFlavorSupported(DataFlavor.stringFlavor)) {
            return;
        }
        try {
            String var3 = this.method5780((String) var2.getTransferData(DataFlavor.stringFlavor));
            this.method5812();
            class408 var4 = this.field3621.method6849(var3, this.field3639, this.field3632);
            this.method5736(var4.method6971(), var4.method6971());
            this.method5802();
            this.method5925();
        } catch (Exception var6) {
        }
    }

    @ObfuscatedName("ni.bc(I)V")
    public void method5756() {
        this.field3640 = Math.max(0, this.field3640 - this.field3621.method6930());
    }

    @ObfuscatedName("ni.bs(B)V")
    public void method5757() {
        int var1 = Math.max(0, this.field3621.method6934() - this.field3628);
        this.field3640 = Math.min(var1, this.field3640 + this.field3621.method6930());
    }

    @ObfuscatedName("ni.bx(Lmc;I)V")
    public void method5758(class335 arg0) {
        this.field3638 = arg0;
    }

    @ObfuscatedName("ni.bb(Lmc;I)V")
    public void method5792(class335 arg0) {
        this.field3637 = arg0;
    }

    @ObfuscatedName("ni.bk(I)Lpv;")
    public class407 method5967() {
        return this.field3621;
    }

    @ObfuscatedName("ni.br(I)Lpv;")
    public class407 method5995() {
        return this.field3620;
    }

    @ObfuscatedName("ni.bq(B)Lpd;")
    public class411 method5960() {
        return this.field3621.method6847(this.field3615, this.field3639);
    }

    @ObfuscatedName("ni.cf(I)Z")
    public boolean method5991() {
        return this.field3629;
    }

    @ObfuscatedName("ni.cg(B)Z")
    public boolean method5760() {
        return this.field3622;
    }

    @ObfuscatedName("ni.cv(B)Z")
    public boolean method5765() {
        return this.method5991() && this.field3619 % 60 < 30;
    }

    @ObfuscatedName("ni.cx(B)I")
    public int method5766() {
        return this.field3639;
    }

    @ObfuscatedName("ni.cp(B)I")
    public int method5767() {
        return this.field3615;
    }

    @ObfuscatedName("ni.ce(I)Z")
    public boolean method5745() {
        return this.field3624;
    }

    @ObfuscatedName("ni.ci(I)I")
    public int method5769() {
        return this.field3636;
    }

    @ObfuscatedName("ni.ct(I)I")
    public int method5770() {
        return this.field3640;
    }

    @ObfuscatedName("ni.cw(I)I")
    public int method5771() {
        return this.field3621.method6862();
    }

    @ObfuscatedName("ni.cq(I)I")
    public int method5979() {
        return this.field3621.method6863();
    }

    @ObfuscatedName("ni.cl(I)I")
    public int method5981() {
        return this.field3633;
    }

    @ObfuscatedName("ni.cs(B)I")
    public int method5774() {
        return this.field3625;
    }

    @ObfuscatedName("ni.co(I)I")
    public int method5775() {
        return this.field3621.method6864();
    }

    @ObfuscatedName("ni.cm(B)I")
    public int method5776() {
        return this.field3627;
    }

    @ObfuscatedName("ni.cn(I)I")
    public int method5901() {
        return this.field3621.method6865();
    }

    @ObfuscatedName("ni.cr(B)Z")
    public boolean method5777() {
        return this.method5979() > 1;
    }

    @ObfuscatedName("ni.cj(I)Z")
    public boolean method5713() {
        return this.field3639 != this.field3615;
    }

    @ObfuscatedName("ni.ca(Ljava/lang/String;B)Ljava/lang/String;")
    public String method5780(String arg0) {
        StringBuilder var2 = new StringBuilder(arg0.length());
        for (int var3 = 0; var3 < arg0.length(); var3++) {
            char var4 = arg0.charAt(var3);
            if (this.method5790(var4)) {
                var2.append(var4);
            }
        }
        return var2.toString();
    }

    @ObfuscatedName("ni.cc(Lti;Lti;I)V")
    public void method5781(class498 arg0, class498 arg1) {
        if ((Integer) arg1.field4997 < (Integer) arg0.field4997) {
            this.method5736((Integer) arg0.field4998, (Integer) arg1.field4997);
        } else {
            this.method5736((Integer) arg0.field4997, (Integer) arg1.field4998);
        }
    }

    @ObfuscatedName("ni.cu(II)Lti;")
    public class498 method5829(int arg0) {
        int var2 = this.field3621.method6838();
        int var3 = 0;
        int var4 = var2;
        for (int var5 = arg0; var5 > 0; var5--) {
            if (this.method5788(this.field3621.method6868(var5 - 1).field4510)) {
                var3 = var5;
                break;
            }
        }
        for (int var6 = arg0; var6 < var2; var6++) {
            if (this.method5788(this.field3621.method6868(var6).field4510)) {
                var4 = var6;
                break;
            }
        }
        return new class498(var3, var4);
    }

    @ObfuscatedName("ni.ch(II)Lti;")
    public class498 method5810(int arg0) {
        int var2 = this.field3621.method6838();
        int var3 = 0;
        int var4 = var2;
        for (int var5 = arg0; var5 > 0; var5--) {
            if (this.field3621.method6868(var5 - 1).field4510 == '\n') {
                var3 = var5;
                break;
            }
        }
        for (int var6 = arg0; var6 < var2; var6++) {
            if (this.field3621.method6868(var6).field4510 == '\n') {
                var4 = var6;
                break;
            }
        }
        return new class498(var3, var4);
    }

    @ObfuscatedName("ni.cb(I)Z")
    public boolean method5802() {
        if (!this.method5745()) {
            return false;
        }
        boolean var1 = false;
        if (this.field3621.method6838() > this.field3633) {
            this.field3621.method6854(this.field3633, this.field3621.method6838());
            var1 = true;
        }
        int var2 = this.method5979();
        if (this.field3621.method6860() > var2) {
            int var3 = this.field3621.method6856(0, var2) - 1;
            this.field3621.method6854(var3, this.field3621.method6838());
            var1 = true;
        }
        if (var1) {
            int var4 = this.field3639;
            int var5 = this.field3615;
            int var6 = this.field3621.method6838();
            if (this.field3639 > var6) {
                var4 = var6;
            }
            if (this.field3615 > var6) {
                var5 = var6;
            }
            this.method5736(var5, var4);
        }
        return var1;
    }

    @ObfuscatedName("ni.cz(IZI)V")
    public void method5856(int arg0, boolean arg1) {
        if (arg1) {
            this.method5736(this.field3615, arg0);
        } else {
            this.method5736(arg0, arg0);
        }
    }

    @ObfuscatedName("ni.cy(B)I")
    public int method5927() {
        return this.field3628 / this.field3621.method6930();
    }

    @ObfuscatedName("ni.ck(I)V")
    public void method5787() {
        class411 var1 = this.field3621.method6847(0, this.field3639);
        class498 var2 = var1.method7105();
        int var3 = this.field3621.method6930();
        int var4 = (Integer) var2.field4997 - 10;
        int var5 = var4 + 20;
        int var6 = (Integer) var2.field4998 - 3;
        int var7 = var6 + 6 + var3;
        int var8 = this.field3636;
        int var9 = this.field3634 + var8;
        int var10 = this.field3640;
        int var11 = this.field3628 + var10;
        int var12 = this.field3636;
        int var13 = this.field3640;
        if (var4 < var8) {
            var12 = var4;
        } else if (var5 > var9) {
            var12 = var5 - this.field3634;
        }
        if (var6 < var10) {
            var13 = var6;
        } else if (var7 > var11) {
            var13 = var7 - this.field3628;
        }
        this.method5721(var12, var13);
    }

    @ObfuscatedName("ni.cd(IB)Z")
    public boolean method5788(int arg0) {
        return arg0 == 32 || arg0 == 10 || arg0 == 9;
    }

    @ObfuscatedName("ni.dt(S)V")
    public void method5925() {
        if (this.field3638 != null) {
            this.field3638.method2628();
        }
    }

    @ObfuscatedName("ni.di(II)Z")
    public boolean method5790(int arg0) {
        switch(this.field3627) {
            case 1:
                return class399.method386((char) arg0);
            case 2:
                return class399.method102((char) arg0);
            case 3:
                return class399.method2318((char) arg0);
            case 4:
                char var2 = (char) arg0;
                if (class399.method2318(var2)) {
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

    @ObfuscatedName("ni.dk(I)Lti;")
    public class498 method5892() {
        int var1 = this.field3621.method6876(this.field3634);
        int var2 = this.field3621.method6867(this.field3628);
        return new class498(var1, var2);
    }
}
