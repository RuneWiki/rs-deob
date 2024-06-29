import jagdx.IDirect3DVertexDeclaration;
import jagdx.VertexElementCollection;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dxVertexLayout")
public class dxVertexLayout extends class753 {

    @OriginalMember(owner = "client!dxVertexLayout", name = "f", descriptor = "Ljagdx/IDirect3DVertexDeclaration;")
    public IDirect3DVertexDeclaration field8034;

    @OriginalMember(owner = "client!dxVertexLayout", name = "<init>", descriptor = "(Lcka;[Lls;)V", line = 3)
    public dxVertexLayout(class248 arg0, class592[] arg1) {
        VertexElementCollection var3 = new VertexElementCollection(arg0.field3405);
        int var4 = 0;
        for (int var5 = 0; var5 < arg1.length; var5++) {
            int var6 = 0;
            class592 var7 = arg1[var5];
            for (int var8 = 0; var7.method3186((byte) -83) > var8; var8++) {
                class604 var9 = var7.method3185(var8, true);
                if (class604.field7665 == var9) {
                    var3.addElement(var5, 2, 0, 0, 0, var6);
                } else if (class604.field7666 == var9) {
                    var3.addElement(var5, 2, 0, 3, 0, var6);
                } else if (class604.field7667 == var9) {
                    var3.addElement(var5, 4, 0, 10, 0, var6);
                } else if (class604.field7668 == var9) {
                    var3.addElement(var5, 0, 0, 5, var4++, var6);
                } else if (class604.field7669 == var9) {
                    var3.addElement(var5, 1, 0, 5, var4++, var6);
                } else if (class604.field7670 == var9) {
                    var3.addElement(var5, 2, 0, 5, var4++, var6);
                } else if (class604.field7671 == var9) {
                    var3.addElement(var5, 3, 0, 5, var4++, var6);
                }
                var6 += var9.field7663;
            }
        }
        var3.finish();
        this.field8034 = arg0.field3402.method4183(var3, null);
    }
}
