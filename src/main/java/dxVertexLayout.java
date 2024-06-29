import jagdx.IDirect3DVertexDeclaration;
import jagdx.VertexElementCollection;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dxVertexLayout")
public class dxVertexLayout extends class203 {

    @OriginalMember(owner = "client!dxVertexLayout", name = "h", descriptor = "Ljagdx/IDirect3DVertexDeclaration;")
    public IDirect3DVertexDeclaration field4572;

    @OriginalMember(owner = "client!dxVertexLayout", name = "<init>", descriptor = "(Llt;[Lofa;)V")
    public dxVertexLayout(class672 arg0, class328[] arg1) {
        VertexElementCollection var3 = new VertexElementCollection(arg0.field9439);
        int var4 = 0;
        for (int var5 = 0; var5 < arg1.length; var5++) {
            int var6 = 0;
            class328 var7 = arg1[var5];
            for (int var8 = 0; var8 < var7.method2098(-28377); var8++) {
                class674 var9 = var7.method2097(117, var8);
                if (class674.field9457 == var9) {
                    var3.addElement(var5, 2, 0, 0, 0, var6);
                } else if (class674.field9459 == var9) {
                    var3.addElement(var5, 2, 0, 3, 0, var6);
                } else if (class674.field9460 == var9) {
                    var3.addElement(var5, 4, 0, 10, 0, var6);
                } else if (class674.field9461 == var9) {
                    var3.addElement(var5, 0, 0, 5, var4++, var6);
                } else if (class674.field9462 == var9) {
                    var3.addElement(var5, 1, 0, 5, var4++, var6);
                } else if (class674.field9463 == var9) {
                    var3.addElement(var5, 2, 0, 5, var4++, var6);
                } else if (class674.field9464 == var9) {
                    var3.addElement(var5, 3, 0, 5, var4++, var6);
                }
                var6 += var9.field9458;
            }
        }
        var3.finish();
        this.field4572 = arg0.field9423.method2891(var3, null);
    }
}
