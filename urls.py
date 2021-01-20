
from django.urls import path
from . import views



urlpatterns = [

    path('', views.home),
    path('log/', views.home),
    path('login/', views.login),
    path('responsive/', views.responsive),
    path('mastercontrol', views.mastercontrol),
    path('feed/', views.feed),
    path('login/mastercontrol/', views.mastercontrol),
    path('login/mastercontrol/feed/', views.feed), 
]

