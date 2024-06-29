import jagdx.IDirect3DVertexDeclaration;
import jagdx.VertexElementCollection;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dxVertexLayout")
public class dxVertexLayout extends class163 {
   @OriginalMember(
      owner = "client!dxVertexLayout",
      name = "g",
      descriptor = "Ljagdx/IDirect3DVertexDeclaration;"
   )
   public IDirect3DVertexDeclaration field5154;

   @OriginalMember(
      owner = "client!dxVertexLayout",
      name = "<init>",
      descriptor = "(Lfi;[Lrd;)V"
   )
   public dxVertexLayout(class582 arg0, class354[] arg1) {
      VertexElementCollection var3 = new VertexElementCollection(arg0.field8631);
      int var4 = 0;

      for(int var5 = 0; arg1.length > var5; ++var5) {
         int var6 = 0;
         class354 var7 = arg1[var5];

         for(int var8 = 0; ~var8 > ~var7.method2765(18416); ++var8) {
            class697 var9 = var7.method2762((byte)-46, var8);
            if (class697.field10459 == var9) {
               var3.addElement(var5, 2, 0, 0, 0, var6);
            } else if (class697.field10463 != var9) {
               if (class697.field10465 != var9) {
                  if (class697.field10467 != var9) {
                     if (class697.field10468 == var9) {
                        var3.addElement(var5, 1, 0, 5, var4++, var6);
                     } else if (class697.field10469 == var9) {
                        var3.addElement(var5, 2, 0, 5, var4++, var6);
                     } else if (class697.field10470 == var9) {
                        var3.addElement(var5, 3, 0, 5, var4++, var6);
                     }
                  } else {
                     var3.addElement(var5, 0, 0, 5, var4++, var6);
                  }
               } else {
                  var3.addElement(var5, 4, 0, 10, 0, var6);
               }
            } else {
               var3.addElement(var5, 2, 0, 3, 0, var6);
            }

            var6 += var9.field10460;
         }
      }

      var3.finish();
      this.field5154 = arg0.field8614.method3784(var3, (IDirect3DVertexDeclaration)null);
   }
}
