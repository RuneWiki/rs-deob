import jagdx.IDirect3DVertexDeclaration;
import jagdx.VertexElementCollection;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dxVertexLayout")
public class dxVertexLayout extends class297 {
   @OriginalMember(
      owner = "client!dxVertexLayout",
      name = "e",
      descriptor = "Ljagdx/IDirect3DVertexDeclaration;"
   )
   public IDirect3DVertexDeclaration field6366;

   @OriginalMember(
      owner = "client!dxVertexLayout",
      name = "<init>",
      descriptor = "(Lmv;[Len;)V"
   )
   public dxVertexLayout(class125 arg0, class446[] arg1) {
      VertexElementCollection var3 = new VertexElementCollection(arg0.field2006);
      int var4 = 0;

      for(int var5 = 0; ~var5 > ~arg1.length; ++var5) {
         int var6 = 0;
         class446 var7 = arg1[var5];

         for(int var8 = 0; ~var8 > ~var7.method3458(29577); ++var8) {
            class586 var9 = var7.method3459((byte)73, var8);
            if (class586.field8209 != var9) {
               if (class586.field8216 == var9) {
                  var3.addElement(var5, 2, 0, 3, 0, var6);
               } else if (class586.field8218 != var9) {
                  if (class586.field8219 != var9) {
                     if (class586.field8220 != var9) {
                        if (class586.field8221 != var9) {
                           if (class586.field8222 == var9) {
                              var3.addElement(var5, 3, 0, 5, var4++, var6);
                           }
                        } else {
                           var3.addElement(var5, 2, 0, 5, var4++, var6);
                        }
                     } else {
                        var3.addElement(var5, 1, 0, 5, var4++, var6);
                     }
                  } else {
                     var3.addElement(var5, 0, 0, 5, var4++, var6);
                  }
               } else {
                  var3.addElement(var5, 4, 0, 10, 0, var6);
               }
            } else {
               var3.addElement(var5, 2, 0, 0, 0, var6);
            }

            var6 += var9.field8211;
         }
      }

      var3.finish();
      this.field6366 = arg0.field2013.method3117(var3, (IDirect3DVertexDeclaration)null);
   }
}
