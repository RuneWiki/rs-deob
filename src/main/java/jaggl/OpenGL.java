package jaggl;

import java.awt.Canvas;
import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jaggl/OpenGL")
public class OpenGL {

    @OriginalMember(owner = "client!jaggl/OpenGL", name = "b", descriptor = "Ljava/util/Hashtable;")
    private static Hashtable field8040 = new Hashtable();

    @OriginalMember(owner = "client!jaggl/OpenGL", name = "peer", descriptor = "J")
    public long peer;

    @OriginalMember(owner = "client!jaggl/OpenGL", name = "a", descriptor = "Ljava/lang/Thread;")
    private Thread field8039;

    @OriginalMember(owner = "client!jaggl/OpenGL", name = "c", descriptor = "Ljava/util/Hashtable;")
    private Hashtable field8041;

    @OriginalMember(owner = "client!jaggl/OpenGL", name = "setSurface", descriptor = "(J)Z")
    public final native boolean setSurface(long arg0);

    @OriginalMember(owner = "client!jaggl/OpenGL", name = "glGetFloatv", descriptor = "(I[FI)V")
    public static final native void glGetFloatv(int arg0, float[] arg1, int arg2);

    @OriginalMember(owner = "client!jaggl/OpenGL", name = "glDeleteProgramARB", descriptor = "(I)V")
    public static final native void glDeleteProgramARB(int arg0);

    @OriginalMember(owner = "client!jaggl/OpenGL", name = "releaseSurface", descriptor = "(Ljava/awt/Canvas;J)V")
    public final native void releaseSurface(Canvas arg0, long arg1);

    @OriginalMember(owner = "client!jaggl/OpenGL", name = "releasePbuffer", descriptor = "(J)V")
    public final native void releasePbuffer(long arg0);

    @OriginalMember(owner = "client!jaggl/OpenGL", name = "glVertex3f", descriptor = "(FFF)V")
    public static final native void glVertex3f(float arg0, float arg1, float arg2);

    @OriginalMember(owner = "client!jaggl/OpenGL", name = "glTexImage1Dub", descriptor = "(IIIIIII[BI)V")
    public static final native void glTexImage1Dub(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, byte[] arg7, int arg8);

    @OriginalMember(owner = "client!jaggl/OpenGL", name = "a", descriptor = "()Z")
    public final synchronized boolean method3381() {
        Thread var1 = Thread.currentThread();
        if (!this.attachPeer()) {
            return false;
        }
        OpenGL var2 = (OpenGL) field8040.put(var1, this);
        if (var2 != null) {
            var2.field8039 = null;
        }
        this.field8039 = var1;
        return true;
    }

    @OriginalMember(owner = "client!jaggl/OpenGL", name = "glColorMask", descriptor = "(ZZZZ)V")
    public static final native void glColorMask(boolean arg0, boolean arg1, boolean arg2, boolean arg3);

    @OriginalMember(owner = "client!jaggl/OpenGL", name = "glUniformMatrix3fvARB", descriptor = "(IIZ[FI)V")
    public static final native void glUniformMatrix3fvARB(int arg0, int arg1, boolean arg2, float[] arg3, int arg4);

    @OriginalMember(owner = "client!jaggl/OpenGL", name = "glDeleteObjectARB", descriptor = "(J)V")
    public static final native void glDeleteObjectARB(long arg0);

    @OriginalMember(owner = "client!jaggl/OpenGL", name = "glPolygonMode", descriptor = "(II)V")
    public static final native void glPolygonMode(int arg0, int arg1);

    @OriginalMember(owner = "client!jaggl/OpenGL", name = "glTranslatef", descriptor = "(FFF)V")
    public static final native void glTranslatef(float arg0, float arg1, float arg2);

    @OriginalMember(owner = "client!jaggl/OpenGL", name = "glProgramRawARB", descriptor = "(II[B)V")
    public static final native void glProgramRawARB(int arg0, int arg1, byte[] arg2);

    @OriginalMember(owner = "client!jaggl/OpenGL", name = "glNormal3f", descriptor = "(FFF)V")
    public static final native void glNormal3f(float arg0, float arg1, float arg2);

    @OriginalMember(owner = "client!jaggl/OpenGL", name = "glBegin", descriptor = "(I)V")
    public static final native void glBegin(int arg0);

    @OriginalMember(owner = "client!jaggl/OpenGL", name = "glDrawBuffer", descriptor = "(I)V")
    public static final native void glDrawBuffer(int arg0);

