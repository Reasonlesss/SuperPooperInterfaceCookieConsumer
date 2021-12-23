package me.reasonless.something;

import java.util.Objects;

// SUPER POOPER INTERFACE COOKIE CONSUMER
// @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
// @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@ @@&@@@@@@@@@@@@@@@@
// @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
// @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@        @@@@@@@@@@@
// @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@             @@@@@@@@@
// @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@                 @@@@@@@
// @@@@@@@@@             &@@@@@@@@@@@@                  @@@@@@@
// @@@@@@@                 @@@@@@@@@@                    @@@@@@
// @@@@@/                   @ @@@@@@@                     @@@@@
// @@@@@                      @@@@@@            @         @@@@@
// @@@@            @          @@@@@@                      @@@@@
// @@@@                        @@@@@@                     @@@@@
// @@@@                        @@@@@@*                   @@@@@@
// @@@@@                      @@@@@@@@@                @@@  @@@
// @@@@@@@                   %@@@@@@@@@@   #     /  @@@@@  @@@@
// @@@@@@@@@@              @@@@@@@@@@@@@@@@     .@@@@@    @@@@@
// @@@@@  &@@@@@.  ,@   @@ @@@@@@@@@@@@@@@@@@@@@@@@%      @@@@@
// @@@@@@      @@@@@@@@@@@@@@@@@@@@@@@@@@@*@@@@@@        @@@@@@
// @@@@@@@        @@@@@@@@@ @@@@@@@@@@@@@@@@@  # @      @@@@@@@
// @@@@@@@@@        *@  @@@@@@@@@@@@@@@@#    @@@@@    @&@@@@@@@
// @@@@@@@@@@%     @@@@@  @@  /@,    @@  @@@@@@ @@@ @ @@@@@@@@@
// @@@@@@@@@@     @@@@@@@@@@ @@@@@@ @@@@ @@,@@@@ @@@@ @@@@@@@@@
// @@@@@@@@@@@@@   @@@ @@@@@@@@ @@@@@@@@@@@@@@  @ @@@@@@@@@@@@@
// @@@@@@@@@@@@@@@@       @@@@@@@@@@@@@@@     @@@@@@@@@@@@@@@@@
// @@@@@@@@@@@@@@@@@@@@  @   @@  @@@   @@@@@@@@@ @@@@@@@@@@@@@@
// @@@@@@@@@@@@@@@@@@@@& @@@@@@@@ @@@ @@@@@ @@@@@@@@@@@@@@@@@@@
// @@@@@@@@@@@@@@@@@@@@  @@@@@@@@@@@@@@@@@@ @@@@@@@@@@@@@@@@@@@
// @@@@@@@@@@@@@@@@@@@@  @@@@@@@@@@@@.@@@@@@@@@@@@@@@@@@@@@@@@@
// @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
// @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@

/**
 * y'all need to stop with this softcoding stuff:
 *
 *     You're generally referring to removing repeated code – and yes, this a good thing, normally. However,
 *     there are two issues with the attitude around this.
 *
 *     First, not every situation mandates this kind of code structure.
 *     This is especially true of smaller games made by newer developers.
 *     We shouldn't avoid adding certain QOL features simply because in a "properly" coded game it isn't necessary.
 *     This second point doesn't apply specifically to this conversation but I see it coming up frequently so here goes:
 *     a lot of people take this way too far.
 *
 *     I have seen so many plots where they do crazy things like spawn items on the ground to load information and whatnot.
 *     This is not good. Don't sacrifice code legibility and efficiency simply because they believe it makes coding experience easier.
 *     There is a delicate balance between well designed, easy to maintain, and efficient code.
 *     Softcoding is not always the way to achieve this balance. So please, just think about the systems
 *     you're designing and whether or not anything is actually improved.
 *
 * tl;dr  elitism through "better practice" / softcoding doesn't help, and often it isn't the right answer
 * @param <A> the type of A
 * @param <B> the type of B
 * @param <C> the type of C
 * @param <D> the type of D
 * @param <E> the type of E
 * @param <F> the type of F
 * @param <G> the type of G
 * @param <H> the type of H
 * @param <I> the type of I
 * @param <J> the type of J
 * @param <K> the type of K
 * @param <L> the type of L
 * @param <M> the type of M
 * @param <N> the type of N
 * @param <O> the type of O
 * @param <P> the type of P
 * @param <Q> the type of Q
 * @param <R> the type of R
 * @param <S> the type of S
 * @param <T> the type of T
 * @param <U> the type of U
 * @param <V> the type of V
 * @param <W> the type of W
 * @param <X> the type of X
 * @param <Y> the type of Y
 * @param <Z> the type of Z
 */
@FunctionalInterface
public interface SuperPooperInterfaceCookieConsumer<A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V, W, X, Y, Z> {

    /**
     * This is a big wall of text that explains quite literally nothing about
     * the world's first SuperPooperInterfaceCookieConsumer, it takes in the whole
     * alphabet and then forces an unpaid worker to consume the damn cookie.
     * @since 6.9
     */
    void accept(A a, B b, C c, D d, E e, F f, G g, H h, I i, J j, K k, L l, M m, N n,
                          O o, P p, Q q, R r, S s, T t, U u, V v, W w, X x, Y y, Z z);

    /**
     * i think it does something im not entirely sure to be honest.
     * StinkEyeCookie is best or something. Kotlin is bad, don't tell pdf.
     */
    default SuperPooperInterfaceCookieConsumer<A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V, W, X, Y, Z>
    andThen(SuperPooperInterfaceCookieConsumer<? super A, ? super B, ? super C, ? super D, ? super E, ? super F, ? super G, ? super H,
            ? super I, ? super J, ? super K, ? super L, ? super M, ? super N, ? super O, ? super P, ? super Q, ? super R, ? super S,
            ? super T, ? super U, ? super V, ? super W, ? super X, ? super Y, ? super Z> after) {
        Objects.requireNonNull(after);

        return (a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q, r, s, t, u, v, w, x, y, z) -> {
            accept(a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q, r, s, t, u, v, w, x, y, z);
            after.accept(a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q, r, s, t, u, v, w, x, y, z);
        };
    }

}
