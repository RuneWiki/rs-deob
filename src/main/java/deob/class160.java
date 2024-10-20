package deob;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

@ObfuscatedName("fe")
public final class class160 implements Runnable {

    @ObfuscatedName("fe.w")
    public InputStream field2256;

    @ObfuscatedName("fe.s")
    public OutputStream field2257;

    @ObfuscatedName("fe.q")
    public Socket field2258;

    @ObfuscatedName("fe.o")
    public boolean field2265 = false;

    @ObfuscatedName("fe.g")
    public class155 field2260;

    @ObfuscatedName("fe.v")
    public class154 field2261;

    @ObfuscatedName("fe.p")
    public byte[] field2262;

    @ObfuscatedName("fe.e")
    public int field2263 = 0;

    @ObfuscatedName("fe.d")
    public int field2264 = 0;

    @ObfuscatedName("fe.x")
    public boolean field2266 = false;

    public class160(Socket arg0, class155 arg1) throws IOException {
        this.field2260 = arg1;
        this.field2258 = arg0;
        this.field2258.setSoTimeout(30000);
        this.field2258.setTcpNoDelay(true);
        this.field2258.setReceiveBufferSize(16384);
        this.field2258.setSendBufferSize(16384);
        this.field2256 = this.field2258.getInputStream();
        this.field2257 = this.field2258.getOutputStream();
    }

    @ObfuscatedName("fe.w(B)V")
    public void method2789() {
        if (this.field2265) {
            return;
        }
        synchronized (this) {
            this.field2265 = true;
            this.notifyAll();
        }
        if (this.field2261 != null) {
            while (this.field2261.field2218 == 0) {
                class182.method1687(1L);
            }
            if (this.field2261.field2218 == 1) {
                try {
                    ((Thread) this.field2261.field2225).join();
                } catch (InterruptedException var4) {
                }
            }
        }
        this.field2261 = null;
    }

    public void finalize() {
        this.method2789();
    }

    @ObfuscatedName("fe.s(I)I")
    public int method2788() throws IOException {
        return this.field2265 ? 0 : this.field2256.read();
    }

    @ObfuscatedName("fe.q(I)I")
    public int method2791() throws IOException {
        return this.field2265 ? 0 : this.field2256.available();
    }

    @ObfuscatedName("fe.o([BIIB)V")
    public void method2805(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field2265) {
            return;
        }
        while (arg2 > 0) {
            int var4 = this.field2256.read(arg0, arg1, arg2);
            if (var4 <= 0) {
                throw new EOFException();
            }
            arg1 += var4;
            arg2 -= var4;
        }
    }

    @ObfuscatedName("fe.g([BIII)V")
    public void method2809(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field2265) {
            return;
        }
        if (this.field2266) {
            this.field2266 = false;
            throw new IOException();
        }
        if (this.field2262 == null) {
            this.field2262 = new byte[5000];
        }
        synchronized (this) {
            for (int var5 = 0; var5 < arg2; var5++) {
                this.field2262[this.field2264] = arg0[arg1 + var5];
                this.field2264 = (this.field2264 + 1) % 5000;
                if ((this.field2263 + 4900) % 5000 == this.field2264) {
                    throw new IOException();
                }
            }
            if (this.field2261 == null) {
                this.field2261 = this.field2260.method2746(this, 3);
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
                        if (this.field2264 == this.field2263) {
                            if (this.field2265) {
                                break label84;
                            }
                            try {
                                this.wait();
                            } catch (InterruptedException var13) {
                            }
                        }
                        var3 = this.field2263;
                        if (this.field2264 >= this.field2263) {
                            var4 = this.field2264 - this.field2263;
                        } else {
                            var4 = 5000 - this.field2263;
                        }
                    }
                    if (var4 <= 0) {
                        continue;
                    }
                    try {
                        this.field2257.write(this.field2262, var3, var4);
                    } catch (IOException var12) {
                        this.field2266 = true;
                    }
                    this.field2263 = (this.field2263 + var4) % 5000;
                    try {
                        if (this.field2264 == this.field2263) {
                            this.field2257.flush();
                        }
                    } catch (IOException var11) {
                        this.field2266 = true;
                    }
                    continue;
                }
                try {
                    if (this.field2256 != null) {
                        this.field2256.close();
                    }
                    if (this.field2257 != null) {
                        this.field2257.close();
                    }
                    if (this.field2258 != null) {
                        this.field2258.close();
                    }
                } catch (IOException var10) {
                }
                this.field2262 = null;
                break;
            }
        } catch (Exception var15) {
            class153.method611((String) null, var15);
        }
    }
}