    @OriginalMember(owner = "client!jaggl/OpenGL", name = "glViewport", descriptor = "(IIII)V")
    public static final native void glViewport(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!jaggl/OpenGL", name = "glTexSubImage2Df", descriptor = "(IIIIIIII[FI)V")
    public static final native void glTexSubImage2Df(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, float[] arg8, int arg9);

    @OriginalMember(owner = "client!jaggl/OpenGL", name = "glTexCoordPointer", descriptor = "(IIIJ)V")
    public static final native void glTexCoordPointer(int arg0, int arg1, int arg2, long arg3);

    @OriginalMember(owner = "client!jaggl/OpenGL", name = "glReadPixelsub", descriptor = "(IIIIII[BI)V")
    public static final native void glReadPixelsub(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7);

    @OriginalMember(owner = "client!jaggl/OpenGL", name = "glPixelTransferf", descriptor = "(IF)V")
    public static final native void glPixelTransferf(int arg0, float arg1);

    @OriginalMember(owner = "client!jaggl/OpenGL", name = "glScissor", descriptor = "(IIII)V")
    public static final native void glScissor(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!jaggl/OpenGL", name = "glMultiTexCoord2f", descriptor = "(IFF)V")
    public static final native void glMultiTexCoord2f(int arg0, float arg1, float arg2);

    @OriginalMember(owner = "client!jaggl/OpenGL", name = "swapBuffers", descriptor = "()V")
    public final native void swapBuffers();

    @OriginalMember(owner = "client!jaggl/OpenGL", name = "glGetTexImageub", descriptor = "(IIII[BI)V")
    public static final native void glGetTexImageub(int arg0, int arg1, int arg2, int arg3, byte[] arg4, int arg5);

    @OriginalMember(owner = "client!jaggl/OpenGL", name = "glEnableClientState", descriptor = "(I)V")
    public static final native void glEnableClientState(int arg0);

    @OriginalMember(owner = "client!jaggl/OpenGL", name = "glGenTextures", descriptor = "(I[II)V")
    public static final native void glGenTextures(int arg0, int[] arg1, int arg2);

    @OriginalMember(owner = "client!jaggl/OpenGL", name = "glTexEnvf", descriptor = "(IIF)V")
    public static final native void glTexEnvf(int arg0, int arg1, float arg2);

    @OriginalMember(owner = "client!jaggl/OpenGL", name = "setPbuffer", descriptor = "(J)V")
    public final native void setPbuffer(long arg0);

    @OriginalMember(owner = "client!jaggl/OpenGL", name = "glLinkProgramARB", descriptor = "(J)V")
    public static final native void glLinkProgramARB(long arg0);

    @OriginalMember(owner = "client!jaggl/OpenGL", name = "glBufferDataARBub", descriptor = "(II[BII)V")
    public static final native void glBufferDataARBub(int arg0, int arg1, byte[] arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!jaggl/OpenGL", name = "glTexParameteri", descriptor = "(III)V")
    public static final native void glTexParameteri(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!jaggl/OpenGL", name = "glLightf", descriptor = "(IIF)V")
    public static final native void glLightf(int arg0, int arg1, float arg2);

    @OriginalMember(owner = "client!jaggl/OpenGL", name = "glTexCoord2f", descriptor = "(FF)V")
    public static final native void glTexCoord2f(float arg0, float arg1);

    @OriginalMember(owner = "client!jaggl/OpenGL", name = "glTexSubImage2Dub", descriptor = "(IIIIIIII[BI)V")
    public static final native void glTexSubImage2Dub(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, byte[] arg8, int arg9);

    @OriginalMember(owner = "client!jaggl/OpenGL", name = "glUnmapBufferARB", descriptor = "(I)Z")
    public static final native boolean glUnmapBufferARB(int arg0);

    @OriginalMember(owner = "client!jaggl/OpenGL", name = "glDepthMask", descriptor = "(Z)V")
    public static final native void glDepthMask(boolean arg0);

    @OriginalMember(owner = "client!jaggl/OpenGL", name = "glFramebufferTexture3DEXT", descriptor = "(IIIIII)V")
    public static final native void glFramebufferTexture3DEXT(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!jaggl/OpenGL", name = "attachPeer", descriptor = "()Z")
    private final native boolean attachPeer();

    @OriginalMember(owner = "client!jaggl/OpenGL", name = "glScalef", descriptor = "(FFF)V")
    public static final native void glScalef(float arg0, float arg1, float arg2);

    @OriginalMember(owner = "client!jaggl/OpenGL", name = "glGenRenderbuffersEXT", descriptor = "(I[II)V")
    public static final native void glGenRenderbuffersEXT(int arg0, int[] arg1, int arg2);

    @OriginalMember(owner = "client!jaggl/OpenGL", name = "glTexCoord2i", descriptor = "(II)V")
    public static final native void glTexCoord2i(int arg0, int arg1);

    @OriginalMember(owner = "client!jaggl/OpenGL", name = "glFramebufferRenderbufferEXT", descriptor = "(IIII)V")
    public static final native void glFramebufferRenderbufferEXT(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!jaggl/OpenGL", name = "glFogf", descriptor = "(IF)V")
    public static final native void glFogf(int arg0, float arg1);

    @OriginalMember(owner = "client!jaggl/OpenGL", name = "glLoadIdentity", descriptor = "()V")
    public static final native void glLoadIdentity();

    @OriginalMember(owner = "client!jaggl/OpenGL", name = "glBlendFunc", descriptor = "(II)V")
    public static final native void glBlendFunc(int arg0, int arg1);

    @OriginalMember(owner = "client!jaggl/OpenGL", name = "glUseProgramObjectARB", descriptor = "(J)V")
    public static final native void glUseProgramObjectARB(long arg0);

    @OriginalMember(owner = "client!jaggl/OpenGL", name = "glStencilOp", descriptor = "(III)V")
    public static final native void glStencilOp(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!jaggl/OpenGL", name = "glCullFace", descriptor = "(I)V")
    public static final native void glCullFace(int arg0);

    @OriginalMember(owner = "client!jaggl/OpenGL", name = "glVertex2f", descriptor = "(FF)V")
    public static final native void glVertex2f(float arg0, float arg1);

    @OriginalMember(owner = "client!jaggl/OpenGL", name = "glBufferSubDataARBub", descriptor = "(III[BI)V")
    public static final native void glBufferSubDataARBub(int arg0, int arg1, int arg2, byte[] arg3, int arg4);

    @OriginalMember(owner = "client!jaggl/OpenGL", name = "glBindRenderbufferEXT", descriptor = "(II)V")
    public static final native void glBindRenderbufferEXT(int arg0, int arg1);

    @OriginalMember(owner = "client!jaggl/OpenGL", name = "glCopyTexImage2D", descriptor = "(IIIIIIII)V")
    public static final native void glCopyTexImage2D(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7);

    @OriginalMember(owner = "client!jaggl/OpenGL", name = "a", descriptor = "(Ljava/lang/String;)Z")
    public final boolean method3382(String arg0) {
        if (this.field8041 == null) {
            this.field8041 = new Hashtable();
            String var2 = glGetString(7939);
            int var3 = 0;
            while (true) {
                int var4 = var2.indexOf(32, var3);
                if (var4 == -1) {
                    String var6 = var2.substring(var3).trim();
                    if (var6.length() != 0) {
                        this.field8041.put(var6, var6);
                    }
                    break;
                }
                String var5 = var2.substring(var3, var4).trim();
                if (var5.length() != 0) {
                    this.field8041.put(var5, var5);
                }
                var3 = var4 + 1;
            }
        }
        return this.field8041.containsKey(arg0);
    }

    @OriginalMember(owner = "client!jaggl/OpenGL", name = "glPopAttrib", descriptor = "()V")
    public static final native void glPopAttrib();

    @OriginalMember(owner = "client!jaggl/OpenGL", name = "glBufferDataARBa", descriptor = "(IIJI)V")
    public static final native void glBufferDataARBa(int arg0, int arg1, long arg2, int arg3);

    @OriginalMember(owner = "client!jaggl/OpenGL", name = "glGetObjectParameterivARB", descriptor = "(JI[II)V")
    public static final native void glGetObjectParameterivARB(long arg0, int arg1, int[] arg2, int arg3);

    @OriginalMember(owner = "client!jaggl/OpenGL", name = "glMultMatrixf", descriptor = "([FI)V")
    public static final native void glMultMatrixf(float[] arg0, int arg1);

    @OriginalMember(owner = "client!jaggl/OpenGL", name = "glDetachObjectARB", descriptor = "(JJ)V")
    public static final native void glDetachObjectARB(long arg0, long arg1);

    @OriginalMember(owner = "client!jaggl/OpenGL", name = "glClear", descriptor = "(I)V")
    public static final native void glClear(int arg0);

    @OriginalMember(owner = "client!jaggl/OpenGL", name = "glGetIntegerv", descriptor = "(I[II)V")
    public static final native void glGetIntegerv(int arg0, int[] arg1, int arg2);

    @OriginalMember(owner = "client!jaggl/OpenGL", name = "glPixelZoom", descriptor = "(FF)V")
    public static final native void glPixelZoom(float arg0, float arg1);

    @OriginalMember(owner = "client!jaggl/OpenGL", name = "glTexCoord3f", descriptor = "(FFF)V")
    public static final native void glTexCoord3f(float arg0, float arg1, float arg2);

    @OriginalMember(owner = "client!jaggl/OpenGL", name = "glBindFramebufferEXT", descriptor = "(II)V")
    public static final native void glBindFramebufferEXT(int arg0, int arg1);

    @OriginalMember(owner = "client!jaggl/OpenGL", name = "glEnd", descriptor = "()V")
    public static final native void glEnd();

    @OriginalMember(owner = "client!jaggl/OpenGL", name = "glReadBuffer", descriptor = "(I)V")
    public static final native void glReadBuffer(int arg0);

    @OriginalMember(owner = "client!jaggl/OpenGL", name = "glGenFramebuffersEXT", descriptor = "(I[II)V")
    public static final native void glGenFramebuffersEXT(int arg0, int[] arg1, int arg2);

    @OriginalMember(owner = "client!jaggl/OpenGL", name = "glLightfv", descriptor = "(II[FI)V")
    public static final native void glLightfv(int arg0, int arg1, float[] arg2, int arg3);

    @OriginalMember(owner = "client!jaggl/OpenGL", name = "glColorMaterial", descriptor = "(II)V")
    public static final native void glColorMaterial(int arg0, int arg1);

    @OriginalMember(owner = "client!jaggl/OpenGL", name = "glDrawPixelsi", descriptor = "(IIII[II)V")
    public static final native void glDrawPixelsi(int arg0, int arg1, int arg2, int arg3, int[] arg4, int arg5);

    @OriginalMember(owner = "client!jaggl/OpenGL", name = "glCheckFramebufferStatusEXT", descriptor = "(I)I")
    public static final native int glCheckFramebufferStatusEXT(int arg0);

    @OriginalMember(owner = "client!jaggl/OpenGL", name = "glRenderbufferStorageEXT", descriptor = "(IIII)V")
    public static final native void glRenderbufferStorageEXT(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!jaggl/OpenGL", name = "glCreateProgramObjectARB", descriptor = "()J")
    public static final native long glCreateProgramObjectARB();

    @OriginalMember(owner = "client!jaggl/OpenGL", name = "glDeleteFramebuffersEXT", descriptor = "(I[II)V")
    public static final native void glDeleteFramebuffersEXT(int arg0, int[] arg1, int arg2);

    @OriginalMember(owner = "client!jaggl/OpenGL", name = "glNewList", descriptor = "(II)V")
    public static final native void glNewList(int arg0, int arg1);

    @OriginalMember(owner = "client!jaggl/OpenGL", name = "glShaderSourceARB", descriptor = "(JLjava/lang/String;)V")
    public static final native void glShaderSourceARB(long arg0, String arg1);

    @OriginalMember(owner = "client!jaggl/OpenGL", name = "glClearColor", descriptor = "(FFFF)V")
    public static final native void glClearColor(float arg0, float arg1, float arg2, float arg3);

    @OriginalMember(owner = "client!jaggl/OpenGL", name = "glPushMatrix", descriptor = "()V")
    public static final native void glPushMatrix();

    @OriginalMember(owner = "client!jaggl/OpenGL", name = "glBlitFramebufferEXT", descriptor = "(IIIIIIIIII)V")
    public static final native void glBlitFramebufferEXT(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9);

    @OriginalMember(owner = "client!jaggl/OpenGL", name = "glLineWidth", descriptor = "(F)V")
    public static final native void glLineWidth(float arg0);

    @OriginalMember(owner = "client!jaggl/OpenGL", name = "glLightModelfv", descriptor = "(I[FI)V")
    public static final native void glLightModelfv(int arg0, float[] arg1, int arg2);

    @OriginalMember(owner = "client!jaggl/OpenGL", name = "glColorPointer", descriptor = "(IIIJ)V")
    public static final native void glColorPointer(int arg0, int arg1, int arg2, long arg3);

    @OriginalMember(owner = "client!jaggl/OpenGL", name = "glProgramStringARB", descriptor = "(IILjava/lang/String;)V")
    public static final native void glProgramStringARB(int arg0, int arg1, String arg2);

    @OriginalMember(owner = "client!jaggl/OpenGL", name = "glUniformMatrix4fvARB", descriptor = "(IIZ[FI)V")
    public static final native void glUniformMatrix4fvARB(int arg0, int arg1, boolean arg2, float[] arg3, int arg4);

    @OriginalMember(owner = "client!jaggl/OpenGL", name = "glDrawBuffersARB", descriptor = "(I[II)V")
    public static final native void glDrawBuffersARB(int arg0, int[] arg1, int arg2);

    @OriginalMember(owner = "client!jaggl/OpenGL", name = "glLoadMatrixf", descriptor = "([FI)V")
    public static final native void glLoadMatrixf(float[] arg0, int arg1);

    @OriginalMember(owner = "client!jaggl/OpenGL", name = "glDeleteRenderbuffersEXT", descriptor = "(I[II)V")
    public static final native void glDeleteRenderbuffersEXT(int arg0, int[] arg1, int arg2);

    @OriginalMember(owner = "client!jaggl/OpenGL", name = "glUniform1fARB", descriptor = "(IF)V")
    public static final native void glUniform1fARB(int arg0, float arg1);

    @OriginalMember(owner = "client!jaggl/OpenGL", name = "glColor4f", descriptor = "(FFFF)V")
    public static final native void glColor4f(float arg0, float arg1, float arg2, float arg3);

    @OriginalMember(owner = "client!jaggl/OpenGL", name = "glFrustum", descriptor = "(DDDDDD)V")
    public static final native void glFrustum(double arg0, double arg1, double arg2, double arg3, double arg4, double arg5);

    @OriginalMember(owner = "client!jaggl/OpenGL", name = "glTexCoord3i", descriptor = "(III)V")
    public static final native void glTexCoord3i(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!jaggl/OpenGL", name = "glRasterPos2i", descriptor = "(II)V")
    public static final native void glRasterPos2i(int arg0, int arg1);

    @OriginalMember(owner = "client!jaggl/OpenGL", name = "glMultiTexCoord3i", descriptor = "(IIII)V")
    public static final native void glMultiTexCoord3i(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!jaggl/OpenGL", name = "glUniformMatrix2fvARB", descriptor = "(IIZ[FI)V")
    public static final native void glUniformMatrix2fvARB(int arg0, int arg1, boolean arg2, float[] arg3, int arg4);

    @OriginalMember(owner = "client!jaggl/OpenGL", name = "glTexImage2Di", descriptor = "(IIIIIIII[II)V")
    public static final native void glTexImage2Di(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int[] arg8, int arg9);

    @OriginalMember(owner = "client!jaggl/OpenGL", name = "glOrtho", descriptor = "(DDDDDD)V")
    public static final native void glOrtho(double arg0, double arg1, double arg2, double arg3, double arg4, double arg5);

    @OriginalMember(owner = "client!jaggl/OpenGL", name = "glShadeModel", descriptor = "(I)V")
    public static final native void glShadeModel(int arg0);

    @OriginalMember(owner = "client!jaggl/OpenGL", name = "glTexGeni", descriptor = "(III)V")
    public static final native void glTexGeni(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!jaggl/OpenGL", name = "glTexEnvfv", descriptor = "(II[FI)V")
    public static final native void glTexEnvfv(int arg0, int arg1, float[] arg2, int arg3);

    @OriginalMember(owner = "client!jaggl/OpenGL", name = "glReadPixelsi", descriptor = "(IIIIII[II)V")
    public static final native void glReadPixelsi(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int[] arg6, int arg7);

    @OriginalMember(owner = "client!jaggl/OpenGL", name = "glPopMatrix", descriptor = "()V")
    public static final native void glPopMatrix();

    @OriginalMember(owner = "client!jaggl/OpenGL", name = "glGetString", descriptor = "(I)Ljava/lang/String;")
    public static final native String glGetString(int arg0);

    @OriginalMember(owner = "client!jaggl/OpenGL", name = "glAlphaFunc", descriptor = "(IF)V")
    public static final native void glAlphaFunc(int arg0, float arg1);

    @OriginalMember(owner = "client!jaggl/OpenGL", name = "glProgramLocalParameter4fARB", descriptor = "(IIFFFF)V")
    public static final native void glProgramLocalParameter4fARB(int arg0, int arg1, float arg2, float arg3, float arg4, float arg5);

    @OriginalMember(owner = "client!jaggl/OpenGL", name = "glPointSize", descriptor = "(F)V")
    public static final native void glPointSize(float arg0);

    @OriginalMember(owner = "client!jaggl/OpenGL", name = "glTexParameterf", descriptor = "(IIF)V")
    public static final native void glTexParameterf(int arg0, int arg1, float arg2);

    @OriginalMember(owner = "client!jaggl/OpenGL", name = "glMaterialfv", descriptor = "(II[FI)V")
    public static final native void glMaterialfv(int arg0, int arg1, float[] arg2, int arg3);

    @OriginalMember(owner = "client!jaggl/OpenGL", name = "glGenProgramARB", descriptor = "()I")
    public static final native int glGenProgramARB();

    @OriginalMember(owner = "client!jaggl/OpenGL", name = "glAttachObjectARB", descriptor = "(JJ)V")
    public static final native void glAttachObjectARB(long arg0, long arg1);

    @OriginalMember(owner = "client!jaggl/OpenGL", name = "glVertexPointer", descriptor = "(IIIJ)V")
    public static final native void glVertexPointer(int arg0, int arg1, int arg2, long arg3);

    @OriginalMember(owner = "client!jaggl/OpenGL", name = "createPbuffer", descriptor = "(II)J")
    public final native long createPbuffer(int arg0, int arg1);

    @OriginalMember(owner = "client!jaggl/OpenGL", name = "glCopyTexSubImage2D", descriptor = "(IIIIIIII)V")
    public static final native void glCopyTexSubImage2D(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7);

    @OriginalMember(owner = "client!jaggl/OpenGL", name = "glDeleteLists", descriptor = "(II)V")
    public static final native void glDeleteLists(int arg0, int arg1);

    @OriginalMember(owner = "client!jaggl/OpenGL", name = "glShaderSourceRawARB", descriptor = "(J[B)V")
    public static final native void glShaderSourceRawARB(long arg0, byte[] arg1);

    @OriginalMember(owner = "client!jaggl/OpenGL", name = "release", descriptor = "()V")
    public final native void release();

    @OriginalMember(owner = "client!jaggl/OpenGL", name = "setSwapInterval", descriptor = "(I)V")
    public final native void setSwapInterval(int arg0);

    @OriginalMember(owner = "client!jaggl/OpenGL", name = "prepareSurface", descriptor = "(Ljava/awt/Canvas;)J")
    public final native long prepareSurface(Canvas arg0);

    @OriginalMember(owner = "client!jaggl/OpenGL", name = "glDepthFunc", descriptor = "(I)V")
    public static final native void glDepthFunc(int arg0);

    @OriginalMember(owner = "client!jaggl/OpenGL", name = "glDisable", descriptor = "(I)V")
    public static final native void glDisable(int arg0);

    @OriginalMember(owner = "client!jaggl/OpenGL", name = "glBindProgramARB", descriptor = "(II)V")
    public static final native void glBindProgramARB(int arg0, int arg1);

    @OriginalMember(owner = "client!jaggl/OpenGL", name = "glDisableClientState", descriptor = "(I)V")
    public static final native void glDisableClientState(int arg0);

    @OriginalMember(owner = "client!jaggl/OpenGL", name = "glCompileShaderARB", descriptor = "(J)V")
    public static final native void glCompileShaderARB(long arg0);

    @OriginalMember(owner = "client!jaggl/OpenGL", name = "glColor3ub", descriptor = "(BBB)V")
    public static final native void glColor3ub(byte arg0, byte arg1, byte arg2);

    @OriginalMember(owner = "client!jaggl/OpenGL", name = "glActiveTexture", descriptor = "(I)V")
    public static final native void glActiveTexture(int arg0);

    @OriginalMember(owner = "client!jaggl/OpenGL", name = "glTexImage2Df", descriptor = "(IIIIIIII[FI)V")
    public static final native void glTexImage2Df(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, float[] arg8, int arg9);

    @OriginalMember(owner = "client!jaggl/OpenGL", name = "b", descriptor = "()Z")
    public final synchronized boolean method3383() {
        if (this.field8039 == Thread.currentThread()) {
            this.detachPeer();
            field8040.remove(this.field8039);
            this.field8039 = null;
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!jaggl/OpenGL", name = "glVertex2i", descriptor = "(II)V")
    public static final native void glVertex2i(int arg0, int arg1);

    @OriginalMember(owner = "client!jaggl/OpenGL", name = "glColor3f", descriptor = "(FFF)V")
    public static final native void glColor3f(float arg0, float arg1, float arg2);

    @OriginalMember(owner = "client!jaggl/OpenGL", name = "glBindBufferARB", descriptor = "(II)V")
    public static final native void glBindBufferARB(int arg0, int arg1);

    @OriginalMember(owner = "client!jaggl/OpenGL", name = "glTexEnvi", descriptor = "(III)V")
    public static final native void glTexEnvi(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!jaggl/OpenGL", name = "glTexGenfv", descriptor = "(II[FI)V")
    public static final native void glTexGenfv(int arg0, int arg1, float[] arg2, int arg3);

    @OriginalMember(owner = "client!jaggl/OpenGL", name = "glGetUniformLocationARB", descriptor = "(JLjava/lang/String;)I")
    public static final native int glGetUniformLocationARB(long arg0, String arg1);

    @OriginalMember(owner = "client!jaggl/OpenGL", name = "glNormalPointer", descriptor = "(IIJ)V")
    public static final native void glNormalPointer(int arg0, int arg1, long arg2);

    @OriginalMember(owner = "client!jaggl/OpenGL", name = "glDrawArrays", descriptor = "(III)V")
    public static final native void glDrawArrays(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!jaggl/OpenGL", name = "glGetTexImagei", descriptor = "(IIII[II)V")
    public static final native void glGetTexImagei(int arg0, int arg1, int arg2, int arg3, int[] arg4, int arg5);

    @OriginalMember(owner = "client!jaggl/OpenGL", name = "glUniform1iARB", descriptor = "(II)V")
    public static final native void glUniform1iARB(int arg0, int arg1);

    @OriginalMember(owner = "client!jaggl/OpenGL", name = "glGenLists", descriptor = "(I)I")
    public static final native int glGenLists(int arg0);

    @OriginalMember(owner = "client!jaggl/OpenGL", name = "glClearDepth", descriptor = "(F)V")
    public static final native void glClearDepth(float arg0);

    @OriginalMember(owner = "client!jaggl/OpenGL", name = "glMultiTexCoord2i", descriptor = "(III)V")
    public static final native void glMultiTexCoord2i(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!jaggl/OpenGL", name = "glDrawElements", descriptor = "(IIIJ)V")
    public static final native void glDrawElements(int arg0, int arg1, int arg2, long arg3);

    @OriginalMember(owner = "client!jaggl/OpenGL", name = "glTexSubImage2Di", descriptor = "(IIIIIIII[II)V")
    public static final native void glTexSubImage2Di(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int[] arg8, int arg9);

    @OriginalMember(owner = "client!jaggl/OpenGL", name = "glTexImage2Dub", descriptor = "(IIIIIIII[BI)V")
    public static final native void glTexImage2Dub(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, byte[] arg8, int arg9);

    @OriginalMember(owner = "client!jaggl/OpenGL", name = "glGetProgramivARB", descriptor = "(II[II)V")
    public static final native void glGetProgramivARB(int arg0, int arg1, int[] arg2, int arg3);

    @OriginalMember(owner = "client!jaggl/OpenGL", name = "glColor4ub", descriptor = "(BBBB)V")
    public static final native void glColor4ub(byte arg0, byte arg1, byte arg2, byte arg3);

    @OriginalMember(owner = "client!jaggl/OpenGL", name = "glPixelStorei", descriptor = "(II)V")
    public static final native void glPixelStorei(int arg0, int arg1);

    @OriginalMember(owner = "client!jaggl/OpenGL", name = "glBufferSubDataARBa", descriptor = "(IIIJ)V")
    public static final native void glBufferSubDataARBa(int arg0, int arg1, int arg2, long arg3);

    @OriginalMember(owner = "client!jaggl/OpenGL", name = "glBindTexture", descriptor = "(II)V")
    public static final native void glBindTexture(int arg0, int arg1);

    @OriginalMember(owner = "client!jaggl/OpenGL", name = "glCopyPixels", descriptor = "(IIIII)V")
    public static final native void glCopyPixels(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!jaggl/OpenGL", name = "glGetError", descriptor = "()I")
    public static final native int glGetError();

    @OriginalMember(owner = "client!jaggl/OpenGL", name = "glDeleteBuffersARB", descriptor = "(I[II)V")
    public static final native void glDeleteBuffersARB(int arg0, int[] arg1, int arg2);

    @OriginalMember(owner = "client!jaggl/OpenGL", name = "glCreateShaderObjectARB", descriptor = "(I)J")
    public static final native long glCreateShaderObjectARB(int arg0);

    @OriginalMember(owner = "client!jaggl/OpenGL", name = "glHint", descriptor = "(II)V")
    public static final native void glHint(int arg0, int arg1);

    @OriginalMember(owner = "client!jaggl/OpenGL", name = "arePbuffersAvailable", descriptor = "()Z")
    public final native boolean arePbuffersAvailable();

    @OriginalMember(owner = "client!jaggl/OpenGL", name = "glGenBuffersARB", descriptor = "(I[II)V")
    public static final native void glGenBuffersARB(int arg0, int[] arg1, int arg2);

    @OriginalMember(owner = "client!jaggl/OpenGL", name = "glClientActiveTexture", descriptor = "(I)V")
    public static final native void glClientActiveTexture(int arg0);

    @OriginalMember(owner = "client!jaggl/OpenGL", name = "glEnable", descriptor = "(I)V")
    public static final native void glEnable(int arg0);

    @OriginalMember(owner = "client!jaggl/OpenGL", name = "surfaceResized", descriptor = "(J)V")
    public final native void surfaceResized(long arg0);

    @OriginalMember(owner = "client!jaggl/OpenGL", name = "glFramebufferTexture2DEXT", descriptor = "(IIIII)V")
    public static final native void glFramebufferTexture2DEXT(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!jaggl/OpenGL", name = "glEndList", descriptor = "()V")
    public static final native void glEndList();

    @OriginalMember(owner = "client!jaggl/OpenGL", name = "glCopyTexSubImage3D", descriptor = "(IIIIIIIII)V")
    public static final native void glCopyTexSubImage3D(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!jaggl/OpenGL", name = "glGenerateMipmapEXT", descriptor = "(I)V")
    public static final native void glGenerateMipmapEXT(int arg0);

    @OriginalMember(owner = "client!jaggl/OpenGL", name = "glMatrixMode", descriptor = "(I)V")
    public static final native void glMatrixMode(int arg0);

    @OriginalMember(owner = "client!jaggl/OpenGL", name = "glProgramLocalParameter4fvARB", descriptor = "(II[FI)V")
    public static final native void glProgramLocalParameter4fvARB(int arg0, int arg1, float[] arg2, int arg3);

    @OriginalMember(owner = "client!jaggl/OpenGL", name = "glPushAttrib", descriptor = "(I)V")
    public static final native void glPushAttrib(int arg0);

    @OriginalMember(owner = "client!jaggl/OpenGL", name = "glFlush", descriptor = "()V")
    public static final native void glFlush();

    @OriginalMember(owner = "client!jaggl/OpenGL", name = "glStencilFunc", descriptor = "(III)V")
    public static final native void glStencilFunc(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!jaggl/OpenGL", name = "glUniform2fARB", descriptor = "(IFF)V")
    public static final native void glUniform2fARB(int arg0, float arg1, float arg2);

    @OriginalMember(owner = "client!jaggl/OpenGL", name = "glMapBufferARB", descriptor = "(II)J")
    public static final native long glMapBufferARB(int arg0, int arg1);

    @OriginalMember(owner = "client!jaggl/OpenGL", name = "glFogfv", descriptor = "(I[FI)V")
    public static final native void glFogfv(int arg0, float[] arg1, int arg2);

    @OriginalMember(owner = "client!jaggl/OpenGL", name = "glDeleteTextures", descriptor = "(I[II)V")
    public static final native void glDeleteTextures(int arg0, int[] arg1, int arg2);

    @OriginalMember(owner = "client!jaggl/OpenGL", name = "glGetInfoLogARB", descriptor = "(JI[II[BI)V")
    public static final native void glGetInfoLogARB(long arg0, int arg1, int[] arg2, int arg3, byte[] arg4, int arg5);

    @OriginalMember(owner = "client!jaggl/OpenGL", name = "glRenderbufferStorageMultisampleEXT", descriptor = "(IIIII)V")
    public static final native void glRenderbufferStorageMultisampleEXT(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!jaggl/OpenGL", name = "glFinish", descriptor = "()V")
    public static final native void glFinish();

    @OriginalMember(owner = "client!jaggl/OpenGL", name = "glRotatef", descriptor = "(FFFF)V")
    public static final native void glRotatef(float arg0, float arg1, float arg2, float arg3);

    @OriginalMember(owner = "client!jaggl/OpenGL", name = "glDrawPixelsub", descriptor = "(IIII[BI)V")
    public static final native void glDrawPixelsub(int arg0, int arg1, int arg2, int arg3, byte[] arg4, int arg5);

    @OriginalMember(owner = "client!jaggl/OpenGL", name = "glTexImage3Dub", descriptor = "(IIIIIIIII[BI)V")
    public static final native void glTexImage3Dub(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, byte[] arg9, int arg10);

    @OriginalMember(owner = "client!jaggl/OpenGL", name = "glCallList", descriptor = "(I)V")
    public static final native void glCallList(int arg0);

    @OriginalMember(owner = "client!jaggl/OpenGL", name = "init", descriptor = "(Ljava/awt/Canvas;IIIIII)J")
    public final native long init(Canvas arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!jaggl/OpenGL", name = "glFogi", descriptor = "(II)V")
    public static final native void glFogi(int arg0, int arg1);

    @OriginalMember(owner = "client!jaggl/OpenGL", name = "glUniform4fARB", descriptor = "(IFFFF)V")
    public static final native void glUniform4fARB(int arg0, float arg1, float arg2, float arg3, float arg4);

    @OriginalMember(owner = "client!jaggl/OpenGL", name = "detachPeer", descriptor = "()V")
    private final native void detachPeer();

    @OriginalMember(owner = "client!jaggl/OpenGL", name = "glUniform3fARB", descriptor = "(IFFF)V")
    public static final native void glUniform3fARB(int arg0, float arg1, float arg2, float arg3);
}
