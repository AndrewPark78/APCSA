package pong;
public interface Collidable
{
boolean didCollideLeft(Paddle obj);
boolean didCollideRight(Paddle obj);
boolean didCollideTop(Object obj);
boolean didCollideBottom(Object obj);
boolean didCollideSideLeft(Paddle obj);
boolean didCollideSideRight(Paddle obj);
}