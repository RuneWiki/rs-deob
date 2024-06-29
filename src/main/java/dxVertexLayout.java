import jagdx.IDirect3DVertexDeclaration;
import jagdx.VertexElementCollection;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dxVertexLayout")
public class dxVertexLayout extends class448 {

    @OriginalMember(owner = "client!dxVertexLayout", name = "e", descriptor = "Ljagdx/IDirect3DVertexDeclaration;")
    public IDirect3DVertexDeclaration field8616;

    @OriginalMember(owner = "client!dxVertexLayout", name = "<init>", descriptor = "(Lad;[Len;)V")
    public dxVertexLayout(class173 arg0, class109[] arg1) {
        VertexElementCollection var3 = new VertexElementCollection(arg0.field2442);
        int var4 = 0;
        for (int var5 = 0; var5 < arg1.length; var5++) {
            int var6 = 0;
            class109 var7 = arg1[var5];
            for (int var8 = 0; var8 < var7.method803(-87); var8++) {
                class697 var9 = var7.method804(true, var8);
                if (class697.field9848 == var9) {
                    var3.addElement(var5, 2, 0, 0, 0, var6);
                } else if (class697.field9849 == var9) {
                    var3.addElement(var5, 2, 0, 3, 0, var6);
                } else if (class697.field9850 == var9) {
                    var3.addElement(var5, 4, 0, 10, 0, var6);
                } else if (class697.field9851 == var9) {
                    var3.addElement(var5, 0, 0, 5, var4++, var6);
                } else if (class697.field9852 == var9) {
                    var3.addElement(var5, 1, 0, 5, var4++, var6);
                } else if (class697.field9853 == var9) {
                    var3.addElement(var5, 2, 0, 5, var4++, var6);
                } else if (class697.field9854 == var9) {
                    var3.addElement(var5, 3, 0, 5, var4++, var6);
                }
                var6 += var9.field9843;
            }
        }
        var3.finish();
        this.field8616 = arg0.field2418.method4096(var3, null);
    }
}
