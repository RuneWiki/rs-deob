package jaclib.peer;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jaclib/peer/aj")
public class class406 {
   @OriginalMember(
      owner = "client!jaclib/peer/aj",
      name = "c",
      descriptor = "Ljava/lang/ref/ReferenceQueue;"
   )
   public ReferenceQueue field5966 = new ReferenceQueue();
   @OriginalMember(
      owner = "client!jaclib/peer/aj",
      name = "b",
      descriptor = "Ljaclib/peer/PeerReference;"
   )
   private PeerReference field5964;
   @OriginalMember(
      owner = "client!jaclib/peer/aj",
      name = "a",
      descriptor = "Ljaclib/peer/PeerReference;"
   )
   private PeerReference field5965;

   @OriginalMember(
      owner = "client!jaclib/peer/aj",
      name = "a",
      descriptor = "(B)V"
   )
   public final void method3164(byte arg0) {
      this.method3167(-12874);

      while(this.field5964 != null) {
         this.method3168((byte)-87, this.field5964);
      }

      if (arg0 < 86) {
         this.field5964 = (PeerReference)null;
      }

      this.method3167(-12874);
   }

   @OriginalMember(
      owner = "client!jaclib/peer/aj",
      name = "b",
      descriptor = "(B)V"
   )
   public final void method3165(byte arg0) {
      if (arg0 != -44) {
         this.field5965 = (PeerReference)null;
      }

      this.method3167(-12874);
   }

   @OriginalMember(
      owner = "client!jaclib/peer/aj",
      name = "a",
      descriptor = "(BLjaclib/peer/PeerReference;)V"
   )
   public final void method3166(byte arg0, PeerReference arg1) {
      arg1.field5962 = null;
      arg1.field5961 = this.field5964;
      if (arg0 == 43) {
         if (this.field5965 != null) {
            this.field5964.field5962 = arg1;
         } else {
            this.field5965 = arg1;
         }

         this.field5964 = arg1;
      }
   }

   @OriginalMember(
      owner = "client!jaclib/peer/aj",
      name = "a",
      descriptor = "(I)V"
   )
   private final void method3167(int arg0) {
      if (arg0 != -12874) {
         this.method3166((byte)93, (PeerReference)null);
      }

      while(true) {
         Reference var2 = this.field5966.poll();
         if (var2 == null) {
            return;
         }

         PeerReference var3 = (PeerReference)var2;
         this.method3168((byte)-87, var3);
      }
   }

   @OriginalMember(
      owner = "client!jaclib/peer/aj",
      name = "b",
      descriptor = "(BLjaclib/peer/PeerReference;)V"
   )
   private final void method3168(byte arg0, PeerReference arg1) {
      arg1.method3159(105);
      if (arg0 == -87) {
         if (this.field5965 == arg1) {
            this.field5965 = arg1.field5962;
         }

         if (this.field5964 == arg1) {
            this.field5964 = arg1.field5961;
         }

         if (arg1.field5962 != null) {
            arg1.field5962.field5961 = arg1.field5961;
         }

         if (arg1.field5961 != null) {
            arg1.field5961.field5962 = arg1.field5962;
         }

      }
   }
}
