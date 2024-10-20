package deob;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

@ObfuscatedName("fz")
public final class class160 implements Runnable {

    @ObfuscatedName("fz.d")
    public InputStream field2247;

    @ObfuscatedName("fz.q")
    public OutputStream field2241;

    @ObfuscatedName("fz.x")
    public Socket field2240;

    @ObfuscatedName("fz.y")
    public boolean field2243 = false;

    @ObfuscatedName("fz.e")
    public class155 field2242;

    @ObfuscatedName("fz.f")
    public class154 field2244;

    @ObfuscatedName("fz.v")
    public byte[] field2246;

    @ObfuscatedName("fz.t")
    public int field2245 = 0;

    @ObfuscatedName("fz.i")
    public int field2248 = 0;

    @ObfuscatedName("fz.r")
    public boolean field2249 = false;

    public class160(Socket arg0, class155 arg1) throws IOException {
        this.field2242 = arg1;
        this.field2240 = arg0;
        this.field2240.setSoTimeout(30000);
        this.field2240.setTcpNoDelay(true);
        this.field2240.setReceiveBufferSize(16384);
        this.field2240.setSendBufferSize(16384);
        this.field2247 = this.field2240.getInputStream();
        this.field2241 = this.field2240.getOutputStream();
    }

    @ObfuscatedName("fz.d(I)V")
    public void method2745() {
        if (this.field2243) {
            return;
        }
        synchronized (this) {
            this.field2243 = true;
            this.notifyAll();
        }
        if (this.field2244 != null) {
            while (this.field2244.field2197 == 0) {
                class182.method2253(1L);
            }
            if (this.field2244.field2197 == 1) {
                try {
                    ((Thread) this.field2244.field2205).join();
                } catch (InterruptedException var4) {
                }
            }
        }
        this.field2244 = null;
    }

    public void finalize() {
        this.method2745();
    }

    @ObfuscatedName("fz.q(B)I")
    public int method2734() throws IOException {
        return this.field2243 ? 0 : this.field2247.read();
    }

    @ObfuscatedName("fz.x(I)I")
    public int method2738() throws IOException {
        return this.field2243 ? 0 : this.field2247.available();
    }

    @ObfuscatedName("fz.y([BIII)V")
    public void method2735(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field2243) {
            return;
        }
        while (arg2 > 0) {
            int var4 = this.field2247.read(arg0, arg1, arg2);
            if (var4 <= 0) {
                throw new EOFException();
            }
            arg1 += var4;
            arg2 -= var4;
        }
    }

    @ObfuscatedName("fz.e([BIII)V")
    public void method2739(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field2243) {
            return;
        }
        if (this.field2249) {
            this.field2249 = false;
            throw new IOException();
        }
        if (this.field2246 == null) {
            this.field2246 = new byte[5000];
        }
        synchronized (this) {
            for (int var5 = 0; var5 < arg2; var5++) {
                this.field2246[this.field2248] = arg0[arg1 + var5];
                this.field2248 = (this.field2248 + 1) % 5000;
                if ((this.field2245 + 4900) % 5000 == this.field2248) {
                    throw new IOException();
                }
            }
            if (this.field2244 == null) {
                this.field2244 = this.field2242.method2686(this, 3);
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
                        if (this.field2248 == this.field2245) {
                            if (this.field2243) {
                                break label84;
                            }
                            try {
                                this.wait();
                            } catch (InterruptedException var13) {
                            }
                        }
                        var3 = this.field2245;
                        if (this.field2248 >= this.field2245) {
                            var4 = this.field2248 - this.field2245;
                        } else {
                            var4 = 5000 - this.field2245;
                        }
                    }
                    if (var4 <= 0) {
                        continue;
                    }
                    try {
                        this.field2241.write(this.field2246, var3, var4);
                    } catch (IOException var12) {
                        this.field2249 = true;
                    }
                    this.field2245 = (this.field2245 + var4) % 5000;
                    try {
                        if (this.field2248 == this.field2245) {
                            this.field2241.flush();
                        }
                    } catch (IOException var11) {
                        this.field2249 = true;
                    }
                    continue;
                }
                try {
                    if (this.field2247 != null) {
                        this.field2247.close();
                    }
                    if (this.field2241 != null) {
                        this.field2241.close();
                    }
                    if (this.field2240 != null) {
                        this.field2240.close();
                    }
                } catch (IOException var10) {
                }
                this.field2246 = null;
                break;
            }
        } catch (Exception var15) {
            class153.method158((String) null, var15);
        }
    }
}
