package deob;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

@ObfuscatedName("fp")
public final class class160 implements Runnable {

    @ObfuscatedName("fp.e")
    public InputStream field2248;

    @ObfuscatedName("fp.o")
    public Socket field2249;

    @ObfuscatedName("fp.m")
    public OutputStream field2252;

    @ObfuscatedName("fp.g")
    public boolean field2250 = false;

    @ObfuscatedName("fp.d")
    public class155 field2251;

    @ObfuscatedName("fp.b")
    public class154 field2247;

    @ObfuscatedName("fp.k")
    public byte[] field2253;

    @ObfuscatedName("fp.f")
    public int field2254 = 0;

    @ObfuscatedName("fp.j")
    public int field2255 = 0;

    @ObfuscatedName("fp.q")
    public boolean field2256 = false;

    public class160(Socket arg0, class155 arg1) throws IOException {
        this.field2251 = arg1;
        this.field2249 = arg0;
        this.field2249.setSoTimeout(30000);
        this.field2249.setTcpNoDelay(true);
        this.field2249.setReceiveBufferSize(16384);
        this.field2249.setSendBufferSize(16384);
        this.field2248 = this.field2249.getInputStream();
        this.field2252 = this.field2249.getOutputStream();
    }

    @ObfuscatedName("fp.e(B)V")
    public void method2721() {
        if (this.field2250) {
            return;
        }
        synchronized (this) {
            this.field2250 = true;
            this.notifyAll();
        }
        if (this.field2247 != null) {
            while (this.field2247.field2213 == 0) {
                class182.method1535(1L);
            }
            if (this.field2247.field2213 == 1) {
                try {
                    ((Thread) this.field2247.field2214).join();
                } catch (InterruptedException var4) {
                }
            }
        }
        this.field2247 = null;
    }

    public void finalize() {
        this.method2721();
    }

    @ObfuscatedName("fp.o(I)I")
    public int method2722() throws IOException {
        return this.field2250 ? 0 : this.field2248.read();
    }

    @ObfuscatedName("fp.m(I)I")
    public int method2723() throws IOException {
        return this.field2250 ? 0 : this.field2248.available();
    }

    @ObfuscatedName("fp.g([BIIS)V")
    public void method2724(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field2250) {
            return;
        }
        while (arg2 > 0) {
            int var4 = this.field2248.read(arg0, arg1, arg2);
            if (var4 <= 0) {
                throw new EOFException();
            }
            arg1 += var4;
            arg2 -= var4;
        }
    }

    @ObfuscatedName("fp.d([BIIB)V")
    public void method2725(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field2250) {
            return;
        }
        if (this.field2256) {
            this.field2256 = false;
            throw new IOException();
        }
        if (this.field2253 == null) {
            this.field2253 = new byte[5000];
        }
        synchronized (this) {
            for (int var5 = 0; var5 < arg2; var5++) {
                this.field2253[this.field2255] = arg0[arg1 + var5];
                this.field2255 = (this.field2255 + 1) % 5000;
                if ((this.field2254 + 4900) % 5000 == this.field2255) {
                    throw new IOException();
                }
            }
            if (this.field2247 == null) {
                this.field2247 = this.field2251.method2682(this, 3);
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
                        if (this.field2255 == this.field2254) {
                            if (this.field2250) {
                                break label84;
                            }
                            try {
                                this.wait();
                            } catch (InterruptedException var13) {
                            }
                        }
                        var3 = this.field2254;
                        if (this.field2255 >= this.field2254) {
                            var4 = this.field2255 - this.field2254;
                        } else {
                            var4 = 5000 - this.field2254;
                        }
                    }
                    if (var4 <= 0) {
                        continue;
                    }
                    try {
                        this.field2252.write(this.field2253, var3, var4);
                    } catch (IOException var12) {
                        this.field2256 = true;
                    }
                    this.field2254 = (this.field2254 + var4) % 5000;
                    try {
                        if (this.field2255 == this.field2254) {
                            this.field2252.flush();
                        }
                    } catch (IOException var11) {
                        this.field2256 = true;
                    }
                    continue;
                }
                try {
                    if (this.field2248 != null) {
                        this.field2248.close();
                    }
                    if (this.field2252 != null) {
                        this.field2252.close();
                    }
                    if (this.field2249 != null) {
                        this.field2249.close();
                    }
                } catch (IOException var10) {
                }
                this.field2253 = null;
                break;
            }
        } catch (Exception var15) {
            class153.method464((String) null, var15);
        }
    }
}
