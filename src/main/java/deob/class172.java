package deob;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

@ObfuscatedName("fe")
public final class class172 extends class306 implements Runnable {

    @ObfuscatedName("fe.c")
    public InputStream field2070;

    @ObfuscatedName("fe.t")
    public OutputStream field2067;

    @ObfuscatedName("fe.o")
    public Socket field2066;

    @ObfuscatedName("fe.e")
    public boolean field2073 = false;

    @ObfuscatedName("fe.i")
    public class167 field2062;

    @ObfuscatedName("fe.g")
    public class166 field2063;

    @ObfuscatedName("fe.d")
    public byte[] field2059;

    @ObfuscatedName("fe.l")
    public int field2065 = 0;

    @ObfuscatedName("fe.j")
    public int field2060 = 0;

    @ObfuscatedName("fe.m")
    public boolean field2058 = false;

    @ObfuscatedName("fe.p")
    public final int field2068;

    @ObfuscatedName("fe.h")
    public final int field2069;

    public class172(Socket arg0, class167 arg1, int arg2) throws IOException {
        this.field2062 = arg1;
        this.field2066 = arg0;
        this.field2068 = arg2;
        this.field2069 = arg2 - 100;
        this.field2066.setSoTimeout(30000);
        this.field2066.setTcpNoDelay(true);
        this.field2066.setReceiveBufferSize(65536);
        this.field2066.setSendBufferSize(65536);
        this.field2070 = this.field2066.getInputStream();
        this.field2067 = this.field2066.getOutputStream();
    }

    @ObfuscatedName("fe.c(I)V")
    public void method3269() {
        if (this.field2073) {
            return;
        }
        synchronized (this) {
            this.field2073 = true;
            this.notifyAll();
        }
        if (this.field2063 != null) {
            while (this.field2063.field2026 == 0) {
                class299.method4884(1L);
            }
            if (this.field2063.field2026 == 1) {
                try {
                    ((Thread) this.field2063.field2028).join();
                } catch (InterruptedException var4) {
                }
            }
        }
        this.field2063 = null;
    }

    public void finalize() {
        this.method3269();
    }

    @ObfuscatedName("fe.t(B)I")
    public int method3270() throws IOException {
        return this.field2073 ? 0 : this.field2070.read();
    }

    @ObfuscatedName("fe.o(I)I")
    public int method3295() throws IOException {
        return this.field2073 ? 0 : this.field2070.available();
    }

    @ObfuscatedName("fe.e(II)Z")
    public boolean method3288(int arg0) throws IOException {
        if (this.field2073) {
            return false;
        } else {
            return this.field2070.available() >= arg0;
        }
    }

    @ObfuscatedName("fe.i([BIII)I")
    public int method3284(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field2073) {
            return 0;
        }
        int var4 = arg2;
        while (arg2 > 0) {
            int var5 = this.field2070.read(arg0, arg1, arg2);
            if (var5 <= 0) {
                throw new EOFException();
            }
            arg1 += var5;
            arg2 -= var5;
        }
        return var4;
    }

    @ObfuscatedName("fe.g([BIII)V")
    public void method3273(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field2073) {
            return;
        }
        if (this.field2058) {
            this.field2058 = false;
            throw new IOException();
        }
        if (this.field2059 == null) {
            this.field2059 = new byte[this.field2068];
        }
        synchronized (this) {
            for (int var5 = 0; var5 < arg2; var5++) {
                this.field2059[this.field2060] = arg0[arg1 + var5];
                this.field2060 = (this.field2060 + 1) % this.field2068;
                if ((this.field2069 + this.field2065) % this.field2068 == this.field2060) {
                    throw new IOException();
                }
            }
            if (this.field2063 == null) {
                this.field2063 = this.field2062.method3238(this, 3);
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
                        if (this.field2065 == this.field2060) {
                            if (this.field2073) {
                                break label84;
                            }
                            try {
                                this.wait();
                            } catch (InterruptedException var13) {
                            }
                        }
                        var3 = this.field2065;
                        if (this.field2060 >= this.field2065) {
                            var4 = this.field2060 - this.field2065;
                        } else {
                            var4 = this.field2068 - this.field2065;
                        }
                    }
                    if (var4 <= 0) {
                        continue;
                    }
                    try {
                        this.field2067.write(this.field2059, var3, var4);
                    } catch (IOException var12) {
                        this.field2058 = true;
                    }
                    this.field2065 = (this.field2065 + var4) % this.field2068;
                    try {
                        if (this.field2065 == this.field2060) {
                            this.field2067.flush();
                        }
                    } catch (IOException var11) {
                        this.field2058 = true;
                    }
                    continue;
                }
                try {
                    if (this.field2070 != null) {
                        this.field2070.close();
                    }
                    if (this.field2067 != null) {
                        this.field2067.close();
                    }
                    if (this.field2066 != null) {
                        this.field2066.close();
                    }
                } catch (IOException var10) {
                }
                this.field2059 = null;
                break;
            }
        } catch (Exception var15) {
            Statics.method3817((String) null, var15);
        }
    }

    @ObfuscatedName("fe.d([BIII)V")
    public void method3274(byte[] arg0, int arg1, int arg2) throws IOException {
        this.method3273(arg0, arg1, arg2);
    }
}
