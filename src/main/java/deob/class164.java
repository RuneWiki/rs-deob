package deob;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

@ObfuscatedName("fy")
public final class class164 extends class160 implements Runnable {

    @ObfuscatedName("fy.f")
    public InputStream field2068;

    @ObfuscatedName("fy.l")
    public OutputStream field2067;

    @ObfuscatedName("fy.w")
    public Socket field2061;

    @ObfuscatedName("fy.s")
    public boolean field2062 = false;

    @ObfuscatedName("fy.e")
    public class157 field2064;

    @ObfuscatedName("fy.a")
    public class156 field2060;

    @ObfuscatedName("fy.c")
    public byte[] field2065;

    @ObfuscatedName("fy.p")
    public int field2066 = 0;

    @ObfuscatedName("fy.r")
    public int field2071 = 0;

    @ObfuscatedName("fy.m")
    public boolean field2070 = false;

    @ObfuscatedName("fy.d")
    public final int field2069;

    @ObfuscatedName("fy.z")
    public final int field2063;

    public class164(Socket arg0, class157 arg1, int arg2) throws IOException {
        this.field2064 = arg1;
        this.field2061 = arg0;
        this.field2069 = arg2;
        this.field2063 = arg2 - 100;
        this.field2061.setSoTimeout(30000);
        this.field2061.setTcpNoDelay(true);
        this.field2061.setReceiveBufferSize(65536);
        this.field2061.setSendBufferSize(65536);
        this.field2068 = this.field2061.getInputStream();
        this.field2067 = this.field2061.getOutputStream();
    }

    @ObfuscatedName("fy.p(I)V")
    public void method3113() {
        if (this.field2062) {
            return;
        }
        synchronized (this) {
            this.field2062 = true;
            this.notifyAll();
        }
        if (this.field2060 != null) {
            while (this.field2060.field2010 == 0) {
                class194.method1752(1L);
            }
            if (this.field2060.field2010 == 1) {
                try {
                    ((Thread) this.field2060.field2012).join();
                } catch (InterruptedException var4) {
                }
            }
        }
        this.field2060 = null;
    }

    public void finalize() {
        this.method3113();
    }

    @ObfuscatedName("fy.s(I)I")
    public int method3110() throws IOException {
        return this.field2062 ? 0 : this.field2068.read();
    }

    @ObfuscatedName("fy.w(I)I")
    public int method3108() throws IOException {
        return this.field2062 ? 0 : this.field2068.available();
    }

    @ObfuscatedName("fy.l(II)Z")
    public boolean method3119(int arg0) throws IOException {
        if (this.field2062) {
            return false;
        } else {
            return this.field2068.available() >= arg0;
        }
    }

    @ObfuscatedName("fy.e([BIIS)I")
    public int method3111(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field2062) {
            return 0;
        }
        int var4 = arg2;
        while (arg2 > 0) {
            int var5 = this.field2068.read(arg0, arg1, arg2);
            if (var5 <= 0) {
                throw new EOFException();
            }
            arg1 += var5;
            arg2 -= var5;
        }
        return var4;
    }

    @ObfuscatedName("fy.am([BIIB)V")
    public void method3147(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field2062) {
            return;
        }
        if (this.field2070) {
            this.field2070 = false;
            throw new IOException();
        }
        if (this.field2065 == null) {
            this.field2065 = new byte[this.field2069];
        }
        synchronized (this) {
            for (int var5 = 0; var5 < arg2; var5++) {
                this.field2065[this.field2071] = arg0[arg1 + var5];
                this.field2071 = (this.field2071 + 1) % this.field2069;
                if ((this.field2066 + this.field2063) % this.field2069 == this.field2071) {
                    throw new IOException();
                }
            }
            if (this.field2060 == null) {
                this.field2060 = this.field2064.method3077(this, 3);
            }
            this.notifyAll();
        }
    }

    public void run() {
        try {
            while (true) {
                label84: {
                    int var3;
                    int var4;
                    synchronized (this) {
                        if (this.field2071 == this.field2066) {
                            if (this.field2062) {
                                break label84;
                            }
                            try {
                                this.wait();
                            } catch (InterruptedException var13) {
                            }
                        }
                        var3 = this.field2066;
                        if (this.field2071 >= this.field2066) {
                            var4 = this.field2071 - this.field2066;
                        } else {
                            var4 = this.field2069 - this.field2066;
                        }
                    }
                    if (var4 <= 0) {
                        continue;
                    }
                    try {
                        this.field2067.write(this.field2065, var3, var4);
                    } catch (IOException var12) {
                        this.field2070 = true;
                    }
                    this.field2066 = (this.field2066 + var4) % this.field2069;
                    try {
                        if (this.field2071 == this.field2066) {
                            this.field2067.flush();
                        }
                    } catch (IOException var11) {
                        this.field2070 = true;
                    }
                    continue;
                }
                try {
                    if (this.field2068 != null) {
                        this.field2068.close();
                    }
                    if (this.field2067 != null) {
                        this.field2067.close();
                    }
                    if (this.field2061 != null) {
                        this.field2061.close();
                    }
                } catch (IOException var10) {
                }
                this.field2065 = null;
                break;
            }
        } catch (Exception var15) {
            class155.method2919((String) null, var15);
        }
    }

    @ObfuscatedName("fy.c([BIII)V")
    public void method3112(byte[] arg0, int arg1, int arg2) throws IOException {
        this.method3147(arg0, arg1, arg2);
    }
}
