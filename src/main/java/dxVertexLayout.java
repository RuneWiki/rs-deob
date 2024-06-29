import jagdx.IDirect3DVertexDeclaration;
import jagdx.VertexElementCollection;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dxVertexLayout")
public class dxVertexLayout extends class785 {

    @OriginalMember(owner = "client!dxVertexLayout", name = "e", descriptor = "Ljagdx/IDirect3DVertexDeclaration;")
    public IDirect3DVertexDeclaration field4298;

    @OriginalMember(owner = "client!dxVertexLayout", name = "<init>", descriptor = "(Lus;[Lpo;)V", line = 3)
    public dxVertexLayout(class1 arg0, class585[] arg1) {
        VertexElementCollection var3 = new VertexElementCollection(arg0.field13);
        int var4 = 0;
        for (int var5 = 0; var5 < arg1.length; var5++) {
            int var6 = 0;
            class585 var7 = arg1[var5];
            for (int var8 = 0; var8 < var7.method3365(0); var8++) {
                class504 var9 = var7.method3363(var8, -3);
                if (class504.field7122 == var9) {
                    var3.addElement(var5, 2, 0, 0, 0, var6);
                } else if (class504.field7125 == var9) {
                    var3.addElement(var5, 2, 0, 3, 0, var6);
                } else if (class504.field7129 == var9) {
                    var3.addElement(var5, 4, 0, 10, 0, var6);
                } else if (class504.field7133 == var9) {
                    var3.addElement(var5, 0, 0, 5, var4++, var6);
                } else if (class504.field7134 == var9) {
                    var3.addElement(var5, 1, 0, 5, var4++, var6);
                } else if (class504.field7135 == var9) {
                    var3.addElement(var5, 2, 0, 5, var4++, var6);
                } else if (class504.field7136 == var9) {
                    var3.addElement(var5, 3, 0, 5, var4++, var6);
                }
                var6 += var9.field7124;
            }
        }
        var3.finish();
        this.field4298 = arg0.field27.method3050(var3, null);
    }
}
